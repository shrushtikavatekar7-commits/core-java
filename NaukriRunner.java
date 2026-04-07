class NaukriRunner {

    public static void main(String[] args) {

        Naukri app = new Naukri();

        NaukriAccount acc = new NaukriAccount();

        acc.setuserId(1);

        acc.setUserName("kiran");

        acc.setEmail("kiran@naukri.com");

        boolean ref = app.createUserAccount(acc);

        System.out.println(ref);

        app.getUserDetails();
    }
}