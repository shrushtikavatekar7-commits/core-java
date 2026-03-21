class GrowExecutor {

    public static void main(String[] args) {

        Stock s1 = new Stock(1,"TCS",3500);
        Groww g1 = new Groww(101,"Ravi",s1);

        Stock s2 = new Stock(2,"Infosys",1500);
        Groww g2 = new Groww(102,"Raj",s2);

        g1.display();
        g2.display();
    }
}