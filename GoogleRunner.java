class GoogleRunner {

    public static void main(String[] args) {

        GoogleService service = new GoogleService();

        GoogleAccount acc = new GoogleAccount();
        acc.setUserName("anita");
        acc.setEmail("anita@google.com");
        acc.setPassword("google123");
        acc.setContactNo(9998887776L);
        acc.setLocation("India");

        System.out.println(service.createAccount(acc));
        service.getDetails();
    }
}