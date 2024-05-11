package edu.juan.garcia.evidencia3.process;

import edu.juan.garcia.evidencia3.data.Player;
import edu.juan.garcia.evidencia3.ui.Languages;

import java.io.*;
import java.util.*;

public class PlayerLeaderboard {
    private static final String LEADERBOARD_FILE_PATH = "C:\\Users\\user\\IdeaProjects\\Programacion-Orientada-a-Objetos---Juan-Garcia-Cortes\\src\\edu\\juan\\garcia\\evidencia3\\resources\\PlayerLeaderboard.txt";
    private List<Player> leaderboard;

    public PlayerLeaderboard() {
        leaderboard = new ArrayList<>();
        loadLeaderboard();
    }

    public void addOrUpdatePlayer(Player player) {
        Player existingPlayer = leaderboard.stream()
                .filter(p -> p.getName().equalsIgnoreCase(player.getName()))
                .findFirst()
                .orElse(null);

        if (existingPlayer != null) {
            existingPlayer.setWins(existingPlayer.getWins() + player.getWins());
        } else {
            leaderboard.add(player);
        }

        leaderboard.sort(Comparator.comparingInt(Player::getWins).reversed());

        // Asegurar que solo los 5 mejores jugadores se mantengan en la tabla de líderes
        if (leaderboard.size() > 5) {
            leaderboard = leaderboard.subList(0, 5);
        }

        saveLeaderboard();
    }

    /**
     * Carga la tabla de líderes desde el archivo.
     */
    public void loadLeaderboard() {
        try (BufferedReader reader = new BufferedReader(new FileReader(LEADERBOARD_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0].trim();
                    char symbol = parts[1].trim().charAt(0);
                    int wins = Integer.parseInt(parts[2].trim());
                    leaderboard.add(new Player(name, symbol, wins));
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println(Languages.ERROR_ARCHIVO_LIDERES);
        } catch (IOException e) {
            System.err.println(Languages.ERROR_CARGAR_LIDERES + e.getMessage());
        }
    }

    /**
     * Guarda la tabla de líderes en el archivo.
     */
    private void saveLeaderboard() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(LEADERBOARD_FILE_PATH, false))) {
            for (Player player : leaderboard) {
                writer.println(player.getName() + "," + player.getSymbol() + "," + player.getWins());
            }
        } catch (IOException e) {
            System.err.println(Languages.ERROR_GUARDAR_LIDERES + e.getMessage());
        }
    }

    /**
     * Obtiene la tabla de líderes.
     * @return Una lista de jugadores en la tabla de líderes.
     */
    public List<Player> getLeaderboard() {
        return new ArrayList<>(leaderboard);
    }
}
