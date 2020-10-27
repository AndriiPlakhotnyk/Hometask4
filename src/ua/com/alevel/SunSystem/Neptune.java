package ua.com.alevel.SunSystem;

public class Neptune extends Planet implements PlanetAccelerations {


    public Neptune(String name, double m, double r) {
        super(name, m, r);
    }

    @Override
    public double acceleration() {
        double acceleration = AccelerationUtil.freeFallAcceleration(getM(), getR());
        return acceleration;
    }
}

