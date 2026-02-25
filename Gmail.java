class Gmail {

    public static void login(String email, String password) {
        System.out.println("Login using Email & Password");
    }

    public static void login(String email, int otp) {
        System.out.println("Login using Email & OTP");
    }

    public static void login(long mobile) {
        System.out.println("Recovery using Mobile Number");
    }
}