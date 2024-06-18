import java.util.Comparator;

public class TodoSortByName implements Comparator<TodoItem>
{
    public int compare(TodoItem o1, TodoItem o2){
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
