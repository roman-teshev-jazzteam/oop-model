import java.util.Random;

public class Spacecraft extends SpaceObject implements Moveble, Destroy {
    private String companyFounder;
    private String country;
    private int yearOfCreation;

    public String getCompanyFounder(String apple) {
        return companyFounder;
    }

    public void setCompanyFounder(String companyFounder) {
        this.companyFounder = companyFounder;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public void toOrbiting() {
        double coordinateX = this.getCoordinateX();
        double coordinateY = this.getCoordinateY();
        coordinateX++;
        coordinateY++;
        this.setCoordinateX(coordinateX);
        this.setCoordinateY(coordinateY);

    }

    public void toBeDestroyed() {
        System.out.println("Spacecraft is destroyed");

    }

    @Override
    public String toString() {
        return "\n                              Spacecraft" +
                "\n                              Founder = " + companyFounder +
                "\n                              Country = " + country +
                "\n                              Year of Creation = " + yearOfCreation +
                "\n                              Coordinates: " + getCoordinateX() + " / " + getCoordinateY() +
                "\n";
    }

    public void generateRandomSpacecraft() {
        String[] founders = {"Apple", "IBM", "JazzTeam", "NASA"};
        String[] countries = {"Belarus", "Russia", "USA", "UA"};
        Random spacecraftRandom = new Random();
        this.setCompanyFounder(founders[spacecraftRandom.nextInt(3)]);
        this.setCountry(countries[spacecraftRandom.nextInt(3)]);
        this.setYearOfCreation(spacecraftRandom.nextInt(2015));
        this.setCoordinateX(spacecraftRandom.nextDouble());
        this.setCoordinateY(spacecraftRandom.nextDouble());
    }
}


