package S9_DesginPatterns.GoogleMapCaseStudy.AbstractFactory;

import S9_DesginPatterns.GoogleMapCaseStudy.PathFinder;

public class GoogleMaps {
    private PathFInderFactory pff;

    public PathFInderFactory getPff() {
        return pff;
    }

    public void setPff(PathFInderFactory pff) {
        this.pff = pff;
    }

    public void findPathMethod(String from, String to, String mode) {
        PathFinder pf = pff.getPath();
        pf.pathFind(from, to);
    }
}
