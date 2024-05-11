package edu.juan.garcia.evidencia3.ui;

import edu.juan.garcia.evidencia3.data.Player;
import edu.juan.garcia.evidencia3.process.CPU;
import edu.juan.garcia.evidencia3.process.GameManager;
import edu.juan.garcia.evidencia3.process.PlayerLeaderboard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CLI {
    private static final Scanner scanner = new Scanner(System.in);
    private static PlayerLeaderboard leaderboard = new PlayerLeaderboard();
    private static final List<Character> availableSymbols = new ArrayList<>();

    static {
        availableSymbols.add('♠');
        availableSymbols.add('♣');
        availableSymbols.add('♥');
        availableSymbols.add('♦');
        availableSymbols.add('★');
        availableSymbols.add('☆');
        availableSymbols.add('☺');
        availableSymbols.add('☻');
        availableSymbols.add('O');
        availableSymbols.add('X');
    }

    private static void selectLanguage() {
        System.out.println("Seleccione el idioma / Select the language / Выберите язык:");
        System.out.println("1. Español");
        System.out.println("2. English");
        System.out.println("3. Русский");
        System.out.print("Opción / Option / Выбор: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer del scanner

        switch (choice) {
            case 1:
                Languages.getInstance("ESP");
                break;
            case 2:
                Languages.getInstance("ENG");
                break;
            case 3:
                Languages.getInstance("RU");
                break;
            default:
                System.out.println("Opción no válida. Seleccionando Español por defecto.");
                Languages.getInstance("ESP");
        }
    }

    private static void printWelcome() {
        System.out.println(Languages.BIENVENIDA);
    }

    private static String promptForPlayerName(int playerNumber) {
        System.out.print(Languages.NOMBRES + playerNumber + ": ");
        return scanner.nextLine().trim();
    }

    private static char promptForPlayerSymbol(String playerName) {
        System.out.println("\nSímbolos disponibles:");
        for (int i = 0; i < availableSymbols.size(); i++) {
            System.out.println((i + 1) + ". " + availableSymbols.get(i));
        }
        System.out.print("Seleccione el símbolo para " + playerName + ": ");
        int choice = scanner.nextInt() - 1;
        scanner.nextLine(); // Limpia el buffer del scanner
        char symbol = availableSymbols.get(choice);
        availableSymbols.remove(choice); // Elimina el símbolo seleccionado de los disponibles
        return symbol;
    }

    private static boolean promptForGameMode() {
        System.out.println("\nElige el modo de juego:");
        System.out.println("1. Jugador vs Jugador");
        System.out.println("2. Jugador vs CPU");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer del scanner
        return choice == 2;
    }

    private static boolean promptForNewGame() {
        System.out.println("\n¿Jugar otra vez? (s/n): ");
        String response = scanner.nextLine().trim().toLowerCase();
        return "s".equals(response);
    }

    private static void showLeaderboard() {
        System.out.println("\nTabla de Líderes:");
        List<Player> leaders = leaderboard.getLeaderboard();
        if (leaders.isEmpty()) {
            System.out.println("La tabla de líderes está vacía.\n");
            return;
        }
        leaders.forEach(player -> System.out.println(player.getName() + " - Símbolo: " + player.getSymbol() + " - Victorias: " + player.getWins()));
    }

    public static void playGame() {
        printWelcome();
        boolean isCpuMode = promptForGameMode();

        Player player1 = new Player(promptForPlayerName(1), promptForPlayerSymbol("Jugador 1"));
        Player player2;

        if (isCpuMode) {
            player2 = new CPU("CPU", promptForPlayerSymbol("CPU"));
        } else {
            player2 = new Player(promptForPlayerName(2), promptForPlayerSymbol("Jugador 2"));
        }

        GameManager gameManager = new GameManager(player1, player2, leaderboard);

        do {
            gameManager.playGame();
        } while (promptForNewGame());

        showLeaderboard();
    }

    public static void launchApp() {
        do {
            selectLanguage();
            playGame();
        } while (promptForNewGame());

        System.out.println("\nGracias por jugar. ¡Hasta la próxima!\n");
    }
}