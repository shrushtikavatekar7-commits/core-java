class YouTubeRunner{
    public static void main(String[] args){

        YouTube youtube=new YouTube();

        YouTubeAccount youtubeOne=new YouTubeAccount();
        youtubeOne.setuserId(1);
        youtubeOne.setUserName("niraj");
        youtubeOne.setEmail("niraj@youtube.com");

        boolean ref=youtube.createUserAccount(youtubeOne);
        System.out.println(ref);
        youtube.getUserDetails();

        YouTubeAccount youtubeTwo=new YouTubeAccount();
        youtubeTwo.setuserId(2);
        youtubeTwo.setUserName("udaya");
        youtubeTwo.setEmail("udaya@youtube.com");

        ref=youtube.createUserAccount(youtubeTwo);
        System.out.println(ref);
        youtube.getUserDetails();

        YouTubeAccount youtubeThree=new YouTubeAccount();
        youtubeThree.setuserId(3);
        youtubeThree.setUserName("aishu");
        youtubeThree.setEmail("aishu@youtube.com");

        ref=youtube.createUserAccount(youtubeThree);
        System.out.println(ref);
        youtube.getUserDetails();

        YouTubeAccount youtubeFour=new YouTubeAccount();
        youtubeFour.setuserId(4);
        youtubeFour.setUserName("nisha");
        youtubeFour.setEmail("nisha@youtube.com");

        ref=youtube.createUserAccount(youtubeFour);
        System.out.println(ref);
        youtube.getUserDetails();

        YouTubeAccount youtubeFive=new YouTubeAccount();
        youtubeFive.setuserId(5);
        youtubeFive.setUserName("afreen");
        youtubeFive.setEmail("afreen@youtube.com");

        ref=youtube.createUserAccount(youtubeFive);
        System.out.println(ref);
        youtube.getUserDetails();
    }
	}
	