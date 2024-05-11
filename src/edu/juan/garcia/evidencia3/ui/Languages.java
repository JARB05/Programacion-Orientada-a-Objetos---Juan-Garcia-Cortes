package edu.juan.garcia.evidencia3.ui;

public class Languages {
    public static String BIENVENIDA;
    public static String NOMBRES;
    public static String SIMBOLOS;
    public static String INICIO_JUEGO;
    public static String JUGAR_DE_NUEVO;
    public static String GANADOR;
    public static String SIMBOLO;
    public static String VICTORIAS;
    public static String POSICION_INVALIDA;
    public static String EMPATE;
    public static String JUGAR;
    public static String TABLA_LIDERES;
    public static String TURNO_DE;
    public static String INGRESAR_FILA;
    public static String INGRESAR_COLUMNA;
    public static String ERROR_ARCHIVO_LIDERES;
    public static String ERROR_CARGAR_LIDERES;
    public static String ERROR_GUARDAR_LIDERES;

    public static void getInstance(String language) {
        Textos opcion = Textos.valueOf(language.toUpperCase());
        switch (opcion) {

            case ESP:
                BIENVENIDA = "\nBienvenido al juego de Gato!\n";
                NOMBRES = "Ingrese el nombre del Jugador %d: ";
                SIMBOLOS = "\nSímbolos disponibles:";
                INICIO_JUEGO = "\nElige el modo de juego:\n1. Jugador vs Jugador\n2. Jugador vs CPU";
                JUGAR_DE_NUEVO = "\n¿Jugar otra vez? (s/n): ";
                GANADOR = "¡%s gana!";
                SIMBOLO = " - Símbolo: ";
                VICTORIAS = " - Victorias: ";
                POSICION_INVALIDA = "Posición inválida. Inténtalo de nuevo.";
                EMPATE = "¡Es un empate!";
                JUGAR = "Seleccione el símbolo para %s: ";
                TABLA_LIDERES = "\nTabla de Líderes:";
                TURNO_DE = "Turno de %s (%s)";
                INGRESAR_FILA = "Ingrese fila (0-2): ";
                INGRESAR_COLUMNA = "Ingrese columna (0-2): ";
                ERROR_ARCHIVO_LIDERES = "No se encontró el archivo de la tabla de líderes. Se creará uno nuevo.";
                ERROR_CARGAR_LIDERES = "Error al cargar la tabla de líderes: ";
                ERROR_GUARDAR_LIDERES = "Error al guardar la tabla de líderes: ";
                break;

            case ENG:
                BIENVENIDA = "\nWelcome to Tic-Tac-Toe!\n";
                NOMBRES = "Enter Player %d's name: ";
                SIMBOLOS = "\nAvailable symbols:";
                INICIO_JUEGO = "\nChoose the game mode:\n1. Player vs Player\n2. Player vs CPU";
                JUGAR_DE_NUEVO = "\nPlay again? (y/n): ";
                GANADOR = "%s wins!";
                SIMBOLO = " - Symbol: ";
                VICTORIAS = " - Wins: ";
                POSICION_INVALIDA = "Invalid position. Try again.";
                EMPATE = "It's a draw!";
                JUGAR = "Select a symbol for %s: ";
                TABLA_LIDERES = "\nLeaderboard:";
                TURNO_DE = "%s's turn (%s)";
                INGRESAR_FILA = "Enter row (0-2): ";
                INGRESAR_COLUMNA = "Enter column (0-2): ";
                ERROR_ARCHIVO_LIDERES = "Leaderboard file not found. A new one will be created.";
                ERROR_CARGAR_LIDERES = "Error loading the leaderboard: ";
                ERROR_GUARDAR_LIDERES = "Error saving the leaderboard: ";
                break;

            case RU:
                BIENVENIDA = "\nДобро пожаловать в игру Крестики-Нолики!\n";
                NOMBRES = "Введите имя игрока %d: ";
                SIMBOLOS = "\nДоступные символы:";
                INICIO_JUEGO = "\nВыберите режим игры:\n1. Игрок против игрока\n2. Игрок против CPU";
                JUGAR_DE_NUEVO = "\nИграть снова? (д/н): ";
                GANADOR = "%s выигрывает!";
                SIMBOLO = " - Символ: ";
                VICTORIAS = " - Победы: ";
                POSICION_INVALIDA = "Неверная позиция. Попробуйте снова.";
                EMPATE = "Ничья!";
                JUGAR = "Выберите символ для %s: ";
                TABLA_LIDERES = "\nТаблица лидеров:";
                TURNO_DE = "Ход игрока %s (%s)";
                INGRESAR_FILA = "Введите строку (0-2): ";
                INGRESAR_COLUMNA = "Введите столбец (0-2): ";
                ERROR_ARCHIVO_LIDERES = "Файл таблицы лидеров не найден. Будет создан новый.";
                ERROR_CARGAR_LIDERES = "Ошибка загрузки таблицы лидеров: ";
                ERROR_GUARDAR_LIDERES = "Ошибка сохранения таблицы лидеров: ";
                break;

            default:
                throw new IllegalArgumentException("Invalid language selection");
        }
    }

    private enum Textos {
        ESP, ENG, RU
    }
}
