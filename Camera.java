class Camera {

    static boolean isConnected;

    static boolean onOrOff() {

        if (!isConnected) {
            isConnected = true;
            System.out.println("The Camera is turned On...");
        } else {
            isConnected = false;
            System.out.println("The Camera is turned Off...");
        }

        return isConnected;
    }
}
