package week03.day18.BossChallenge;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public Manager(String name) {
        super(name);
        this.teamSize = 2;
    }

    public Manager(double salary) {
        super(salary);
        this.teamSize = 2;

    }

    public Manager(int teamSize) {
        super();
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }
    @Override
    public void work() {
        System.out.println(getName() + " is managing a team of " + teamSize + " people.");
    }

    public void holdMeeting() {
        System.out.println(getName() + " is holding a meeting with his " + teamSize + " team members.");
    }

}