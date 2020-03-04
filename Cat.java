package lesson1.homework;

public class Cat implements Participants {
    String pType;
    String name;
    double possibleDistanceRun;
    double possibleHeightJump;

    public Cat (double maxRun, double maxJump) {
        this.possibleDistanceRun = maxRun;
        this.possibleHeightJump = maxJump;
        this.pType = "Кот";

    }

    @Override
    public void run () {
       System.out.println("Кот бежит");
    }

    @Override
    public void jump () {
        System.out.println("Кот прыгает");
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
