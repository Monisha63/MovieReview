
public class Movie {
    private String title;
    private int year;
    private String director;
    private double rating;
    private String review;

    public Movie(String title, int year, String director) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = 0.0;
        this.review = "";
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Movie: " + title + " (" + year + ") - Directed by " + director + "\n"
                + "Rating: " + rating + "\n"
                + "Review: " + review;
    }
}
