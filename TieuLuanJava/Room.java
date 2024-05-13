public class Room {
    /* Code here */
    private int identifiCode;
    private String roomName;
    private int numberofFloors;
    private String typeRoom;
    private int numberBed;
    private int maxiPeopleRoom;
    private double roomArea;
    private double priceperNight;
    private Room(int identifiCode, String roomName, int numberofFloors, String typeRoom, int numberBed, int maxiPeopleRoom, double roomArea, double priceperNight) {

    }
    private int getIdentifiCode() {
        return identifiCode;
    } 
    private void setIdentifiCode(int identifiCode) {
        this.identifiCode = identifiCode;
    }
    private String getRoomName() {
        return roomName;
    }
    private void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    private int getNumberoffFloors() {
        return numberofFloors;
    }
    private void setNumberoffFloors(int getNumberoffFloors) {
        this.numberofFloors = numberofFloors;
    }
    private String getTypeRoom() {
        return typeRoom;
    }
    private void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }
    private int getNumberBed() {
        return numberBed;
    }
    private void setNumberBed(int numberBed) {
        this.numberBed = numberBed;
    }
    private int getMaxiPeopleRoom() {
        return maxiPeopleRoom;
    }
    private void setMaxiPeopleRoom(int maxiPeopleRoom) {
        this.maxiPeopleRoom = maxiPeopleRoom;
    }
    private double getRoomArea() {
        return roomArea;
    }
    private void setRoomArea(double roomArea) {
        this.roomArea = roomArea;
    }
    private double getPriceperNinght() {
        return priceperNight;
    }
    private void setPriceperNinght(double priceperNight) {
        this.priceperNight = priceperNight;
    }
    private String toString() {
        return "Room [" + identifiCode + ", " + roomName + ", " + numberofFloors + ", " + typeRoom + ", " + ", " + numberBed + ", " + maxiPeopleRoom + ", " + roomArea + ", " + priceperNight + "]";
    }
}
