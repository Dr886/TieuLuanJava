import java.util.ArrayList;

public class Resort extends CommonAccommodation {
    /* Code here */
    protected int resortRanks;
    protected boolean isPools;
    protected Resort(int identifiCodeofLive, String place, String numberStreetName, String city, ArrayList rooms, float ranks, int resortRanks, boolean isPools) {
        super(identifiCodeofLive, place, numberStreetName, city, rooms, ranks);
        this.resortRanks = resortRanks;
        this.isPools = isPools;
    }
    protected Resort(int identifiCodeofLive, String place, String numberStreetName, String city, float ranks, int resortRanks, boolean isPools) {
        super(identifiCodeofLive, place, numberStreetName, city, ranks);
        this.resortRanks = resortRanks;
        this.isPools = isPools;
    }
@Override
    protected String toString() {
        return "Resort [" + identifiCodeofLive + ", " + place + ", " + resortRanks + ", " + numberStreetName + ", " + isPools + ", " + city + "]";
    }
}
