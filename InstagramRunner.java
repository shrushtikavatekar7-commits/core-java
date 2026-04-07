class InstagramRunner {

    public static void main(String[] args) {

        Instagram app = new Instagram();

        InstagramAccount acc = new InstagramAccount();
        acc.setUserId(1);
        acc.setUserName("user1");
        acc.setEmail("user1@insta.com");

        app.createUserAccount(acc);
        app.getUserDetails();
    }
}