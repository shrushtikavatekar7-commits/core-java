public class CombExecutor {

    public static void main(String[] args) {

        Comb c1 = new Comb();
        c1.display();

        Comb c2 = new Comb(70);
        c2.display();

        Comb c3 = new Comb(80, "Hair Comb");
        c3.display();
    }
}