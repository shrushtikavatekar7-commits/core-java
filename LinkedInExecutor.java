class LinkedInExecutor {

    public static void main(String[] args) {

        Profile p1 = new Profile(1,"Shrushti","Java");
        LinkedIn l1 = new LinkedIn(101,"LinkedIn",p1);

        Profile p2 = new Profile(2,"Rahul","Python");
        LinkedIn l2 = new LinkedIn(102,"LinkedIn",p2);

        l1.display();
        l2.display();
    }
}