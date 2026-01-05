public class ToDoItem implements Completable{
    private String description;
    private boolean completed = false;

    public ToDoItem(String description){
        this.description = description;
    }

    public void complete(){
        completed = true;
    }

    @Override
    public void isComplete() {
        System.out.printf("The checklist \"%s\" is completed: %b\n", description, completed);
    }
}
