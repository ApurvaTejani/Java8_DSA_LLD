package S9_DesginPatterns.GoogleMapCaseStudy.FactoryMethod;

import S9_DesginPatterns.GoogleMapCaseStudy.CarPathFinder;
import S9_DesginPatterns.GoogleMapCaseStudy.PathFinder;

public class GMForCar extends GoogleMaps {


    @Override
    PathFinder getPath() {
        return new CarPathFinder();
    }
}
