public class LionDatesExecutor {

    public static void main(String[] args) {

        LionDates l1 = new LionDates();
        l1.display();

        LionDates l2 = new LionDates(210);
        l2.display();

        LionDates l3 = new LionDates(220, "Premium Dates");
        l3.display();
    }
}