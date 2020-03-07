package lesson1.homework;

public class Human implements Participants {
    String pType;
    String name;
    double possibleDistanceRun;
    double possibleHeightJump;

    public Human (double maxRun, double maxJump) {
        this.possibleDistanceRun = maxRun;
        this.possibleHeightJump = maxJump;
        this.pType = "Человек";

    }

    @Override
    public void run () {
        System.out.println("Человек бежит");
    }

    @Override
    public void jump () {
        System.out.println("Человек прыгает");
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
