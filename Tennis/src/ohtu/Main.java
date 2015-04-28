package ohtu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Play(lukija, new TennisGame("player1", "player2"));
    }

    private static void Play(Scanner lukija, TennisGame game) {
        String input;
        System.out.println("Let's start");
        System.out.println(game.getScore());
        while (true) {
            System.out.println("Player who got point (1 / 2): ");
            input = lukija.nextLine();

            if (input.equals("1")) {
                game.wonPoint("player1");
            } else {
                game.wonPoint("player2");
            }
            System.out.println(game.getScore());

            System.out.println("Continue (y/n): ");
            input = lukija.nextLine();
            if (game.getScore().contains("Win")) {
                if (input.equals("y")) {
                    Play(lukija, new TennisGame("player1", "player2"));
                } else {
                    return;
                }
            }
            if (input.equals("n")) {
                return;
            }
        }
    }
}
