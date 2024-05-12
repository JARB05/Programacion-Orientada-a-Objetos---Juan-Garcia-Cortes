package edu.juan.garcia.evidencia3.process;

import edu.juan.garcia.evidencia3.data.Board;
import edu.juan.garcia.evidencia3.data.Player;

/**
 * Representa un jugador CPU (inteligencia artificial) en el juego.
 * Utiliza el algoritmo Minimax para determinar el mejor movimiento posible.
 */
public class CPU extends Player {

    /**
     * Constructor para crear un nuevo jugador CPU.
     *
     * @param name   El nombre del jugador CPU.
     * @param symbol El símbolo asignado al jugador CPU.
     */
    public CPU(String name, char symbol) {
        super(name, symbol);
    }

    /**
     * Realiza un movimiento en el tablero utilizando el algoritmo Minimax.
     *
     * @param board El tablero de juego actual.
     */
    @Override
    public void makeMove(Board board) {
        int[] move = minimax(board, getSymbol(), 0, true);
        if (move[1] != -1 && move[2] != -1) {
            board.makeMove(move[1], move[2], getSymbol());
        }
    }

    /**
     * Implementación del algoritmo Minimax para determinar el mejor movimiento.
     * Este método se llama recursivamente para explorar todos los posibles movimientos y sus resultados,
     * calificando cada estado del tablero para tomar la decisión óptima.
     *
     * @param board         El tablero de juego actual.
     * @param playerSymbol  El símbolo del jugador actual.
     * @param depth         La profundidad actual en el árbol de juego.
     * @param isMaximizing  Indica si el jugador actual está maximizando o minimizando el puntaje.
     * @return Un arreglo de tres enteros: el mejor puntaje calculado, la fila y la columna del mejor movimiento.
     */
    private int[] minimax(Board board, char playerSymbol, int depth, boolean isMaximizing) {
        char opponentSymbol = (playerSymbol == 'X') ? 'O' : 'X';
        if (board.hasWinner()) {
            return new int[]{(board.getWinningSymbol() == this.getSymbol()) ? 10 - depth : depth - 10, -1, -1};
        } else if (board.isBoardFull()) {
            return new int[]{0, -1, -1}; // Empate
        }

        int bestScore = isMaximizing ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        int bestRow = -1;
        int bestCol = -1;

        for (int row = 0; row < Board.BOARD_SIZE; row++) {
            for (int col = 0; col < Board.BOARD_SIZE; col++) {
                if (board.isCellEmpty(row, col)) {
                    board.makeMove(row, col, playerSymbol); // Realiza un movimiento hipotético
                    int score = minimax(board, opponentSymbol, depth + 1, !isMaximizing)[0];
                    board.makeMove(row, col, ' '); // Deshace el movimiento hipotético

                    if ((isMaximizing && score > bestScore) || (!isMaximizing && score < bestScore)) {
                        bestScore = score;
                        bestRow = row;
                        bestCol = col;
                    }
                }
            }
        }

        return new int[]{bestScore, bestRow, bestCol};
    }
}
