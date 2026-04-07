class FlipkartRunner {

    public static void main(String[] args) {

        Flipkart app = new Flipkart();

        FlipkartAccount acc = new FlipkartAccount();

        acc.setuserId(1);
        acc.setUserName("rahul");
        acc.setEmail("rahul@flipkart.com");

        boolean ref = app.createUserAccount(acc);

        System.out.println(ref);

        app.getUserDetails();
    }
}