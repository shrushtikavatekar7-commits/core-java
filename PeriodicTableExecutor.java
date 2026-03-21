class PeriodicTableExecutor {

    public static void main(String[] args) {

        Element e1 = new Element(1,"Hydrogen","H");
        PeriodicTable p1 = new PeriodicTable(101,"Basic",e1);

        Element e2 = new Element(2,"Helium","He");
        PeriodicTable p2 = new PeriodicTable(102,"Advanced",e2);

        p1.display();
        p2.display();
    }
}