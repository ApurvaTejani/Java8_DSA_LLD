package S9_DesginPatterns.GoogleMapCaseStudy.PracticalFactory;

import S9_DesginPatterns.GoogleMapCaseStudy.BikePathFinder;
import S9_DesginPatterns.GoogleMapCaseStudy.CarPathFinder;
import S9_DesginPatterns.GoogleMapCaseStudy.PathFinder;
import S9_DesginPatterns.GoogleMapCaseStudy.WalkPathFinder;

public class PracticalFactory {
    public static PathFinder getPath(String mode) {
        if (mode == "Car")
            return new CarPathFinder();
        else if (mode == "Bike") {
            return new BikePathFinder();
        } else if (mode == "Walk") {
            return new WalkPathFinder();
        } else
            return null;
    }
}
