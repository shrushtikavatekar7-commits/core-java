class Movie {

    static String movieName;
    static String director;
    static String hero;
    static String heroine;
    static double budget;
    static double rating;
    static String language;

    public static boolean createMovie(String mName, String dir,
                                      String h, String her,
                                      double b, double r,
                                      String lang) {

        boolean isMovieCreated = false;

        boolean isNameValid = false;
        boolean isDirectorValid = false;
        boolean isHeroValid = false;
        boolean isHeroineValid = false;
        boolean isBudgetValid = false;
        boolean isRatingValid = false;
        boolean isLanguageValid = false;

        if (mName != null && !mName.isEmpty()) {
            movieName = mName;
            isNameValid = true;
        } else {
            System.out.println("Movie name is invalid");
        }

        if (dir != null && !dir.isEmpty()) {
            director = dir;
            isDirectorValid = true;
        } else {
            System.out.println("Director name is invalid");
        }

        if (h != null && !h.isEmpty()) {
            hero = h;
            isHeroValid = true;
        } else {
            System.out.println("Hero name is invalid");
        }

        if (her != null && !her.isEmpty()) {
            heroine = her;
            isHeroineValid = true;
        } else {
            System.out.println("Heroine name is invalid");
        }

        if (b > 0) {
            budget = b;
            isBudgetValid = true;
        } else {
            System.out.println("Budget is invalid");
        }

        if (r >= 0 && r <= 10) {
            rating = r;
            isRatingValid = true;
        } else {
            System.out.println("Rating is invalid");
        }

        if (lang != null && !lang.isEmpty()) {
            language = lang;
            isLanguageValid = true;
        } else {
            System.out.println("Language is invalid");
        }

        if (isNameValid && isDirectorValid && isHeroValid &&
            isHeroineValid && isBudgetValid &&
            isRatingValid && isLanguageValid) {

            isMovieCreated = true;
        }

        return isMovieCreated;
    }

    public static void getMovieDetails() {

        System.out.println("Movie Name: " + movieName);
        System.out.println("Director: " + director);
        System.out.println("Hero: " + hero);
        System.out.println("Heroine: " + heroine);
        System.out.println("Budget: " + budget + " Crores");
        System.out.println("Rating: " + rating);
        System.out.println("Language: " + language);
        System.out.println("--------------------------------");
    }
}