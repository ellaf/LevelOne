
public class SpongeRunnerClass {
	public static void main(String[] args) {

		Spongebob bobert = new Spongebob("Spongebob");
		bobert.eat();
		bobert.laugh();

		Spongebob patty = new Spongebob("Patrick");
		System.out.println(patty.getName());
		patty.eat();
		patty.laugh();

		Spongebob squid = new Spongebob("Squidward");
		System.out.println(squid.getName());
		squid.eat();
		squid.laugh();

	}
}
