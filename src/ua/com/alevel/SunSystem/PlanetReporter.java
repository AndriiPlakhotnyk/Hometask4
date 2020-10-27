package ua.com.alevel.SunSystem;

public class PlanetReporter {
    public void report(Planet planet) {


        System.out.println("Ускорение свободного падения на " + planet.getName() + " равно: " + planet.acceleration());
    }
}
