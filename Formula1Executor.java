class Formula1Executor {

    public static void main(String[] args) {

        Franchisie f1 = new Franchisie(1,"Ferrari","Italy");
        Formula1 r1 = new Formula1(201,"Monaco GP",f1);

        Franchisie f2 = new Franchisie(2,"Mercedes","Germany");
        Formula1 r2 = new Formula1(202,"British GP",f2);

        Franchisie f3 = new Franchisie(3,"RedBull","Austria");
        Formula1 r3 = new Formula1(203,"Italian GP",f3);

        r1.display();
        r2.display();
        r3.display();
    }
}