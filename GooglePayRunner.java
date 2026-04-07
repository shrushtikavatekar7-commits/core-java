class GooglePayRunner {

    public static void main(String[] args) {

        GooglePayService service = new GooglePayService();

        GooglePayAccount acc = new GooglePayAccount();
        acc.setUserName("vijay");
        acc.setEmail("vijay@gpay.com");
        acc.setPassword("gpay123");
        acc.setContactNo(9012345678L);
        acc.setBalance(5000.0);

        System.out.println(service.createAccount(acc));
        service.getDetails();
    }
}