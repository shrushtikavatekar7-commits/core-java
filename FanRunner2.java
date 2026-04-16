class FanRunner2 {
    public static void main(String[] args) {

        Capacitor cap = new Capacitor();
        cap.capacity = 6;
        cap.brand = "TDK";
        cap.voltage = 240;

        Fan fan = new Fan(2, "Bajaj", null); 

        fan.capacitor = cap; // object reference assignment
        fan.getFanDetails();
    }
}