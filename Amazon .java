class Amazon {

    public static void login(String username, String password) {
        System.out.println("Amazon Login via Username");
    }

    public static void login(String email, String password, boolean rememberMe) {
        System.out.println("Amazon Login with Remember Me Option");
    }

    public static void login(long mobile, int otp) {
        System.out.println("Amazon Login via OTP");
    }
}