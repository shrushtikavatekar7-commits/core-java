public class ComedyShowExecutor {

    public static void main(String[] args) {

        ComedyShow c1 = new ComedyShow();
        c1.display();

        ComedyShow c2 = new ComedyShow(170);
        c2.display();

        ComedyShow c3 = new ComedyShow(180, "Standup Comedy Show");
        c3.display();
    }
}