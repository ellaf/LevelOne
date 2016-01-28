import org.teachingextensions.logo.Tortoise;

public class Methods {
public static void main(String[] args) {
	
	Methods m = new Methods();
	
	m.food("apples");
	
	m.truth(4);
	
	m.jump(6);
	
	m.jump("piggy");
	
	for (int i = 0; i < 4; i++) {
	m.drawLine();
	}
	

	
}

void food(String fruit){
	System.out.println("I like " + fruit);
}

void truth(int x){
	if(x>5){
		System.out.println("Geeks rule");
	}else{
		System.out.println("Nerds rule");
	}
}

void drawLine(){
	Tortoise.move(100);
	Tortoise.turn(90);
}

void jump(int height){
	if(height > 100){
		System.out.println("the mouse jumped over the moon.");
	}
	if(height > 50){
		System.out.println("The moues jumped over the broom.");
	}
	if(height > 5){
		System.out.println("The mouse jumped over the candlestick.");
	}
}

void jump(String animal){
	System.out.println("The mouse jumped over the " + animal);
}



}
