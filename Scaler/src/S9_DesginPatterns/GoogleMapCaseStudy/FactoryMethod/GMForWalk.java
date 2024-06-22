package S9_DesginPatterns.GoogleMapCaseStudy.FactoryMethod;

import S9_DesginPatterns.GoogleMapCaseStudy.PathFinder;
import S9_DesginPatterns.GoogleMapCaseStudy.WalkPathFinder;

public class GMForWalk extends GoogleMaps {

    @Override
    PathFinder getPath() {
        return new WalkPathFinder();
    }
}
