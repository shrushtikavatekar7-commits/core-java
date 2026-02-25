class FacebookExecutor {
    public static void main(String[] args) {

        Facebook.login("user@gmail.com", "fbpass");
        Facebook.login("9876543210", "fbpass");
        Facebook.login("user@gmail.com");
    }
}