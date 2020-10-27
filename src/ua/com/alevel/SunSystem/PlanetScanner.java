package ua.com.alevel.SunSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlanetScanner {
    public void scanPlanet() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PlanetReporter reporter = new PlanetReporter();
        Earth earth = new Earth("Земля",  59.8,6.378 );
        Jupiter jupiter = new Jupiter("Юпитер",18766.43 ,71300 );
        Mars mars = new Mars("Марс", 6.33,3.5 );
        Mercury mercury = new Mercury("Меркурий", 3.28,2.44 );
        Neptune neptune = new Neptune("Нептун", 1015.92,24750 );
        Pluto pluto = new Pluto("Плутон", 0.12,2 );
        Saturn saturn = new Saturn("Сатурн", 5618.037,60100 );
        Uranus uranus = new Uranus("Уран", 860.54,26500 );
        Venus venus = new Venus("Венера", 48.1,6.052);

        System.out.println("Введите название планеты");



            String planet = reader.readLine();

            switch (planet) {
                case "Земля":
                    reporter.report(earth);
                    break;
                case "Юпитер":
                    reporter.report(jupiter);
                    break;
                case "Марс":
                    reporter.report(mars);
                    break;
                case "Меркурий":
                    reporter.report(mercury);
                    break;
                case "Нептун":
                    reporter.report(neptune);
                    break;
                case "Плутон":
                    reporter.report(pluto);
                    break;
                case "Сатурн":
                    reporter.report(saturn);
                    break;
                case "Уран":
                    reporter.report(uranus);
                    break;
                case "Венера":
                    reporter.report(venus);
                    break;




        }
    }
}
