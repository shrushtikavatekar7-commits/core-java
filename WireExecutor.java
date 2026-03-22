public class WireExecutor {

    public static void main(String[] args) {

        Wire w1 = new Wire();
        w1.display();

        Wire w2 = new Wire(30);
        w2.display();

        Wire w3 = new Wire(40, "Copper Wire");
        w3.display();
    }
}