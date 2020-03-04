package lesson1.homework;

public class Robot implements Participants {
    String pType;
    String name;
    double possibleDistanceRun;
    double possibleHeightJump;

    public Robot (double maxRun, double maxJump) {
        this.possibleDistanceRun = maxRun;
        this.possibleHeightJump = maxJump;
        this.pType = "Робот";

    }

    @Override
    public void run () {
        System.out.println("Робот бежит");
    }

    @Override
    public void jump () {
        System.out.println("Робот прыгает");
    }

    @Override
    public double getMaxDistance () {
        return possibleDistanceRun;
    }

    @Override
    public double getMaxHeight () {
        return possibleHeightJump;
    }

    @Override
    public  String getType () {
        return this.pType;
    }

}