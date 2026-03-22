public class BedSheetExecutor {

    public static void main(String[] args) {

        BedSheet b1 = new BedSheet();
        b1.display();

        BedSheet b2 = new BedSheet(130);
        b2.display();

        BedSheet b3 = new BedSheet(140, "Cotton BedSheet");
        b3.display();
    }
}