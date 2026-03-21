class CCDExecutor {

    public static void main(String[] args) {

        Coffee c1 = new Coffee(1,"Latte",150);
        CCD ccd1 = new CCD(101,"BTM",c1);

        Coffee c2 = new Coffee(2,"Cappuccino",180);
        CCD ccd2 = new CCD(102,"Indiranagar",c2);

        ccd1.display();
        ccd2.display();
    }
}