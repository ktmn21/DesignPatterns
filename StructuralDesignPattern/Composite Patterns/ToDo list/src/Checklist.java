import java.util.ArrayList;
import java.util.List;

public class Checklist implements Completable{
    private final List<ToDoItem> toDoItems = new ArrayList<>();

    public void addItem (ToDoItem item){
        toDoItems.add(item);
    }


    @Override
    public void isComplete() {
        toDoItems.forEach(ToDoItem::isComplete);
    }
}
