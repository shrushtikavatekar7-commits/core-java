public class SunscreamExecutor {

    public static void main(String[] args) {

        Sunscream s1 = new Sunscream();
        s1.display();

        Sunscream s2 = new Sunscream(110);
        s2.display();

        Sunscream s3 = new Sunscream(120, "SPF 50 Sunscreen");
        s3.display();
    }
}