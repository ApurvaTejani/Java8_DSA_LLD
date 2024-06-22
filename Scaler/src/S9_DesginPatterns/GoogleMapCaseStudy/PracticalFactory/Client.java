package S9_DesginPatterns.GoogleMapCaseStudy.PracticalFactory;


public class Client {
    public static void main(String[] args) {
        ddl_chnage("Bike");
    }

    public static void ddl_chnage(String mode) {
        GoogleMaps gm = new GoogleMaps();
        gm.findPathMethod("Pune", "Mumbai", mode);
    }
}
