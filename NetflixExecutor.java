class NetflixExecutor {

    public static void main(String[] args) {

        Netflix netflix = new Netflix();

        netflix.addWebSeries("Money Heist");
        netflix.addWebSeries("Dark");
        netflix.addWebSeries("Stranger Things");

        System.out.println("All Web Series:");
        netflix.getWebSeries();

        System.out.println("-----------");

        netflix.updateWebSeries("Dark", "Wednesday");

        System.out.println("After Update:");
        netflix.getWebSeries();

        System.out.println("-----------");

        netflix.deleteWebSeries("Money Heist");

        System.out.println("After Delete:");
        netflix.getWebSeries();
    }
}