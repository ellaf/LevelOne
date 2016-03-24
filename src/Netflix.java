
public class Netflix {
	public static void main(String[] args) {

		Movie theFaultInOurStars = new Movie("The Fault in Our Stars", 2);
		Movie theMartian = new Movie("The Martian", 5);
		Movie insideOut = new Movie("Inside Out", 4);
		Movie sharknadoThree = new Movie("Sharknado 3", 0);
		Movie theHungerGames = new Movie("The Hunger Games", 3);

		theMartian.getTicketPrice();

		NetflixQueue queue = new NetflixQueue();

		queue.addMovie(theMartian);
		queue.addMovie(sharknadoThree);
		queue.addMovie(insideOut);
		queue.addMovie(theFaultInOurStars);
		queue.addMovie(theHungerGames);

		queue.printMovies();

		System.out.println("The best movie is: " + queue.getBestMovie());

		queue.sortMoviesByRating();

		System.out.println("The second best movie is: " + queue.getMovie(1));

	}
}
