package edu.juan.garcia.evidencia3.data;

/**
 * Representa a un jugador en el juego de Gato (Tic-Tac-Toe).
 * Cada jugador tiene un nombre, un símbolo para marcar en el tablero y un contador de victorias.
 */
public class Player {
    private String name; // Nombre del jugador
    private char symbol; // Símbolo que representa al jugador en el tablero
    private int wins; // Número de victorias del jugador

    /**
     * Constructor para crear un nuevo jugador con un número inicial de victorias establecido en 0.
     *
     * @param name   El nombre del jugador.
     * @param symbol El símbolo que representa al jugador en el juego.
     */
    public Player(String name, char symbol) {
        this(name, symbol, 0); // Llama al constructor principal con 0 victorias
    }

    /**
     * Constructor principal que crea un nuevo jugador con un número de victorias especificado.
     *
     * @param name   El nombre del jugador.
     * @param symbol El símbolo que representa al jugador.
     * @param wins   El número inicial de victorias del jugador.
     */
    public Player(String name, char symbol, int wins) {
        setName(name);
        setSymbol(symbol);
        setWins(wins);
    }

    /**
     * Obtiene el nombre del jugador.
     *
     * @return El nombre del jugador.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del jugador. El nombre no puede ser nulo ni estar vacío.
     *
     * @param name El nombre del jugador.
     * @throws IllegalArgumentException Si el nombre es nulo o está vacío.
     */
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.name = name;
    }

    /**
     * Obtiene el símbolo del jugador.
     *
     * @return El símbolo del jugador.
     */
    public char getSymbol() {
        return symbol;
    }

    /**
     * Establece el símbolo del jugador.
     *
     * @param symbol El símbolo para representar al jugador en el tablero.
     */
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    /**
     * Obtiene el número de victorias del jugador.
     *
     * @return El número de victorias del jugador.
     */
    public int getWins() {
        return wins;
    }

    /**
     * Establece el número de victorias del jugador.
     * El número de victorias no puede ser negativo.
     *
     * @param wins El número de victorias del jugador.
     * @throws IllegalArgumentException Si el número de victorias es negativo.
     */
    public void setWins(int wins) {
        if (wins < 0) {
            throw new IllegalArgumentException("El número de victorias no puede ser negativo.");
        }
        this.wins = wins;
    }

    /**
     * Incrementa en uno el número de victorias del jugador.
     */
    public void incrementWins() {
        this.wins++;
    }

    /**
     * Realiza un movimiento en el tablero. Este método debe ser sobrescrito por clases hijas.
     *
     * @param board El tablero de juego donde se realizará el movimiento.
     */
    public void makeMove(Board board) {
        // Implementación específica en subclases si es necesario
    }
}