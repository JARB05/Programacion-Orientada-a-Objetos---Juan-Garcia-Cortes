package edu.juan.garcia.evidencia3.process;

import edu.juan.garcia.evidencia3.data.Board;
import edu.juan.garcia.evidencia3.data.Player;

public class CPU extends Player {
    public CPU(String name, char symbol) {
        super(name, symbol);
    }

    @Override
    public void makeMove(Board board) {
        int[] move = minimax(board, getSymbol(), 0, true);
        if (move[1] != -1 && move[2] != -1) {
            board.makeMove(move[1], move[2], getSymbol());
        }
    }

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
