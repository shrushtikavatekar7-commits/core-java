class PVRRunner2 {
    public static void main(String[] args) {

        Screen screen = new Screen();
        screen.seats = 80;
        screen.type = "3D";
        screen.price = 200;

        PVR pvr = new PVR(2, "PVR Forum", null);

        pvr.screen = screen;
        pvr.getPVRDetails();
    }
}