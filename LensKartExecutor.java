class LensKartExecutor {

    public static void main(String[] args) {

        Frame f1 = new Frame(1,"Full Rim","Black");
        LensKart l1 = new LensKart(101,"Lenskart",f1);

        Frame f2 = new Frame(2,"Half Rim","Silver");
        LensKart l2 = new LensKart(102,"Lenskart",f2);

        l1.display();
        l2.display();
    }
}