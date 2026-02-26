class BookMyShow {

    public static void main(String[] args) {
        createAccount("Tanvi", "Movie", "24 may 2004","Evening Show");
    }

    public static void createAccount(String name,
                                     String bookingType,
									 String date,
                                     String showTime) {

        System.out.println("The name of the user is: " + name);
        System.out.println("The booking type selected by the user is: " + bookingType);
		System.out.println("The movie date the user selected is :" + date);
        System.out.println("The show time chosen by the user is: " + showTime);
    }
}
