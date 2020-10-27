package ua.com.alevel.SunSystem;


import java.lang.reflect.Array;
import java.util.ArrayList;

public final class AccelerationUtil {

    static double freeFallAcceleration( double m , double r) {
        double g = (6.67 * m)/r*r;
        return g;
    }
}
