import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MovieReviewApp {
    private static Map<String, Movie> movieMap = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Movie Review App Menu:");
            System.out.println("1. Add Movie");
            System.out.println("2. Rate Movie");
            System.out.println("3. Review Movie");
            System.out.println("4. View Movie Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addMovie();
                    break;
                case 2:
                    rateMovie();
                    break;
                case 3:
                    reviewMovie();
                    break;
                case 4:
                    viewMovieDetails();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
        scanner.close();
    }

    private static void addMovie() {
        System.out.print("Enter movie title: ");
        String title = scanner.nextLine();
        System.out.print("Enter movie year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter director name: ");
        String director = scanner.nextLine();

        Movie movie = new Movie(title, year, director);
        movieMap.put(title, movie);
        System.out.println("Movie added successfully.");
    }

    private static void rateMovie() {
        System.out.print("Enter movie title to rate: ");
        String title = scanner.nextLine();
        Movie movie = movieMap.get(title);
        if (movie != null) {
            System.out.print("Enter rating (0.0 - 10.0): ");
            double rating = scanner.nextDouble();
            movie.setRating(rating);
            System.out.println("Movie rated successfully.");
        } else {
            System.out.println("Movie not found.");
        }
    }

    private static void reviewMovie() {
        System.out.print("Enter movie title to review: ");
        String title = scanner.nextLine();
        Movie movie = movieMap.get(title);
        if (movie != null) {
            System.out.print("Enter review: ");
            String review = scanner.nextLine();
            movie.setReview(review);
            System.out.println("Movie reviewed successfully.");
        } else {
            System.out.println("Movie not found.");
        }
    }

    private static void viewMovieDetails() {
        System.out.print("Enter movie title to view details: ");
        String title = scanner.nextLine();
        Movie movie = movieMap.get(title);
        if (movie != null) {
            System.out.println(movie);
        } else {
            System.out.println("Movie not found.");
        }
    }
}
