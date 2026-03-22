public class CylinderExecutor {

    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        c1.display();

        Cylinder c2 = new Cylinder(90);
        c2.display();

        Cylinder c3 = new Cylinder(100, "Gas Cylinder");
        c3.display();
    }
}