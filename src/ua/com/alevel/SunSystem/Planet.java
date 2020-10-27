package ua.com.alevel.SunSystem;

public abstract class Planet implements PlanetAccelerations {

    private String name;
    private double m;
    private double r;

    public Planet(String name, double m, double r) {
        this.name = name;
        this.m = m;
        this.r = r;

    }


    public String getName() {

        return name;
    }

    public double getM() {

        return m;
    }

    public double getR() {

        return r;
    }
}