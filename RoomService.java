import java.util.ArrayList;

public class RoomService {
    private ArrayList<Room> rooms = new ArrayList<>();

    public RoomService() {
        rooms.add(new Room("A101"));
        rooms.add(new Room("A102"));
        rooms.add(new Room("A103"));
    }

    public Room allocateRoom() {
        for(Room r : rooms) {
            if(r.isAvailable()) {
                r.setAvailable(false);
                return r;
            }
        }
        return null;
    }
}