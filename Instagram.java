class Instagram {

    public static void login(String username, String password) {
        System.out.println("Login using Username & Password");
        System.out.println("Welcome " + username);
    }

    public static void login(long mobileNumber, String password) {
        System.out.println("Login using Mobile & Password");
        System.out.println("Welcome User with Mobile: " + mobileNumber);
    }

    public static void login(String email) {
        System.out.println("Login using Email OTP");
        System.out.println("OTP sent to: " + email);
    }
}