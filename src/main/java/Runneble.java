import java.util.ArrayList;
import java.util.Random;

public class Runneble {

    public static final int RANDOM_LIMIT = 10;

    public static void main(String[] args) {
        BlackHole SagittariusA = new BlackHole();
        SagittariusA.setName("Sagittarius A");
        SagittariusA.setId("SRGAJ2000.0");
        SagittariusA.setDiameter(172000);
        SagittariusA.setOrbitalRadius(200000);
        SagittariusA.setWeight(4300000);
        SagittariusA.setCoordinateX(0);
        SagittariusA.setCoordinateY(0);
        SagittariusA.setRadiusOfAttraction(180000);
        ArrayList<SpaceObject> blackHoleSatellites = new ArrayList<SpaceObject>();
        Random random = new Random();
        for (int i = 0; i < random.nextInt(RANDOM_LIMIT); i++) {
            Star star = new Star();
            star.generateRandomStar();
            ArrayList<SpaceObject> starSatellites = new ArrayList<SpaceObject>();
            for (int k = 0; k < random.nextInt(RANDOM_LIMIT); k++) {
                Planet planet = new Planet();
                planet.generateRandomPlanet();
                ArrayList<SpaceObject> planetSatellites = new ArrayList<SpaceObject>();
                for (int j = 0; j < random.nextInt(RANDOM_LIMIT); j++) {
                    Spacecraft spacecraft = new Spacecraft();
                    spacecraft.generateRandomSpacecraft();
                    planetSatellites.add(spacecraft);
                }
                planet.setListOfSatellites(planetSatellites);
                starSatellites.add(planet);
            }
            star.setListOfSatellites(starSatellites);
            blackHoleSatellites.add(star);
        }
        SagittariusA.setListOfSatellites(blackHoleSatellites);
        System.out.println(SagittariusA);
    }
}
