package lesson1.homework;

public class Wall implements Obstacles {
    double wallHeight;
    String oType;

    public Wall (double Size) {
        this.wallHeight = Size;
        this.oType = "Стена";

    }

    @Override
    public boolean overcoming(Participants incPrts) {

        if (incPrts.getMaxHeight()>= wallHeight && incPrts.getMaxHeight() > 0) {
            System.out.println(incPrts.getType() + " перепрыгнул стену. Он умеет прыгать на " + ((double)Math.round(incPrts.getMaxHeight() * 100) / 100) + " м, а высота стены = " +
                    ((double)Math.round(wallHeight*100)/100) + " м.");
            return true;
        } else {
            System.out.println(incPrts.getType() + " не смог перепрыгнуть стену. Он умеет прыгать на " + ((double)Math.round(incPrts.getMaxHeight() * 100) / 100) + " м, а высота стены = "
                    + ((double)Math.round(wallHeight*100)/100)  + " м.");
            return false;
        }
    }

    @Override
    public String getType() {
        return this.oType;
    }
}
