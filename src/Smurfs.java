// Copyright Wintriss Technical Schools 2013
/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */

public class Smurfs {

	private String name;
	String hatColor;
	String gender;

	Smurfs(String name, String hatColor, String gender) {
		this.name = name;
		this.hatColor = hatColor;
		this.gender = gender;
	}
	
	
	public static void main(String[] args) {
		
		Smurfs Handy = new Smurfs("Handy", "white", "male");
		Handy.eat();
		System.out.println(Handy.getName());
		
		Smurfs Papa = new Smurfs("Papa", "red", "male");
		System.out.println(Papa.getName());
		System.out.println(Papa.getHatColor());
		System.out.println(Papa.isGirlOrBoy());
		
		Smurfs Smurfette = new Smurfs("Smurfette", "white", "female");
		System.out.println(Smurfette.getName());
		System.out.println(Smurfette.getHatColor());
		System.out.println(Smurfette.isGirlOrBoy());
		
		
		
		
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		return "I have a " + hatColor  + " hat.";
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
		return "I am a " + gender + ".";
	}

}


