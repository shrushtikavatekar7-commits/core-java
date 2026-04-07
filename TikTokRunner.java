class TikTokRunner {

    public static void main(String[] args) {

        TikTokService service = new TikTokService();

        TikTokAccount acc = new TikTokAccount();
        acc.setUserName("arjun");
        acc.setEmail("arjun@tiktok.com");
        acc.setPassword("tt123");
        acc.setContactNo(9123456789L);
        acc.setBio("Content creator");

        System.out.println(service.createAccount(acc));
        service.getDetails();
    }
}