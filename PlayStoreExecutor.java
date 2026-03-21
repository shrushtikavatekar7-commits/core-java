class PlayStoreExecutor {

    public static void main(String[] args) {

        Application a1 = new Application(1,"WhatsApp","Social");
        PlayStore ps1 = new PlayStore(101,"Google Play",a1);

        Application a2 = new Application(2,"Instagram","Social");
        PlayStore ps2 = new PlayStore(102,"Google Play",a2);

        ps1.display();
        ps2.display();
    }
}