class BigDaddyExecutor {

    public static void main(String[] args) {

        Cassino c1 = new Cassino(1,"Royal","Goa");
        BigDaddy b1 = new BigDaddy(101,"Ravi",c1);

        Cassino c2 = new Cassino(2,"Golden","Mumbai");
        BigDaddy b2 = new BigDaddy(102,"Raj",c2);

        b1.display();
        b2.display();
    }
}