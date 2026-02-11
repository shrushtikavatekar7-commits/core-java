class AirConditioner {

    static boolean isConnected;

    static boolean onOrOff() {

        if (!isConnected) {
            isConnected = true;
            System.out.println("The Air Conditioner is turned On...");
        } else {
            isConnected = false;
            System.out.println("The Air Conditioner is turned Off...");
        }

        return isConnected;
    }
}
