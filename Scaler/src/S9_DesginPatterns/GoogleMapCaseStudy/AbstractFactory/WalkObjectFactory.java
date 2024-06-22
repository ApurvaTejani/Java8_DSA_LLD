package S9_DesginPatterns.GoogleMapCaseStudy.AbstractFactory;

import S9_DesginPatterns.GoogleMapCaseStudy.PathFinder;
import S9_DesginPatterns.GoogleMapCaseStudy.WalkPathFinder;

public class WalkObjectFactory implements PathFInderFactory {
    @Override
    public PathFinder getPath() {
        return new WalkPathFinder();
    }
}
