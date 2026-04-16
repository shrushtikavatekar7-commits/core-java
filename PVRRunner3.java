class PVRRunner3 {
    public static void main(String[] args) {

        Screen screen = new Screen();
        screen.seats = 120;
        screen.type = "4DX";
        screen.price = 300;

        PVR pvr = new PVR(3, "PVR Central", null);

        boolean result = pvr.saveScreen(screen);

        System.out.println("Saved: " + result);
        pvr.getPVRDetails();
    }
}