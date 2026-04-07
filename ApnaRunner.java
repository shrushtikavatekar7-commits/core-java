class ApnaRunner {

    public static void main(String[] args) {

        Apna app = new Apna();

        ApnaAccount acc = new ApnaAccount();

        acc.setuserId(1);

        acc.setUserName("rahul");

        acc.setEmail("rahul@apna.com");

        boolean ref = app.createUserAccount(acc);

        System.out.println(ref);

        app.getUserDetails();
    }
}