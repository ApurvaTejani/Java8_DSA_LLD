package S9_DesginPatterns.GoogleMapCaseStudy;

public class CarPathFinder implements PathFinder {
    @Override
    public void pathFind(String from, String to) {
        System.out.println("We would be going from " + from + " to " + to + " using Car");
    }
}
