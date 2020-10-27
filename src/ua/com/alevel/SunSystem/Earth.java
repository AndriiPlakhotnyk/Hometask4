package ua.com.alevel.SunSystem;

public class Earth extends Planet implements PlanetAccelerations {


    public Earth(String name, double m, double r) {
        super(name, m, r);
    }

    @Override
    public double acceleration() {
        double acceleration = AccelerationUtil.freeFallAcceleration(getM(), getR());
        return acceleration;
    }
}
