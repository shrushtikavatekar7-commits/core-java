class DanceExecutor {

    public static void main(String[] args) {

        Form f1 = new Form(1,"Classical","India");
        Dance d1 = new Dance(101,"Bharatanatyam",f1);

        Form f2 = new Form(2,"Western","USA");
        Dance d2 = new Dance(102,"HipHop",f2);

        d1.display();
        d2.display();
    }
}