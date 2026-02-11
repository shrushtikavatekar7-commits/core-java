class Heater {

    static boolean isConnected;

    static boolean onOrOff() {

        if (!isConnected) {
            isConnected = true;
            System.out.println("The Heater is turned On...");
        } else {
            isConnected = false;
            System.out.println("The Heater is turned Off...");
        }

        return isConnected;
    }
}
