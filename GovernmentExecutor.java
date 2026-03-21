class GovernmentExecutor {

    public static void main(String[] args) {

        Policy p1 = new Policy(1,"Tax Reform","Finance");
        Government g1 = new Government(101,"India",p1);

        Policy p2 = new Policy(2,"Health Scheme","Medical");
        Government g2 = new Government(102,"USA",p2);

        g1.display();
        g2.display();
    }
}