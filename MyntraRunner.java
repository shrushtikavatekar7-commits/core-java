class MyntraRunner {

    public static void main(String[] args) {

        MyntraService service = new MyntraService();

        MyntraAccount acc1 = new MyntraAccount();
        acc1.setUserName("sneha");
        acc1.setEmail("sneha@myntra.com");
        acc1.setPassword("myn123");
        acc1.setContactNo(9012345678L);
        acc1.setGender("Female");

        boolean ref = service.createAccount(acc1);
        System.out.println(ref);
        service.getDetails();
    }
}