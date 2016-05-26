public class Friends {

	public static void main(String[] args) {
		// 3. Create an instance of Classmate for each person in your class.

		Classmate Bob = new Classmate();
		Classmate Joe = new Classmate();
		Classmate Fred = new Classmate();
		Classmate Mikaela = new Classmate();
		Classmate Kaiya = new Classmate();
		Classmate Katherine = new Classmate();

		// 4. set descriptions for each Classmate

		Bob.setDescription("Bob is great.");
		Joe.setDescription("Joe is fab.");
		Fred.setDescription("Fred is awesome.");
		Mikaela.setDescription("Mikaela is the best.");
		Kaiya.setDescription("Kaiya is amazing.");
		Katherine.setDescription("Katherine is super cool.");

		// 5. Use your getter to print out each description

		System.out.println(Bob.getDescription());
		System.out.println(Joe.getDescription());
		System.out.println(Fred.getDescription());
		System.out.println(Mikaela.getDescription());
		System.out.println(Kaiya.getDescription());
		System.out.println(Katherine.getDescription());

	}

}

class Classmate {
	String potato;

	// 1. create a setter that sets a description this person
	void setDescription(String potato) {

		this.potato = potato;

	}

	// 2. create a getter that gets a description of this person
	String getDescription() {

		return (potato);

	}
}
