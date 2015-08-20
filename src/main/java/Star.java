import java.util.Random;

public class Star extends SpaceObject implements Moveble, Destroy {
    private double power;
    private double temperature;

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void toBeDestroyed() {
        System.out.println("Star is destroyed");
    }

    public void toOrbiting() {
        System.out.println("Star is orbiting");

    }

    @Override
    public String toString() {
        return "\n          Star" +
                "\n          power = " + power +
                "\n          temperature = " + temperature +
                "\n          Coordinates: " + getCoordinateX() + " / " + getCoordinateY() +
                "\n          List of Planets: \n" + getListOfSatellites() +
                "\n";
    }

    public void generateRandomStar() {
        Random starRandom = new Random();
        this.setTemperature(starRandom.nextDouble());
        this.setPower(starRandom.nextDouble());
        this.setCoordinateX(starRandom.nextDouble());
        this.setCoordinateY(starRandom.nextDouble());
    }
}
