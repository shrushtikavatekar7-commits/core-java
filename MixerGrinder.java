class MixerGrinder {

    static boolean isConnected;

    static boolean onOrOff() {

        if (!isConnected) {
            isConnected = true;
            System.out.println("The Mixer Grinder is turned On...");
        } else {
            isConnected = false;
            System.out.println("The Mixer Grinder is turned Off...");
        }

        return isConnected;
    }
}
