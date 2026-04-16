class PVRRunner1 {
    public static void main(String[] args) {

        Screen screen = new Screen();
        screen.seats = 100;
        screen.type = "IMAX";
        screen.price = 250;

        PVR pvr = new PVR(1, "PVR Orion", screen);
        pvr.getPVRDetails();
    }
}