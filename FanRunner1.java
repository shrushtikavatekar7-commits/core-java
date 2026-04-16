class FanRunner1 {
    public static void main(String[] args) {

        Capacitor cap = new Capacitor();
        cap.capacity = 1;
        cap.brand = "parasonic";
        cap.voltage = 220;

        Fan fan = new Fan(1, "Usha"); // constructor use
        fan.getFanDetails();
    }
}