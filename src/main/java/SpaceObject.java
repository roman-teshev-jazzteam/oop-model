import java.util.ArrayList;

abstract class SpaceObject {
    private String name;
    private String id;
    private double diameter;
    private double orbitalRadius;
    private double weight;
    private double coordinateX;
    private double coordinateY;
    private ArrayList<SpaceObject> listOfSatellites;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getOrbitalRadius() {
        return orbitalRadius;
    }

    public void setOrbitalRadius(double orbitalRadius) {
        this.orbitalRadius = orbitalRadius;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public ArrayList<SpaceObject> getListOfSatellites() {
        return listOfSatellites;
    }

    public void setListOfSatellites(ArrayList<SpaceObject> listOfSatellites) {
        this.listOfSatellites = listOfSatellites;
    }
}
