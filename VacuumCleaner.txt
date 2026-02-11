class Cleaner {

    static boolean isConnected;   

    static boolean onOrOff() {

        if (isConnected == false) {
            isConnected = true;
            System.out.println("The  Cleaner is turned On...");
        } else {
            isConnected = false;
            System.out.println("The Cleaner is turned Off...");
        }

        return isConnected;
    }
}
