import java.util.ArrayList;
import java.util.Arrays;

class Movie {
    private String title;
    private String director;
    private ArrayList<String> actors;
    private ArrayList<Review> reviews;

    public Movie(String title, String director, ArrayList<String> actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    public ArrayList<Review> getReviews() {
        return this.reviews;
    }

    public String getTitle() {
        return this.title;  // Return the title directly
    }

    public String getDirector() {
        return this.director;  // Return the director directly
    }

    public ArrayList<String> getActors() {
        return this.actors;
    }
}

class Review {
    private String reviewerName;
    private String reviewerText;
    private double rating;

    public Review(String reviewerName, String reviewerText, double rating) {
        this.reviewerName = reviewerName;
        this.reviewerText = reviewerText;
        this.rating = rating;
    }

    public String getReviewerName() {
        return this.reviewerName;
    }

    public String getReviewerText() {
        return this.reviewerText;
    }

    public double getRating() {
        return this.rating;
    }
}

class ProjectMovie {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Rayaan", "Dhanuse", new ArrayList<>(Arrays.asList("Dhanuse", "Selvaragavan", "Thusara", "SJ Surya")));
         System.out.println(movie1.asList());
        // Adding reviews to the movie
        movie1.addReview(new Review("Irvine Rolf", "Great movie!", 4.5));
        movie1.addReview(new Review("Ashkii Karlheinz", "Highly recommended!", 4.5));
        movie1.addReview(new Review("Nele Athol", "A classic that never gets old.", 4.0));
        movie1.addReview(new Review("Cipactli Anselma", "Great movie!", 4.0));
        movie1.addReview(new Review("Martin Nadine", "Highly recommended!", 4.0));

        // Printing reviews for the movie
        System.out.println("\nReviews for " + movie1.getTitle() + ":");
        for (Review review : movie1.getReviews()) {
            System.out.println(review.getReviewerName() + " (" + review.getRating() + "): " + review.getReviewerText());
        }
    }
}

