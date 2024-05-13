public class LuxuryAccommodation extends Accommodation {
    /* Code here */
    protected boolean isPools;
    protected boolean isWelcomeDrink;
    protected boolean freeBreakfast;
    protected boolean isGymRooms;
    protected int maxiPeopleServed;
    protected int priceperNight;
    protected LuxuryAccommodation(int identifiCodeofLive, String place, String numberStreetName, String city) {
        super(identifiCodeofLive, place, numberStreetName, city);
    }
    protected LuxuryAccommodation(int identifiCodeofLive, String place, String numberStreetName, String city, boolean isPools, boolean isWelcomeDrink, boolean freeBreakfast, boolean isGymRooms, int maxiPeopleServed, int priceperNight) {
        super(identifiCodeofLive, place, numberStreetName, city);
        this.isPools = isPools;
        this.isWelcomeDrink = isWelcomeDrink;
        this.freeBreakfast = freeBreakfast;
        this.isGymRooms = isGymRooms;
        this.maxiPeopleServed = maxiPeopleServed;
        this.priceperNight = priceperNight;
    }
}
