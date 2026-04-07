class GmailRunner {

    public static void main(String[] args) {

        GmailService service = new GmailService();

        GmailAccount acc = new GmailAccount();
        acc.setUserName("rahul");
        acc.setEmail("rahul@gmail.com");
        acc.setPassword("gmail123");
        acc.setContactNo(9876543212L);
        acc.setRecoveryEmail("rahul@backup.com");

        System.out.println(service.createAccount(acc));
        service.getDetails();
    }
}