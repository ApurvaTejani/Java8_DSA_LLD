package S9_DesginPatterns.GoogleMapCaseStudy.FactoryMethod;


public class Client {
    public static void main(String[] args) {
        ddl_chnage("Walk");
    }

    public static void ddl_chnage(String mode) {
        GoogleMaps gm = null;
        if (mode == "Car")
            gm = new GMForCar();
        else if (mode == "Bike") {
            gm = new GMForBIke();
        } else if (mode == "Walk") {
            gm = new GMForWalk();
        }
        gm.findPathMethod("Bangalore", "Mumbai", mode);

    }
}
