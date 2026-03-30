class BedExecutor {

    public static void main(String[] args) {

        Bed b = new Bed();

        b.addBed("Single");
        b.addBed("Double");
        b.addBed("Queen");
        b.addBed("King");
        b.addBed("Bunk");
        b.addBed("Sofa");
        b.addBed("Folding");
        b.addBed("Storage");
        b.addBed("Hydraulic");
        b.addBed("Adjustable");

        b.getAllBeds();

        System.out.println("Index: " + b.searchBed("Queen"));

        b.updateBed("Queen", "Queen Size");

        b.getAllBeds();

        b.deleteBed("Single");

        b.getAllBeds();
    }
}