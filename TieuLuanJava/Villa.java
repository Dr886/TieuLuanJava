public class Villa extends LuxuryAccommodation {
    /* Code here */
    protected Villa(int identifiCodeofLive, String place, String numberStreetName, String city, boolean isPools, boolean isWelcomeDrink, boolean freeBreakfast, boolean isGymRooms, int maxiPeopleServed, int priceperNight) {
        super(identifiCodeofLive, place, numberStreetName, city, isPools, isWelcomeDrink, freeBreakfast, isGymRooms, maxiPeopleServed, priceperNight);
    }
@Override
    protected String toString() {
        return "Villa [" + identifiCodeofLive + ", " + place + ", " + numberStreetName + ", " + city + ", " + isPools + ", " + isWelcomeDrink + ", " + freeBreakfast + ", " + isGymRooms + ", " + maxiPeopleServed + ", " + priceperNight + "]";
    }
}
