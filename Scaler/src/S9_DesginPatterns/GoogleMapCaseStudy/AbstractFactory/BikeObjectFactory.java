package S9_DesginPatterns.GoogleMapCaseStudy.AbstractFactory;


import S9_DesginPatterns.GoogleMapCaseStudy.BikePathFinder;
import S9_DesginPatterns.GoogleMapCaseStudy.PathFinder;

public class BikeObjectFactory implements PathFInderFactory {

    @Override
    public PathFinder getPath() {
        return new BikePathFinder();
    }
}
