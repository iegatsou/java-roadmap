package week03.day20.Athletism;

public class PlayerApp {
    static void main() {
        Player[] players = new Player[6];

        players[0] = new Player("Anna", 80);
        players[1] = null;
        players[2] = new Player("Maria", 95);
        players[3] = new Player("George", 70);
        players[4] = null;
        players[5] = new Player("John", 85);
        Player highest=Player.findHighestScore(players);
        if(highest!=null)
            System.out.println("Highest: " + highest.getName() + " - " + highest.getScore());
        else System.out.println("Empty array.");
        double average=Player.calculateAverageScore(players);
        System.out.println("Average: " + average);
    }
}
