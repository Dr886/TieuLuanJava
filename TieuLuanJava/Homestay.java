import java.util.ArrayList;

public class Homestay extends CommonAccommodation {
    /* Code here */
    protected Homestay(int identifiCode, String place, String numberStreetName, String city, ArrayList rooms, float ranks) {
        super(identifiCode, place, numberStreetName, city, rooms, ranks);
    }
    protected Homestay(int identifiCode, String place, String numberStreetName, String city, float ranks) {
        super(identifiCode, place, numberStreetName, city, ranks);
    }
@Override
    protected String toString() {
        return "Homestay [" + identifiCodeofLive + ", " + place + ", " + numberStreetName + ", " + ranks + ", " + city + "]";
    }
}
