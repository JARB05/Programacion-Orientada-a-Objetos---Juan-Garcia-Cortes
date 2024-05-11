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
        System.out.println(Languages.SIMBOLOS);
        for (int i = 0; i < availableSymbols.size(); i++) {
            System.out.println((i + 1) + ". " + availableSymbols.get(i));
        }
        System.out.print(Languages.JUGAR + playerName + " : ");
        int choice = scanner.nextInt() - 1;
        scanner.nextLine(); // Limpia el buffer del scanner
        char symbol = availableSymbols.get(choice);
        availableSymbols.remove(choice); // Elimina el símbolo seleccionado de los disponibles
        return symbol;
    }

    private static boolean promptForGameMode() {
        System.out.println(Languages.INICIO_JUEGO);
        int choice = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer del scanner
        return choice == 2;
    }

    private static boolean promptForNewGame() {
        System.out.println(Languages.JUGAR_DE_NUEVO);
        String response = scanner.nextLine().trim().toLowerCase();
        return Languages.AFIRMATIVO.equalsIgnoreCase(response);
    }

    private static void showLeaderboard() {
        System.out.println(Languages.TABLA_LIDERES);
        List<Player> leaders = leaderboard.getLeaderboard();
        if (leaders.isEmpty()) {
            System.out.println(Languages.TABLA_VACIA);
            return;
        }
        leaders.forEach(player -> System.out.println(player.getName() + Languages.SIMBOLO + player.getSymbol() + Languages.VICTORIAS + player.getWins()));
    }

    public static void playGame() {
        printWelcome();
        boolean isCpuMode = promptForGameMode();

        Player player1 = new Player(promptForPlayerName(1), promptForPlayerSymbol(Languages.JUGADOR_1));
        Player player2;

        if (isCpuMode) {
            player2 = new CPU("CPU", promptForPlayerSymbol("CPU"));
        } else {
            player2 = new Player(promptForPlayerName(2), promptForPlayerSymbol(Languages.JUGADOR_2));
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

        System.out.println(Languages.DESPEDIDA);
    }
}