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
    public static String AFIRMATIVO;
    public static String NEGATIVO;
    public static String TABLA_VACIA;
    public static String DESPEDIDA;
    public static String JUGADOR_1;
    public static String JUGADOR_2;
    public static String LENGUAGE_INVALIDO;

    public static void getInstance(String language) {
        Textos opcion = Textos.valueOf(language.toUpperCase());
        switch (opcion) {

            case ESP:
                BIENVENIDA = "\nBienvenido al juego de Gato!\n";
                NOMBRES = "\nIngrese el nombre del Jugador ";
                SIMBOLOS = "\nSímbolos disponibles:";
                INICIO_JUEGO = "Elige el modo de juego:\n1. Jugador vs Jugador\n2. Jugador vs CPU";
                JUGAR_DE_NUEVO = "\n¿Jugar otra vez? (s/n): ";
                GANADOR = " gana!";
                SIMBOLO = " - Símbolo: ";
                VICTORIAS = " - Victorias: ";
                POSICION_INVALIDA = "Posición inválida. Inténtalo de nuevo.";
                EMPATE = "¡Es un empate!";
                JUGAR = "Seleccione el símbolo para ";
                TABLA_LIDERES = "\nTabla de Líderes:";
                TURNO_DE = "Turno de ";
                INGRESAR_FILA = "Ingrese fila (0-2): ";
                INGRESAR_COLUMNA = "Ingrese columna (0-2): ";
                ERROR_ARCHIVO_LIDERES = "No se encontró el archivo de la tabla de líderes. Se creará uno nuevo.";
                ERROR_CARGAR_LIDERES = "Error al cargar la tabla de líderes: ";
                ERROR_GUARDAR_LIDERES = "Error al guardar la tabla de líderes: ";
                AFIRMATIVO = "s";
                NEGATIVO = "n";
                TABLA_VACIA = "La tabla de líderes está vacía.\n";
                DESPEDIDA = "\nGracias por jugar. ¡Hasta la próxima!\n";
                JUGADOR_1 = "Jugador 1";
                JUGADOR_2 = "Jugador 2";
                LENGUAGE_INVALIDO = "Selección de lenguaje invalido.";
                break;

            case ENG:
                BIENVENIDA = "\nWelcome to Tic-Tac-Toe!\n";
                NOMBRES = "\nEnter Player's name: ";
                SIMBOLOS = "\nAvailable symbols:";
                INICIO_JUEGO = "Choose the game mode:\n1. Player vs Player\n2. Player vs CPU";
                JUGAR_DE_NUEVO = "\nPlay again? (y/n): ";
                GANADOR = " wins!";
                SIMBOLO = " - Symbol: ";
                VICTORIAS = " - Wins: ";
                POSICION_INVALIDA = "Invalid position. Try again.";
                EMPATE = "It's a draw!";
                JUGAR = "Select a symbol for ";
                TABLA_LIDERES = "\nLeaderboard:";
                TURNO_DE = "It's ";
                INGRESAR_FILA = "Enter row (0-2): ";
                INGRESAR_COLUMNA = "Enter column (0-2): ";
                ERROR_ARCHIVO_LIDERES = "Leaderboard file not found. A new one will be created.";
                ERROR_CARGAR_LIDERES = "Error loading the leaderboard: ";
                ERROR_GUARDAR_LIDERES = "Error saving the leaderboard: ";
                AFIRMATIVO = "y";
                NEGATIVO = "n";
                TABLA_VACIA = "The leaderboard is empty.\n";
                DESPEDIDA = "\nThank you for playing. See you next time!\n";
                JUGADOR_1 = "Player 1";
                JUGADOR_2 = "Player 2";
                LENGUAGE_INVALIDO = "Invalid language selection.";
                break;

            case RU:
                BIENVENIDA = "\nДобро пожаловать в игру Крестики-Нолики!\n";
                NOMBRES = "\nВведите имя игрока: ";
                SIMBOLOS = "\nДоступные символы:";
                INICIO_JUEGO = "Выберите режим игры:\n1. Игрок против игрока\n2. Игрок против CPU";
                JUGAR_DE_NUEVO = "\nИграть снова? (д/н): ";
                GANADOR = " выигрывает!";
                SIMBOLO = " - Символ: ";
                VICTORIAS = " - Победы: ";
                POSICION_INVALIDA = "Неверная позиция. Попробуйте снова.";
                EMPATE = "Ничья!";
                JUGAR = "Выберите символ для ";
                TABLA_LIDERES = "\nТаблица лидеров:";
                TURNO_DE = "Ход ";
                INGRESAR_FILA = "Введите строку (0-2): ";
                INGRESAR_COLUMNA = "Введите столбец (0-2): ";
                ERROR_ARCHIVO_LIDERES = "Файл таблицы лидеров не найден. Будет создан новый.";
                ERROR_CARGAR_LIDERES = "Ошибка загрузки таблицы лидеров: ";
                ERROR_GUARDAR_LIDERES = "Ошибка сохранения таблицы лидеров: ";
                AFIRMATIVO = "д";
                NEGATIVO = "н";
                TABLA_VACIA = "Таблица лидеров пуста.\n";
                DESPEDIDA = "\nСпасибо за игру. До следующего раза!\n";
                JUGADOR_1 = "Игрок 1";
                JUGADOR_2 = "Игрок 2";
                LENGUAGE_INVALIDO = "Неверный выбор языка.";
                break;

            default:
                throw new IllegalArgumentException(LENGUAGE_INVALIDO);
        }
    }

    private enum Textos {
        ESP, ENG, RU
    }
}
