package S9_DesginPatterns.GoogleMapCaseStudy.UsingDI;

import S9_DesginPatterns.GoogleMapCaseStudy.CarPathFinder;

public class Client {
    public static void main(String[] args) {
        GoogleMaps gm = new GoogleMaps(null);
        gm.findPathMethod(null, null);
        gm.setPf(new CarPathFinder());
        gm.findPathMethod("Delhi", "Mumbai");
    }
}
