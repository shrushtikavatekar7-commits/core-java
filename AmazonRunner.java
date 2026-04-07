class AmazonRunner {

    public static void main(String[] args) {

        Amazon app = new Amazon();

        AmazonAccount acc = new AmazonAccount();
        acc.setUserId(1);
        acc.setUserName("user1");
        acc.setEmail("user1@amazon.com");

        app.createUserAccount(acc);
        app.getUserDetails();
    }
}