class Microwave {

    static boolean isConnected;

    static boolean onOrOff() {

        if (!isConnected) {
            isConnected = true;
            System.out.println("The Microwave is turned On...");
        } else {
            isConnected = false;
            System.out.println("The Microwave is turned Off...");
        }

        return isConnected;
    }
}
