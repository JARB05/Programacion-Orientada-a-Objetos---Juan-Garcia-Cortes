package edu.juan.garcia.evidencia3.process;

import edu.juan.garcia.evidencia3.data.Board;
import edu.juan.garcia.evidencia3.data.Player;
import edu.juan.garcia.evidencia3.ui.Languages;

import java.util.Scanner;

/**
 * Gestiona la lógica del juego, incluyendo el flujo de juego, el cambio de turnos entre jugadores,
 * y la verificación de condiciones de victoria o empate.
 */
public class GameManager {
    private static final Scanner scanner = new Scanner(System.in);
    private Board board;
    private Player[] players;
    private int currentPlayerIndex;
    private PlayerLeaderboard leaderboard;

    /**
     * Constructor del GameManager.
     *
     * @param player1 El primer jugador.
     * @param player2 El segundo jugador, que puede ser otro jugador humano o una CPU.
     * @param leaderboard La tabla de líderes para registrar las victorias.
     */
    public GameManager(Player player1, Player player2, PlayerLeaderboard leaderboard) {
        this.board = new Board();
        this.players = new Player[]{player1, player2};
        this.currentPlayerIndex = (int) (Math.random() * 2); // Selecciona aleatoriamente el jugador inicial
        this.leaderboard = leaderboard;
    }

    /**
     * Inicia y controla el flujo del juego hasta que termina, ya sea por victoria de un jugador o por empate.
     * Gestiona los turnos de los jugadores, solicita y realiza movimientos, y verifica el estado del juego.
     */
    public void playGame() {
        this.board = new Board(); // Reinicia el tablero para un nuevo juego
        boolean gameEnded = false;
        while (!gameEnded) {
            board.displayBoard();
            Player currentPlayer = getCurrentPlayer();

            if (currentPlayer instanceof CPU) {
                // Realiza un movimiento automáticamente si el jugador actual es una CPU
                currentPlayer.makeMove(board);
            } else {
                // Solicita y procesa el movimiento de un jugador humano
                boolean validMove = false;
                while (!validMove) {
                    System.out.println(Languages.TURNO_DE + currentPlayer.getName() + " (" + currentPlayer.getSymbol() + ")");
                    System.out.print(Languages.INGRESAR_FILA);
                    int row = scanner.nextInt();
                    System.out.print(Languages.INGRESAR_COLUMNA);
                    int col = scanner.nextInt();
                    scanner.nextLine(); // Limpia el buffer del scanner

                    try {
                        board.makeMove(row, col, currentPlayer.getSymbol());
                        validMove = true;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }

            // Verifica si el juego ha terminado y actualiza el estado del juego y la tabla de líderes según corresponda
            if (board.hasWinner()) {
                board.displayBoard();
                System.out.println("¡" + currentPlayer.getName() + Languages.GANADOR);
                currentPlayer.incrementWins();
                leaderboard.addOrUpdatePlayer(currentPlayer);
                gameEnded = true;
            } else if (board.isBoardFull()) {
                board.displayBoard();
                System.out.println(Languages.EMPATE);
                gameEnded = true;
            } else {
                switchPlayer();
            }
        }
    }

    /**
     * Cambia el turno al siguiente jugador.
     */
    private void switchPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
    }

    /**
     * Obtiene el jugador actual cuyo turno es jugar.
     *
     * @return El jugador actual.
     */
    private Player getCurrentPlayer() {
        return players[currentPlayerIndex];
    }
}
