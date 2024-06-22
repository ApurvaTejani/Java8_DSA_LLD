package S9_DesginPatterns.GoogleMapCaseStudy.FactoryMethod;

import S9_DesginPatterns.GoogleMapCaseStudy.BikePathFinder;
import S9_DesginPatterns.GoogleMapCaseStudy.PathFinder;

public class GMForBIke extends GoogleMaps {

    @Override
    PathFinder getPath() {
        return new BikePathFinder();
    }
}
