public class SoapHolderExecutor {

    public static void main(String[] args) {

        SoapHolder s1 = new SoapHolder();
        s1.display();

        SoapHolder s2 = new SoapHolder(50);
        s2.display();

        SoapHolder s3 = new SoapHolder(60, "Plastic Soap Holder");
        s3.display();
    }
}