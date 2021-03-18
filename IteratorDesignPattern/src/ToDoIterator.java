
import java.util.Iterator;

/**
 * An iterator of the ToDo list.
 * @author Kevin Hogan
 *
 */
public class ToDoIterator implements Iterator {
	private ToDo[] todos;
	private int position = 0;
	
	/**
	 * Creates a ToDo array to store the ToDo list.
	 * @param todos is an array of all the ToDo list.
	 */
	public ToDoIterator(ToDo[] todos) {
		this.todos = todos;
	}
	
	/**
	 * Stores the next ToDo in the list of ToDos.
	 * @return Returns the next ToDo.
	 */
	public ToDo next() {
		ToDo toDo = todos[position];
		position = position + 1;
		return toDo;
	}
	
	/**
	 * Checks to see if there is another ToDo in the list of ToDo.
	 * @return Returns true or false depending on is there is another ToDo in the list.
	 */
	public boolean hasNext() {
		if(position >= todos.length || todos[position] == null) {
			return false;
		} else {
			return true;
		}
	}

}
