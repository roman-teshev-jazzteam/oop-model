import java.util.Random;

public class Asteroid extends SpaceObject implements Moveble, Destroy {
    private char classOfAsteroid;

    public char getClassOfAsteroid() {
        return classOfAsteroid;
    }

    public void setClassOfAsteroid(char classOfAsteroid) {
        this.classOfAsteroid = classOfAsteroid;
    }


    public void toBeDestroyed() {
        System.out.println("Asteroid is destroyed");
    }

    public void toOrbiting() {
        System.out.println("Asteroid is orbiting");

    }

    @Override
    public String toString() {
        return "Asteroid{" +
                "classOfAsteroid=" + classOfAsteroid +
                '}';
    }

    public void generateRandomAsteroid() {
        Random asteroidRandom = new Random();
        char[] classArray = {'a', 'b', 'c', 'd'};
        int charVar = asteroidRandom.nextInt(3);
        this.setClassOfAsteroid(classArray[charVar]);
    }
}
