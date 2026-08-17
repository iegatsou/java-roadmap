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
    public String getName(){
        return name;
    }
    public int getScore() {
        return score;
    }

    public static int getPlayerCount() {
        return playerCount;
    }

    public static Player findHighestScore(Player[] players) {
        Player highestScorePlayer = null;
        int nullCounter = 0;
        int index = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null)
                nullCounter++;
            else {
                highestScorePlayer = players[i];
                index = i;
                break;
            }
        }
        if (nullCounter == players.length) {
            return null;
        } else {
            for (int i = index + 1; i < players.length; i++) {
                if (players[i] != null && players[i].getScore() > highestScorePlayer.getScore()) {
                    highestScorePlayer = players[i];
                }
            }
            return highestScorePlayer;
        }
    }
    public static double calculateAverageScore(Player[] players){
        int nonNullCounter=0;
        double sum=0;
        for (int i=0;i<players.length;i++){
            if (players[i]!=null)
                nonNullCounter++;
                sum+=players[i].score;
        }
        if (nonNullCounter==0)
            return sum;
        else {
            return sum/nonNullCounter;
            }
        }
    }

