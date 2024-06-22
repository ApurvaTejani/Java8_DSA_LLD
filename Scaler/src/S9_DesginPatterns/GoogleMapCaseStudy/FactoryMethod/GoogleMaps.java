package S9_DesginPatterns.GoogleMapCaseStudy.FactoryMethod;

import S9_DesginPatterns.GoogleMapCaseStudy.PathFinder;

public abstract class GoogleMaps {
    public void findPathMethod(String from, String to, String mode) {
        PathFinder pf = getPath(); // Generator of Object Hence Factory
        pf.pathFind(from, to);
    }

    abstract PathFinder getPath();
}
