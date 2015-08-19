import java.util.Random;

public class Planet extends SpaceObject implements Moveble, Destroy {
    private double athmosphereRadius;
    private double dayTime;
    private double yearTime;
    private boolean rings;
    private boolean isLive;

    public boolean isLive() {
        return isLive;
    }

    public void setIsLive(boolean isLive) {
        this.isLive = isLive;
    }

    public double getAthmosphereRadius() {
        return athmosphereRadius;
    }

    public void setAthmosphereRadius(double athmosphereRadius) {
        this.athmosphereRadius = athmosphereRadius;
    }

    public double getDayTime() {
        return dayTime;
    }

    public void setDayTime(double dayTime) {
        this.dayTime = dayTime;
    }

    public double getYearTime() {
        return yearTime;
    }

    public void setYearTime(double yearTime) {
        this.yearTime = yearTime;
    }

    public boolean isRings() {
        return rings;
    }

    public void setRings(boolean rings) {
        this.rings = rings;
    }

    public void toOrbiting() {
        System.out.println("Planet is orbiting");

    }

    public void toExplode() {
        System.out.println("Planet is eploded");

    }

    public void toCrash() {
        System.out.println("Planet is crashed");

    }

    @Override
    public String toString() {
        return "\n[[[[\n||||||||||Planet" +
                "\n||||||||||Athmosphere Radius = " + athmosphereRadius +
                "\n||||||||||Day Time = " + dayTime +
                "\n||||||||||Year Time = " + yearTime +
                "\n||||||||||Rings = " + rings +
                "\n||||||||||List of Spacecrafts: \n" + getListOfSatellites() +
                "\n]]]]\n";
    }

    public void generateRandomPlanet() {
        Random planetRandom = new Random();
        this.setRings(planetRandom.nextBoolean());
        this.setDayTime(planetRandom.nextDouble());
        this.setYearTime(planetRandom.nextDouble());
        this.setAthmosphereRadius(planetRandom.nextDouble());
        this.setIsLive(planetRandom.nextBoolean());
    }
}
