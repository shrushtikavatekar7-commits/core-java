class ZeptoRunner {

    public static void main(String[] args) {

        Zepto zepto = new Zepto();

        ZeptoAccount zeptoOne = new ZeptoAccount();

        zeptoOne.setuserId(1);

        zeptoOne.setUserName("swathi");

        zeptoOne.setEmail("swathi@zepto.com");

        boolean ref = zepto.createUserAccount(zeptoOne);

        System.out.println(ref);

        zepto.getUserDetails();


        ZeptoAccount zeptoTwo = new ZeptoAccount();

        zeptoTwo.setuserId(2);

        zeptoTwo.setUserName("nidhi");

        zeptoTwo.setEmail("nidhi@zepto.com");

        ref = zepto.createUserAccount(zeptoTwo);

        System.out.println(ref);

        zepto.getUserDetails();


        ZeptoAccount zeptoThree = new ZeptoAccount();

        zeptoThree.setuserId(3);

        zeptoThree.setUserName("deepika");

        zeptoThree.setEmail("deepika@zepto.com");

        ref = zepto.createUserAccount(zeptoThree);

        System.out.println(ref);

        zepto.getUserDetails();


        ZeptoAccount zeptoFour = new ZeptoAccount();

        zeptoFour.setuserId(4);

        zeptoFour.setUserName("akash");

        zeptoFour.setEmail("akash@zepto.com");

        ref = zepto.createUserAccount(zeptoFour);

        System.out.println(ref);

        zepto.getUserDetails();


        ZeptoAccount zeptoFive = new ZeptoAccount();

        zeptoFive.setuserId(5);

        zeptoFive.setUserName("karthik");

        zeptoFive.setEmail("karthik@zepto.com");

        ref = zepto.createUserAccount(zeptoFive);

        System.out.println(ref);

        zepto.getUserDetails();
    }
}