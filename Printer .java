class Printer {

    static boolean isConnected;

    static boolean onOrOff() {

        if (!isConnected) {
            isConnected = true;
            System.out.println("The Printer is turned On...");
        } else {
            isConnected = false;
            System.out.println("The Printer is turned Off...");
        }

        return isConnected;
    }
}
