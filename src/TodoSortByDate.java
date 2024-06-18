import java.util.Comparator;

public class TodoSortByDate implements Comparator<TodoItem> {
    public int compare(TodoItem o1, TodoItem o2){
        return o1.getCurrent_date().compareTo(o2.getCurrent_date());
    }
}
