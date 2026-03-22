public class TheoBromaExecutor {

    public static void main(String[] args) {

        TheoBroma t1 = new TheoBroma();
        t1.display();

        TheoBroma t2 = new TheoBroma(230);
        t2.display();

        TheoBroma t3 = new TheoBroma(240, "Online Bakery");
        t3.display();
    }
}