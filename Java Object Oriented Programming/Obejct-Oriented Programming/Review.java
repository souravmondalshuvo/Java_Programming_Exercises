public class Review {
 
    private String review_text;
    private String reviewer_name;
    private double rating;

    public Review(String review_text, String reviewer_name, double rating) {
        this.review_text = review_text;
        this.reviewer_name = reviewer_name;
        this.rating = rating;
    }

    public String getReviewText() {
        return review_text;
    }

    public String getReviewerName() {
        return reviewer_name;
    }

    public double getRating() {
        return rating;
    }
}