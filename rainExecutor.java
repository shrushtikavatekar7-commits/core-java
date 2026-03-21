class TrainExecutor {

    public static void main(String[] args) {

        Boggiy b1 = new Boggiy(1,"Sleeper",72);
        Train t1 = new Train(101,"Express",b1);

        Boggiy b2 = new Boggiy(2,"AC",50);
        Train t2 = new Train(102,"SuperFast",b2);

        Boggiy b3 = new Boggiy(3,"General",100);
        Train t3 = new Train(103,"Passenger",b3);

        t1.display();
        t2.display();
        t3.display();
    }
}