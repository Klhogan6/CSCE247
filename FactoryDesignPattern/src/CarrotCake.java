/**
 * A cake that is a carrot cake.
 * @author Kevin Hogan
 *
 */
public class CarrotCake extends Cake {
	
	/**
	 * Gathers the name of cake, price, number of layers, the shape, flavor, icing,
	 * and decorations of the cake.
	 */
	public CarrotCake() {
		name = "Carrot Cake";
		price = 54.99;
		numLayers = 2;
		shape = Shape.ROUND;
		flavor = "Carrot";
		icing = "Cream Cheese";
		decorations.add("Walnuts");
		decorations.add("Candy Carrots");
	}

}
