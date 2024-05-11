package edu.juan.garcia.evidencia3.process;

import edu.juan.garcia.evidencia3.data.Board;
import edu.juan.garcia.evidencia3.data.Player;

import java.util.Scanner;

public class GameManager {
    private static final Scanner scanner = new Scanner(System.in);
    private Board board;
    private Player[] players;
    private int currentPlayerIndex;
    private PlayerLeaderboard leaderboard;

    public GameManager(Player player1, Player player2, PlayerLeaderboard leaderboard) {
        this.board = new Board();
        this.players = new Player[]{player1, player2};
        this.currentPlayerIndex = (int) (Math.random() * 2);
        this.leaderboard = leaderboard;
    }

    public void playGame() {
        this.board = new Board(); // Reinicia el tablero
        boolean gameEnded = false;
        while (!gameEnded) {
            board.displayBoard();
            Player currentPlayer = getCurrentPlayer();

            if (currentPlayer instanceof CPU) {
                // Si el jugador actual es una CPU, realiza su movimiento automáticamente
                currentPlayer.makeMove(board);
            } else {
                // Si el jugador actual es humano, solicita su movimiento
                boolean validMove = false;
                while (!validMove) {
                    System.out.println("Turno de " + currentPlayer.getName() + " (" + currentPlayer.getSymbol() + ")");
                    System.out.print("Ingrese fila (0-2): ");
                    int row = scanner.nextInt();
                    System.out.print("Ingrese columna (0-2): ");
                    int col = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea

                    try {
                        board.makeMove(row, col, currentPlayer.getSymbol());
                        validMove = true;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }

            // Verificar si el juego ha terminado
            if (board.hasWinner()) {
                board.displayBoard();
                System.out.println("¡" + currentPlayer.getName() + " gana!");
                currentPlayer.incrementWins();
                leaderboard.addOrUpdatePlayer(currentPlayer); // Actualiza la tabla de líderes
                gameEnded = true;
            } else if (board.isBoardFull()) {
                board.displayBoard();
                System.out.println("¡Es un empate!");
                gameEnded = true;
            } else {
                switchPlayer();
            }
        }
    }

    private void switchPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
    }

    private Player getCurrentPlayer() {
        return players[currentPlayerIndex];
    }
}
