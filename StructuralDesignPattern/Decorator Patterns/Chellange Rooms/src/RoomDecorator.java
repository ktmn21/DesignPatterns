public abstract class RoomDecorator implements Room{

    private final Room wrappee;

    public  RoomDecorator (Room room){
        this.wrappee = room;
    }

    @Override
    public void printFurniture(){
        wrappee.printFurniture();
    }

}
