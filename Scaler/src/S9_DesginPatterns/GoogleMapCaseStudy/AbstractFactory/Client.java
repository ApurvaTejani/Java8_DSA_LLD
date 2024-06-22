package S9_DesginPatterns.GoogleMapCaseStudy.AbstractFactory;


public class Client {
    public static void main(String[] args) {
        ddl_chnage("Car");
    }

    public static void ddl_chnage(String mode) {
        GoogleMaps gm = new GoogleMaps();

        if (mode == "Car")
            gm.setPff(new CarObjectFactory());
        else if (mode == "Bike") {
            gm.setPff(new BikeObjectFactory());
        } else if (mode == "Walk") {
            gm.setPff(new WalkObjectFactory());
        }
        gm.findPathMethod("Gujarat", "Mumbai", mode);

    }

}
