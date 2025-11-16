//Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews, and methods for adding and retrieving reviews.

import java.util.ArrayList;
import java.util.Arrays;
public class MovieTester {
    public static void main(String[] args) {
        
        Movie movie_1 = new Movie("Titanic", "James Cameron", new ArrayList(Arrays.asList("Leonardo DiCaprio", "Kate Winslet")));
        
        Review review_1 = new Review("Great movie!", "Irvine Rolf", 4.5);
        Review review_2 = new Review("Highly recommended!", "Ashkii Karlheinz", 4.5);
        Review review_3 = new Review("A classic that never gets old.", "Nele Athol", 4.0);
        Review review_4 = new Review("Great movie!", "Cipactli Anselma", 4.0);
        Review review_5 = new Review("Great movie!", "Martin Nadine", 4.0);

        movie_1.addReview(review_1);
        movie_1.addReview(review_2);
        movie_1.addReview(review_3);
        movie_1.addReview(review_4);
        movie_1.addReview(review_5);

        Movie movie_2 = new Movie("The Godfather", "Francis Ford Coppola", new ArrayList(Arrays.asList("Marlon Brando", "Al Pacino", "James Cann")));

        movie_2.addReview(review_1);
        movie_2.addReview(review_4);
        movie_2.addReview(review_5);

        System.out.println("Reviews for '" + movie_1.getTitle() + "': \n");
        for(Review review : movie_1.getReviews()) {
            System.out.println(review.getReviewText() + " by " + review.getReviewerName() + " - " + review.getRating());
        }

        System.out.println("\nReviews for '" + movie_2.getTitle() + "': \n");
        for(Review review : movie_2.getReviews()) {
            System.out.println(review.getReviewText() + " by " + review.getReviewerName() + " - " + review.getRating());
        }
    }
}