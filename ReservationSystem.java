import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;

public class ReservationSystem {
    private ArrayList<Accommodation> accommodations;

    // Requirement 1: Load data
    public ReservationSystem(String accPath, String roomPath, String roomOfAccPath) {
        this.accommodations = loadAccommodations(accPath, roomPath, roomOfAccPath);
    }

    public ArrayList<Accommodation> getAccommodations() {
        return accommodations;
    }

    // Requirement 1
    public ArrayList<Accommodation> loadAccommodations(String accPath, String roomPath, String roomOfAccPath) {
        /* Code here */
        ArrayList<Accommodation> accommodations = new ArrayList<>();
        
        try(BufferedReader bfRead = new BufferedReader(new FileReader(accPath));
            BufferedReader BfRead = new BufferedReader(new FileReader(roomPath));
            BufferedReader bFRead = new BufferedReader(new FileReader(roomOfAccPath))) {    
        String[] infoList;
        String Info;
        while((Info = bfRead.readLine()) != null) {
        String[] line = Info.trim().split(",");
        //homestay
        switch (line.length) {
            case 5:
            accommodations.add(new Homestay(Integer.parseInt(line[0]), line[1], line[2], line[3], Float.parseFloat(line[4])));
            continue;
        //resort
            case 7 :
            accommodations.add(new Resort(Integer.parseInt(line[0]), line[1], line[2], line[3], Integer.parseInt(line[4]), Boolean.parseBoolean(line[5]), Float.parseFloat(line[6])));
            continue;
        //hotel
            case 6 :
            Hotel hotel = new Hotel(Integer.parseInt(line[0]), line[1], line[2], line[3], Integer.parseInt(line[4]), Float.parseFloat(line[5]));
            accommodations.add(hotel);
            continue;
        //Villa
            case 10 :
            Villa villa = new Villa(Integer.parseInt(line[0]), line[1], line[2], line[3], Boolean.parseBoolean(line[4]), Boolean.parseBoolean(line[5]), Boolean.parseBoolean(line[6]), Boolean.parseBoolean(line[7]), Integer.parseInt(line[8]), Integer.parseInt(line[9]));
            accommodations.add(villa);
            continue;
        //cruiseShip
            case 11:
            CruiseShip cruiseShip = new CruiseShip(Integer.parseInt(line[0]), line[1], line[2], line[3], Boolean.parseBoolean(line[4]), Boolean.parseBoolean(line[5]), Boolean.parseBoolean(line[6]), Boolean.parseBoolean(line[7]), Boolean.parseBoolean(line[8]), Integer.parseInt(line[9]), Integer.parseInt(line[10]));
            accommodations.add(cruiseShip);
            continue;
        }
        }
        bfRead.close();
        BfRead.close();
        bFRead.close();
    } catch(IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    } 
    return null;      
    }
    // Requirement 2
    public ArrayList<Accommodation> searchForRoom(String city, int numOfPeople) {
        /* Code here */
        return null;
    }

    // Requirement 3
    public ArrayList<Accommodation> searchForRoomByRange(String reservationPath, double priceFrom, double priceTo,
            Date checkin, Date checkout, String city, int numOfPeople) {
        /* Code here */
        return null;
    }

    // Requirement 4
    public ArrayList<Accommodation> searchInAdvance(String city, Integer numOfPeople, String roomType,
            Boolean privatePool, Integer starQuality, Boolean freeBreakfast, Boolean privateBar) {
        /* Code here */
        return null;
    }

    // Requirement 5
    public double performReservation(String reservationPath, Accommodation acc, Room room, Date checkin, Date checkout)
            throws Exception {
        /* Code here */
        return 0.0;
    }

    // Helper functions for req 5
    public long diffBetweenDays(long dateStart, long dateEnd) {
        Date date = new Date(dateStart * 1000);
        Date date1 = new Date(dateEnd * 1000);

        long diff = Math.abs(date1.getTime() - date.getTime());
        long numOfDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        return numOfDays;
    }
}
