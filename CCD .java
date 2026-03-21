class CCD {

    int id;
    String branch;
    Coffee coffee;   // HAS-A

    public CCD(int id, String branch, Coffee coffee) {
        this.id = id;
        this.branch = branch;
        this.coffee = coffee;
    }

    public void display() {
        System.out.println("CCD: " + id + " " + branch);
        coffee.display();
        System.out.println("-------------------");
    }
}