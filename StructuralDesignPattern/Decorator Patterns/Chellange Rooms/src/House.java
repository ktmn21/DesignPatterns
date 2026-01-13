
public class House {

    public static void main(String[] args) {

        var room = new BasicRoom();
        room.printFurniture();

        System.out.println();

        // create a room with a carpet and a couch
        var room2 = new RoomWithCouch(room);
        room2.printFurniture();

        System.out.println();

        // create a room with a carpet, a couch and a table
        var room3 = new RoomWithTable(room2);
        room3.printFurniture();

        System.out.println();

        var room4 = new RoomWithTable(room);
        room4.printFurniture();

    }

}
