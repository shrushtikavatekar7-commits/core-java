class Fan {

    static boolean isConnected;

    static boolean onOrOff() {

        if (isConnected == false) {
            isConnected = true;
            System.out.println("The Fan is turned On...");
        } else if (isConnected == true) {
            isConnected = false;
            System.out.println("The Fan is turned Off...");
        }

        return isConnected;
    }
}
