package ua.com.alevel.SunSystem;

public class Mercury extends Planet implements PlanetAccelerations {

    public Mercury(String name, double m, double r) {
        super(name, m, r);
    }

    @Override
    public double acceleration() {
        double acceleration = AccelerationUtil.freeFallAcceleration(getM(), getR());
        return acceleration;
    }
}
