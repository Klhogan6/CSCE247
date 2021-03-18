/**
 * A cake that is a black forest cake.
 * @author Kevin Hogan
 *
 */
public class BlackForestCake extends Cake {
	
	/**
	 * Gathers the name of the cake, price, number of layers, the shape, flavor, icing,
	 * and decorations of the cake.
	 */
	public BlackForestCake() {
		name = "Black Forest Cake";
		price = 47.99;
		numLayers = 3;
		shape = Shape.ROUND;
		flavor = "Black Forest";
		icing = "Whipped Cream";
		decorations.add("Cherries");
		decorations.add("Chocolate Flakes");
		decorations.add("Whipped Cream");
	}

}
