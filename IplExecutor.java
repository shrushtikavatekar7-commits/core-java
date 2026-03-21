class IplExecutor {

    public static void main(String[] args) {

        Player p1 = new Player(1,"Virat","Batsman");
        Ipl i1 = new Ipl(101,"RCB",p1);

        Player p2 = new Player(2,"Dhoni","WicketKeeper");
        Ipl i2 = new Ipl(102,"CSK",p2);

        i1.display();
        i2.display();
    }
}