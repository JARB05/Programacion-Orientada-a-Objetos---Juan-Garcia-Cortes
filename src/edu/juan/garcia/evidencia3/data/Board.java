package edu.juan.garcia.evidencia3.data;

/**
 * Clase que representa el tablero de juego para el juego de Gato (Tic-Tac-Toe).
 * El tablero es de tamaño 3x3 y puede contener los símbolos de los jugadores o estar vacío.
 */
public class Board {

    /** Tamaño del tablero (3x3). */
    public static final int BOARD_SIZE = 3;

    /** Matriz para representar el estado del tablero. */
    private char[][] board;

    /**
     * Constructor que inicializa el tablero de juego con todas las celdas vacías.
     */
    public Board() {
        this.board = new char[BOARD_SIZE][BOARD_SIZE];
        initializeBoard();
    }

    /**
     * Inicializa el tablero llenándolo con espacios en blanco para indicar que todas las celdas están vacías.
     */
    private void initializeBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                this.board[i][j] = ' ';
            }
        }
    }

    /**
     * Muestra el tablero actual en la consola.
     */
    public void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    /**
     * Comprueba si una celda específica está vacía.
     *
     * @param row La fila de la celda a comprobar.
     * @param col La columna de la celda a comprobar.
     * @return true si la celda está vacía, false en caso contrario.
     */
    public boolean isCellEmpty(int row, int col) {
        return board[row][col] == ' ';
    }

    /**
     * Realiza un movimiento en el tablero, colocando el símbolo del jugador en la celda especificada.
     *
     * @param row La fila donde se realizará el movimiento.
     * @param col La columna donde se realizará el movimiento.
     * @param symbol El símbolo del jugador que realiza el movimiento.
     * @throws IllegalArgumentException Si la celda no está vacía.
     */
    public void makeMove(int row, int col, char symbol) {
        // Permitir "deshacer" un movimiento si el símbolo es ' ' (esto es para el minimax)
        if (symbol == ' ' || isCellEmpty(row, col)) {
            board[row][col] = symbol;
        } else {
            throw new IllegalArgumentException("La celda ya está ocupada.");
        }
    }

    /**
     * Comprueba si el tablero está completamente lleno.
     *
     * @return true si el tablero está lleno, false en caso contrario.
     */
    public boolean isBoardFull() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Comprueba si hay un ganador en el tablero.
     *
     * @return true si hay un ganador, false en caso contrario.
     */
    public boolean hasWinner() {
        // Verificar filas y columnas
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true;
            }
        }
        // Verificar diagonales
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }
        return false;
    }

    /**
     * Obtiene el símbolo del ganador del juego, si lo hay.
     *
     * @return El símbolo del ganador ('X' o 'O'), o '\0' si no hay ganador aún.
     */
    //Para el minimax
    public char getWinningSymbol(){
        // Verificar filas
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0];
            }
        }

        // Verificar columnas
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return board[0][i];
            }
        }

        // Verificar diagonal principal.
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0];
        }

        // Verificar diagonal secundaria
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2];
        }

        // No hay ganador aún
        return '\0';
    }
}