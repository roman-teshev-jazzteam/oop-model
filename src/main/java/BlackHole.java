import java.util.Random;

public class BlackHole extends SpaceObject implements Destroy {
    private double radiusOfAttraction;

    public double getRadiusOfAttraction() {
        return radiusOfAttraction;
    }

    public void setRadiusOfAttraction(double radiusOfAttraction) {
        this.radiusOfAttraction = radiusOfAttraction;
    }

    public void toBeDestroyed() {
        System.out.println("Black Hole is destroyed");

    }

    public void toOrbiting() {
        System.out.println("Black Hole is orbiting");
    }

    @Override
    public String toString() {
        return "BlackHole" +
                "\nName = " + getName() +
                "\nID = " + getId() +
                "\nDiameter = " + getDiameter() +
                "\nOrbital Radius = " + getOrbitalRadius() +
                "\nWeight = " + getWeight() +
                "\nCoordinateX = " + getCoordinateX() +
                "\nCoordinateY" + getCoordinateY() +
                "\nRadius Of Attraction = " + radiusOfAttraction +
                "\nList of Star Systems: \n" + getListOfSatellites();
    }


    public void generateRandomBlackHole() {
        Random blackHoleRandom = new Random();
        this.setRadiusOfAttraction(blackHoleRandom.nextDouble());
    }
}
