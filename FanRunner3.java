class FanRunner3 {
    public static void main(String[] args) {

        Capacitor cap = new Capacitor();
        cap.capacity = 4;
        cap.brand = "KEMET";
        cap.voltage = 230;

        Fan fan = new Fan(3, "Usha", null);

        boolean result = fan.saveFan(cap); // method call

        System.out.println("Saved: " + result);
        fan.getFanDetails();
    }
}