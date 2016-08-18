
public class Olympian {

	int bibNumber;
	static int number = 0;
	String name;
	String sport;
	String gender;
	String team;

	
	

public Olympian(String name, String gender, String sport, String team){
	
	this.name = name;
	this.gender = gender;
	this.sport = sport;
	this.team = team;
	number += 1;
	bibNumber = number;

}
void compete(){
	
	System.out.println(name + ", #" + bibNumber + ", is about to compete in " + sport + ".  Go team " + team + "!");
	
	
	System.out.println(" ");
}
static void beginOlympics(){
	
	System.out.println("Hello");
	
}
}