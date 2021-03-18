
import java.util.ArrayList;
import java.util.Iterator;

/**
 * A ToDo list for the contractor.
 * @author Kevin Hogan
 *
 */
public class ContractorToDoList {
	static final int MAX_SIZE = 2;
	private String address;
	private ToDo[] todos;
	private int count = 0;
	
	/**
	 * Creates the contractors ToDo list.
	 * @param address is the address of the job on the ToDo list.
	 */
	public ContractorToDoList(String address) {
		this.address = address;
		todos = new ToDo[MAX_SIZE];
	}
	
	/**
	 * Adds a ToDo to the list of ToDos.
	 * @param title is the name of the ToDo
	 * @param description is the description of what the ToDo is about.
	 * @param price is how much the ToDo is.
	 * @param contact is the business contact of the ToDo.
	 * @param supplies is what is needed for the ToDo.
	 */
	public void addToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		ToDo todo = new ToDo(title, description, price, contact, supplies);
		if(count >= MAX_SIZE) {
			todos = growArray(todos);
		}
		todos[count] = todo;
		count = count + 1;
	}
	
	/**
	 * Creates a ToDo iterator.
	 * @return Returns a new ToDo iterator.
	 */
	public ToDoIterator createIterator() {
		return new ToDoIterator(todos);
	}
	
	/**
	 * The address of the ToDo.
	 * @return Returns the address.
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * The total cost of all the ToDos.
	 * @return Returns the total cost.
	 */
	public double getTotalCost() {
		double totalCost = 0.0;
		for(int i = 0; i < count; i++) {
			if(todos[i] != null) {
				totalCost += todos[i].getPrice();
			}
		}
		return totalCost;
	}
	
	/**
	 * Doubles the size of the todos array.
	 * @param todos is the array that stores the ToDo list.
	 * @return Returns the todos array.
	 */
	private ToDo[] growArray(ToDo[] todos) {
		ToDo[] temp = new ToDo[MAX_SIZE * 2];
		for(int i = 0; i < todos.length; i++) {
			temp[i] = todos[i];
		}
		return temp;
	}

}
