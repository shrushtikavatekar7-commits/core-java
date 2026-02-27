class Playstore {

    static String appName;
    static String developerName;
    static double appSize;
    static double rating;
    static int downloads;
    static boolean isFree;
    static String category;
    static String version;

    public static boolean createApp(String name, String devName,
                                    double size, double rate,
                                    int down, boolean free,
                                    String cat, String ver) {

        boolean isAppCreated = false;

        boolean isNameValid = false;
        boolean isDevValid = false;
        boolean isSizeValid = false;
        boolean isRatingValid = false;
        boolean isDownloadValid = false;
        boolean isCategoryValid = false;
        boolean isVersionValid = false;

        if (name != null && !name.isEmpty()) {
            appName = name;
            isNameValid = true;
        } else {
            System.out.println("App Name is invalid");
        }

        if (devName != null && !devName.isEmpty()) {
            developerName = devName;
            isDevValid = true;
        } else {
            System.out.println("Developer Name is invalid");
        }

        if (size > 0) {
            appSize = size;
            isSizeValid = true;
        } else {
            System.out.println("App Size is invalid");
        }

        if (rate >= 0 && rate <= 5) {
            rating = rate;
            isRatingValid = true;
        } else {
            System.out.println("Rating is invalid");
        }

        if (down >= 0) {
            downloads = down;
            isDownloadValid = true;
        } else {
            System.out.println("Downloads count is invalid");
        }

        if (cat != null && !cat.isEmpty()) {
            category = cat;
            isCategoryValid = true;
        } else {
            System.out.println("Category is invalid");
        }

        if (ver != null && !ver.isEmpty()) {
            version = ver;
            isVersionValid = true;
        } else {
            System.out.println("Version is invalid");
        }

        isFree = free;

        if (isNameValid && isDevValid && isSizeValid &&
            isRatingValid && isDownloadValid &&
            isCategoryValid && isVersionValid) {

            isAppCreated = true;
        }

        return isAppCreated;
    }

    public static void getAppDetails() {

        System.out.println("App Name: " + appName);
        System.out.println("Developer: " + developerName);
        System.out.println("Size: " + appSize + " MB");
        System.out.println("Rating: " + rating);
        System.out.println("Downloads: " + downloads);
        System.out.println("Free: " + isFree);
        System.out.println("Category: " + category);
        System.out.println("Version: " + version);
        System.out.println("----------------------------------");
    }
}