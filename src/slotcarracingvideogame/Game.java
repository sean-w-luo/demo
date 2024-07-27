package slotcarracingvideogame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Game {
	private List<Player> players;
    private Circuit circuit;
    private int countdownTimer;

    public Game(List<Player> players, Circuit circuit, int countdownTimer) {
        this.players = players;
        this.circuit = circuit;
        this.countdownTimer = countdownTimer;
    }

    public void startRace() {
        // Logic to start the race
        System.out.println("Race started!");
    }

    public void endRace() {
        // Logic to end the race
        System.out.println("Race ended!");
    }

    public void reportResults() {
        // Logic to report results
        for (Player player : players) {
            System.out.println(player.getName() + " completed " + player.getCar().getLaps() + " laps.");
        }
        // Determine and announce the winner
        Player winner = determineWinner();
        System.out.println("The winner is " + winner.getName() + "!");
    }

    private Player determineWinner() {
        // Logic to determine the winner
        Player winner = players.get(0);
        for (Player player : players) {
            if (player.getCar().getLaps() > winner.getCar().getLaps()) {
                winner = player;
            }
        }
        return winner;
    }
}
