
public class Square {
	
	int length;
	int perimeter;
	
	public static void main(String[] args) {
		
Square s1 = new Square(10);		
s1.areaCalc();
s1.perimeterCalc();


Square s2 = new Square(55);
s2.areaCalc();
s2.perimeterCalc();
		
	}
	
void areaCalc(){
	
	int area = length*length;
	System.out.println("Area: " + area);
	
}

void perimeterCalc(){
	
	int perimeter = length*4;
	System.out.println("Perimeter: " + perimeter);
	
}

Square(int length){

	this.length = length;

}


}
