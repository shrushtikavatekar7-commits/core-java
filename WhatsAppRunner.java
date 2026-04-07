class WhatsAppRunner {

    public static void main(String[] args) {

        WhatsAppService service = new WhatsAppService();

        WhatsAppAccount acc = new WhatsAppAccount();
        acc.setUserName("kavya");
        acc.setEmail("kavya@whatsapp.com");
        acc.setPassword("wa123");
        acc.setContactNo(9876543211L);
        acc.setStatus("Hey there!");

        System.out.println(service.createAccount(acc));
        service.getDetails();
    }
}