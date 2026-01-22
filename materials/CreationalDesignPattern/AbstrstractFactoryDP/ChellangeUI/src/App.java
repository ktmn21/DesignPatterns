
public class App {


    public static void main(String[] args) {
        UserInterface roadUserInterface = createUserInterface("RED");
        UserInterface mountainUserInterface = createUserInterface("BLUE");

        System.out.println(roadUserInterface);
        System.out.println(mountainUserInterface);

    }


    private static UserInterface createUserInterface(String color) {
        var UIFactory = UIFactoryMaker.make(color);
        var button = UIFactory.createButton();
        var scrollBar = UIFactory.createScrollBar();

        return new UserInterface(button, scrollBar);

    }

}

