class PlaystoreExecutor {

    public static void main(String[] args) {

        boolean app1 = Playstore.createApp("WhatsApp", "Meta", 45.5, 4.5,
                500000000, true, "Communication", "2.24.1");
        if (app1) Playstore.getAppDetails();

        boolean app2 = Playstore.createApp("Instagram", "Meta", 60.2, 4.3,
                1000000000, true, "Social", "325.1");
        if (app2) Playstore.getAppDetails();

        boolean app3 = Playstore.createApp("YouTube", "Google", 80.0, 4.4,
                5000000000L > Integer.MAX_VALUE ? 2000000000 : 2000000000,
                true, "Video", "19.02");
        if (app3) Playstore.getAppDetails();

        boolean app4 = Playstore.createApp("Facebook", "Meta", 70.5, 4.1,
                1000000000, true, "Social", "450.0");
        if (app4) Playstore.getAppDetails();

        boolean app5 = Playstore.createApp("Snapchat", "Snap Inc", 55.3, 4.0,
                800000000, true, "Social", "12.5");
        if (app5) Playstore.getAppDetails();

        boolean app6 = Playstore.createApp("Telegram", "Telegram FZ", 40.0, 4.6,
                900000000, true, "Communication", "10.8");
        if (app6) Playstore.getAppDetails();

        boolean app7 = Playstore.createApp("Amazon", "Amazon Mobile", 65.0, 4.2,
                600000000, true, "Shopping", "28.3");
        if (app7) Playstore.getAppDetails();

        boolean app8 = Playstore.createApp("Flipkart", "Flipkart Pvt Ltd", 58.0, 4.3,
                500000000, true, "Shopping", "9.12");
        if (app8) Playstore.getAppDetails();

        boolean app9 = Playstore.createApp("Spotify", "Spotify AB", 75.0, 4.5,
                700000000, true, "Music", "8.9");
        if (app9) Playstore.getAppDetails();

        boolean app10 = Playstore.createApp("Zoom", "Zoom Video", 35.0, 4.4,
                400000000, true, "Business", "5.17");
        if (app10) Playstore.getAppDetails();

        boolean app11 = Playstore.createApp("Google Maps", "Google", 90.0, 4.6,
                500000000, true, "Navigation", "11.12");
        if (app11) Playstore.getAppDetails();

        boolean app12 = Playstore.createApp("Paytm", "One97", 50.0, 4.2,
                300000000, true, "Finance", "10.4");
        if (app12) Playstore.getAppDetails();

        boolean app13 = Playstore.createApp("PhonePe", "PhonePe Pvt Ltd", 48.0, 4.3,
                350000000, true, "Finance", "12.1");
        if (app13) Playstore.getAppDetails();

        boolean app14 = Playstore.createApp("Swiggy", "Swiggy Ltd", 52.0, 4.4,
                200000000, true, "Food", "4.25");
        if (app14) Playstore.getAppDetails();

        boolean app15 = Playstore.createApp("Zomato", "Zomato Ltd", 53.0, 4.3,
                250000000, true, "Food", "17.8");
        if (app15) Playstore.getAppDetails();
    }
}