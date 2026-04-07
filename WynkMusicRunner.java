class WynkMusicRunner {
    public static void main(String[] args) {
        WynkMusic wynk = new WynkMusic();
        WynkMusicAccount wynkOne = new WynkMusicAccount();
		
        wynkOne.setuserId(1);
        wynkOne.setUserName("likhtha");
        wynkOne.setEmail("likhtha@wynk.com");
        boolean ref = wynk.createUserAccount(wynkOne);
        System.out.println(ref);
        wynk.getUserDetails();
        WynkMusicAccount wynkTwo = new WynkMusicAccount();
		
        wynkTwo.setuserId(2);
        wynkTwo.setUserName("swathi");
        wynkTwo.setEmail("swathi@wynk.com");
        ref = wynk.createUserAccount(wynkTwo);
        System.out.println(ref);
        wynk.getUserDetails();
        WynkMusicAccount wynkThree = new WynkMusicAccount();
        
		wynkThree.setuserId(3);
        wynkThree.setUserName("nidhi");
        wynkThree.setEmail("nidhi@wynk.com");
        ref = wynk.createUserAccount(wynkThree);
        System.out.println(ref);
        wynk.getUserDetails();
        WynkMusicAccount wynkFour = new WynkMusicAccount();
        
		wynkFour.setuserId(4);
        wynkFour.setUserName("deepika");
        wynkFour.setEmail("deepika@wynk.com");
        ref = wynk.createUserAccount(wynkFour);
        System.out.println(ref);
        wynk.getUserDetails();
        WynkMusicAccount wynkFive = new WynkMusicAccount();
        
		wynkFive.setuserId(5);
        wynkFive.setUserName("akash");
        wynkFive.setEmail("akash@wynk.com");
        ref = wynk.createUserAccount(wynkFive);
        System.out.println(ref);
        wynk.getUserDetails();
    }
}