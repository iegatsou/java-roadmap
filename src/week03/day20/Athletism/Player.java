package week03.day20.Athletism;

public class Player {

    private String name;
    private int score;

    private static int playerCount = 0;

    public Player(String name) {
        this(name, 0);
    }

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
        playerCount++;
    }

    public void addScore(int points) {
        score += points;
    }

    public void addScore(int points, int bonus) {
        score += points + bonus;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public static int getPlayerCount() {
        return playerCount;
    }

    public static Player findHighestScore(Player[] players) {
        Player highest = null;

        for (int i = 0; i < players.length; i++) {
            if (players[i] != null &&
                    (highest == null || players[i].getScore() > highest.getScore())) {

                highest = players[i];
            }
        }

        return highest;
    }

    public static double calculateAverageScore(Player[] players) {
        int nonNullCounter = 0;
        double sum = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                nonNullCounter++;
                sum += players[i].score;
            }
        }
        if (nonNullCounter == 0)
            return 0;
        else {
            return sum / nonNullCounter;
        }
    }
}

