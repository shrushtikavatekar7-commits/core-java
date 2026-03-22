public class MedicalShopExecutor {

    public static void main(String[] args) {

        MedicalShop m1 = new MedicalShop();
        m1.display();

        MedicalShop m2 = new MedicalShop(250);
        m2.display();

        MedicalShop m3 = new MedicalShop(260, "City Medical Store");
        m3.display();
    }
}