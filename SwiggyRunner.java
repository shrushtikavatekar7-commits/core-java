class SwiggyRunner {

    public static void main(String[] args) {

        SwiggyService service = new SwiggyService();

        SwiggyAccount acc1 = new SwiggyAccount();
        acc1.setUserName("kiran");
        acc1.setEmail("kiran@swiggy.com");
        acc1.setPassword("abcd");
        acc1.setContactNo(9123456780L);
        acc1.setGender("Male");

        boolean ref = service.createAccount(acc1);
        System.out.println(ref);
        service.getDetails();
    }
}