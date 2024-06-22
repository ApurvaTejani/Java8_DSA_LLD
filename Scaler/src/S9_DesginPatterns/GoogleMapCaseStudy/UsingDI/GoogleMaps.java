package S9_DesginPatterns.GoogleMapCaseStudy.UsingDI;

import S9_DesginPatterns.GoogleMapCaseStudy.PathFinder;

public class GoogleMaps {
    private PathFinder pf;

    public GoogleMaps(PathFinder pf) {
        this.pf = pf;
    }

    public PathFinder getPf() {
        return pf;
    }

    public void setPf(PathFinder pf) {
        this.pf = pf;
    }

    void findPathMethod(String from, String to) {
        if (pf == null)
            System.out.println("No Mode is selected");
        else
            pf.pathFind(from, to);
    }

}
