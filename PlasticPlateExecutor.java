public class PlasticPlateExecutor {

    public static void main(String[] args) {

        PlasticPlate p1 = new PlasticPlate();
        p1.display();

        PlasticPlate p2 = new PlasticPlate(190);
        p2.display();

        PlasticPlate p3 = new PlasticPlate(200, "Reusable Plate");
        p3.display();
    }
}