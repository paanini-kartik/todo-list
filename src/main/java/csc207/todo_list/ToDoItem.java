package csc207.todo_list;

public class ToDoItem {

    private String description;
    private boolean done;

    public ToDoItem() {
        this("", false);
    }

    public ToDoItem(String desc, boolean done) {
        this.description = desc;
        this.done = done;
    }

    public void toggleStatus() {
        done = !done;
    }

    public void editDescription(String newDesc) {
        description = newDesc;
    }

    public String toString() {
        String string = description;
        if (done) {
            string = description + " (done)";
        }
        return string;
    }

    public boolean getDone() {
        return done;
    }
}
