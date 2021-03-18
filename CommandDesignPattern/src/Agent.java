
/**
 * Noah Jackson
 * Homework 07
 */

import java.util.ArrayList;

public class Agent {

	private ArrayList<Command> orders;

	public Agent() {
		orders = new ArrayList<Command>();
	}

	/**
	 * This method adds the command to the list of Orders.
	 * 
	 * @param command
	 */
	public void placeOrder(Command command) {
		orders.add(command);
	}

	/**
	 * Method loops through the list of orders and executes them.
	 */
	public void processOrders() {

		for (Command command : orders) {
			command.execute();
		}
		orders.clear();

	}

}
