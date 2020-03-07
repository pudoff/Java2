package lesson1.homework;

public class Treadmill implements Obstacles {
    double trackLength;
    String oType;

    public Treadmill (double Size) {
        this.trackLength = Size;
        this.oType = "Беговая дорожка";

    }

    @Override
    public boolean overcoming(Participants incPrts) {

        if (incPrts.getMaxDistance()>= trackLength&& incPrts.getMaxDistance() > 0) {
            System.out.println(incPrts.getType() + " пробежал дорожку. Он умеет бегать на " + (Math.round(incPrts.getMaxDistance() * 100) / 100) + " км, а длина дорожки = "
                    + (Math.round(trackLength*100)/100) + "км.");
            return true;
        } else {
            System.out.println(incPrts.getType() + " не смог пробежать дорожку. Он умеет бегать на " + (Math.round(incPrts.getMaxDistance() * 100) / 100) + " км, а длина дорожки = "
                    + (Math.round(trackLength*100)/100) + " км.");
            return false;
        }
    }
    @Override
    public String getType() {
        return this.oType;
    }
}
