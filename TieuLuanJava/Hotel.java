import java.util.ArrayList;

public class Hotel extends CommonAccommodation {
    /* Code here */
    protected int hotelRanks;
    protected Hotel(int identifiCode, String place, String numberStreetName, String city, ArrayList rooms, float ranks, int hotelRanks) {
        super(identifiCode, place, numberStreetName, city, rooms, ranks);
        this.hotelRanks = hotelRanks;
    }
    protected Hotel(int identifiCode, String place, String numberStreetName, String city, float ranks, int hotelRanks) {
        super(identifiCode, place, numberStreetName, city, ranks);
        this.hotelRanks = hotelRanks;
    }
@Override
    protected String toString() {
        return "Hotel [" + identifiCodeofLive + ", " + hotelRanks + ", " + place + ", " + numberStreetName + ", " + city + "]";
    }
}
