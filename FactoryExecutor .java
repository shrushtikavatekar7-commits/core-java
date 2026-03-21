class FactoryExecutor {

    public static void main(String[] args) {

        Machine m1 = new Machine(1,"Drill","Heavy");
        Factory f1 = new Factory(101,"ABC Factory",m1);

        Machine m2 = new Machine(2,"Lathe","Medium");
        Factory f2 = new Factory(102,"XYZ Factory",m2);

        f1.display();
        f2.display();
    }
}