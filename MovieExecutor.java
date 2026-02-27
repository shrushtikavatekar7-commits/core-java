public class MovieExecutor {

    public static void main(String[] args) {

        boolean isCreated = Movie.createMovie(
                "Kantara",
                "Rishab Shetty",
                "Rishab Shetty",
                "Sapthami Gowda",
                16,
                9.2,
                "Kannada"
        );

        if (isCreated) {
            Movie.getMovieDetails();
        }
    }
}