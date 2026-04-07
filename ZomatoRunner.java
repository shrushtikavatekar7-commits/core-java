class ZomatoRunner {

    public static void main(String[] args) {

        ZomatoService service = new ZomatoService();

        ZomatoAccount acc1 = new ZomatoAccount();
        acc1.setUserName("nisha");
        acc1.setEmail("nisha@zomato.com");
        acc1.setPassword("1234");
        acc1.setContactNo(9876543210L);
        acc1.setGender("Female");

        boolean ref = service.createAccount(acc1);
        System.out.println(ref);
        service.getDetails();
    }
}