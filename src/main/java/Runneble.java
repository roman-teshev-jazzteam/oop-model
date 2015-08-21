import java.util.ArrayList;
import java.util.Random;

public class Runneble {

    public static final int RANDOM_LIMIT = 10;

    public static void main(String[] args) {
        BlackHole sagittariusA = new BlackHole();
        sagittariusA.setName("Sagittarius A");
        sagittariusA.setId("SRGAJ2000.0");
        sagittariusA.setDiameter(172000);
        sagittariusA.setOrbitalRadius(200000);
        sagittariusA.setWeight(4300000);
        sagittariusA.setCoordinateX(0);
        sagittariusA.setCoordinateY(0);
        sagittariusA.setRadiusOfAttraction(180000);
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
        sagittariusA.setListOfSatellites(blackHoleSatellites);
        System.out.println(sagittariusA);
        for (int g = 0; g < blackHoleSatellites.size(); g++) {
            blackHoleSatellites.get(g).toOrbiting();
            if (blackHoleSatellites.get(g).getListOfSatellites() != null) {
                for (int m = 0; m < blackHoleSatellites.get(g).getListOfSatellites().size(); m++) {
                    blackHoleSatellites.get(g).getListOfSatellites().get(m).toOrbiting();
                    if (blackHoleSatellites.get(g).getListOfSatellites().get(m).getListOfSatellites() != null) {
                        for (int n = 0; n < blackHoleSatellites.get(g).getListOfSatellites().get(m).getListOfSatellites().size(); n++) {
                            blackHoleSatellites.get(g).getListOfSatellites().get(m).getListOfSatellites().get(n).toOrbiting();
                        }
                    }
                }
            }
        }
        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println(sagittariusA);

    }

}
