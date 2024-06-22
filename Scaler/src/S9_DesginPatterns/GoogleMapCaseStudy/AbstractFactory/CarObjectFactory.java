package S9_DesginPatterns.GoogleMapCaseStudy.AbstractFactory;

import S9_DesginPatterns.GoogleMapCaseStudy.CarPathFinder;
import S9_DesginPatterns.GoogleMapCaseStudy.PathFinder;

public class CarObjectFactory implements PathFInderFactory {
    @Override
    public PathFinder getPath() {
        return new CarPathFinder();
    }
}
