import java.util.ArrayList;

public class CommonAccommodation extends Accommodation {
   /* Code here */
   protected ArrayList<Room> rooms;
   protected float ranks;
   protected CommonAccommodation(int identifiCode, String place, String numberStreetName, String city, ArrayList rooms, float ranks) {
      super(identifiCode, place, numberStreetName, city);
      this.rooms = rooms;
      this.ranks = ranks;
   }
   protected CommonAccommodation(int identifiCode, String place, String numberStreetName, String city, float ranks) {
      super(identifiCode, place, numberStreetName, city);
      this.ranks = ranks;
   }
}
