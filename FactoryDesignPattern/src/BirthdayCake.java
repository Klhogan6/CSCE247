/**
 * A cake that is a birthday cake.
 * @author Kevin Hogan
 *
 */
public class BirthdayCake extends Cake {
	
	/**
	 * Gathers the name of cake, price, number of layers, the shape, flavor, icing,
	 * and decorations of the cake.
	 */
	public BirthdayCake() {
		name = "Birthday Cake";
		price = 109.99;
		numLayers = 1;
		shape = Shape.SHEET;
		flavor = "Funfetti";
		icing = "Vanilla";
		decorations.add("Sprinkles");
		decorations.add("Candy Flowers");
		decorations.add("Icing Writing");
	}

}
