/**
 * 
 */
package it.unibo.oop.lab.enum1;

/**
 * Represents an enumeration for declaring sports;
 * 
 * 1) Complete the definition of the enumeration.
 * 
 */
public enum Sport {
	
	BASKET("Basket"),
	SOCCER("Soccer"),
	TENNIS("Tennis"),
	BIKE("Bike"),
	F1("F1"),
	MOTOGP("MotoGP"),
	VOLLEY("Volley");
	
	
	private String name;

	private Sport(final String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
