public class CruiseShip extends LuxuryAccommodation {
    /* Code here */
    protected boolean isBar;
    protected CruiseShip(int identifiCodeofLive, String place, String numberStreetName, String city, boolean isPools, boolean isWelcomeDrink, boolean freeBreakfast, boolean isGymRooms, int maxiPeopleServed, int priceperNight, boolean isBar) {
        super(identifiCodeofLive, place, numberStreetName, city, isPools, isWelcomeDrink, freeBreakfast, isGymRooms, maxiPeopleServed, priceperNight);
        this.isBar = isBar;
    }
@Override
    protected String toString() {
        return "CruiseShip [" + identifiCodeofLive + ", " + place + ", " + numberStreetName + ", " + city + ", " + isBar + ", " + isPools + ", " + isWelcomeDrink + ", " + freeBreakfast + ", " + isGymRooms + "]"; 
    }
}
