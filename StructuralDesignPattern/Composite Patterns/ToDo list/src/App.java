public class App {

    public static void main(String[] args) {
        Checklist checklist = new Checklist();
        var item1= new ToDoItem("do this");
        var item2 = new ToDoItem("do that");
        var item3 = new ToDoItem("do something else");
        checklist.addItem(item1);
        checklist.addItem(item2);
        checklist.addItem(item3);

        item2.complete();

        checklist.isComplete();

    }

}
