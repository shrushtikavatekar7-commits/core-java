class Refrigerator {

    static boolean isConnected;

    static boolean onOrOff() {

        if (!isConnected) {
            isConnected = true;
            System.out.println("The Refrigerator is turned On...");
        } else {
            isConnected = false;
            System.out.println("The Refrigerator is turned Off...");
        }

        return isConnected;
    }
}
