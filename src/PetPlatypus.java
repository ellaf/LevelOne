public class PetPlatypus {
	private String name;
	
	String color;
	int length;
	int happiness;
	
	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
	
		PetPlatypus Bob = new PetPlatypus("orange", 2, 100);
		
		//2. Call the sayHi method
		Bob.sayHi();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
	}
	
	public PetPlatypus(String color, int length, int happiness){
		
		this.color = color;
		this.length = length;
		this.happiness = happiness;
		
		
		
	}

	
	
}

