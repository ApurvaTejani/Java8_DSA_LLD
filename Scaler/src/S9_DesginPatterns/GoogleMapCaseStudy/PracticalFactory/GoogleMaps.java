package S9_DesginPatterns.GoogleMapCaseStudy.PracticalFactory;

import S9_DesginPatterns.GoogleMapCaseStudy.PathFinder;

import java.io.File;


public class GoogleMaps {
    void findPathMethod(String from, String to, String mode) {

        PathFinder pf = PracticalFactory.getPath(mode);
        pf.pathFind(from, to);
    }
}
