class Elevator {

    static String brand;
    static int capacity;
    static int currentFloor;
    static int maxFloors;
    static boolean isWorking;
    static String type;
    static double speed;

    public static boolean createElevator(String b, int cap,
                                         int currFloor, int maxF,
                                         boolean working,
                                         String t, double sp) {

        boolean isElevatorCreated = false;

        boolean isBrandValid = false;
        boolean isCapacityValid = false;
        boolean isCurrentFloorValid = false;
        boolean isMaxFloorValid = false;
        boolean isTypeValid = false;
        boolean isSpeedValid = false;

        if (b != null && !b.isEmpty()) {
            brand = b;
            isBrandValid = true;
        } else {
            System.out.println("Brand is invalid");
        }

        if (cap > 0) {
            capacity = cap;
            isCapacityValid = true;
        } else {
            System.out.println("Capacity is invalid");
        }

        if (currFloor >= 0) {
            currentFloor = currFloor;
            isCurrentFloorValid = true;
        } else {
            System.out.println("Current floor is invalid");
        }

        if (maxF > 0) {
            maxFloors = maxF;
            isMaxFloorValid = true;
        } else {
            System.out.println("Max floors is invalid");
        }

        if (t != null && !t.isEmpty()) {
            type = t;
            isTypeValid = true;
        } else {
            System.out.println("Type is invalid");
        }

        if (sp > 0) {
            speed = sp;
            isSpeedValid = true;
        } else {
            System.out.println("Speed is invalid");
        }

        isWorking = working;

        if (isBrandValid && isCapacityValid && isCurrentFloorValid &&
            isMaxFloorValid && isTypeValid && isSpeedValid) {

            isElevatorCreated = true;
        }

        return isElevatorCreated;
    }

    public static void getElevatorDetails() {

        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity + " persons");
        System.out.println("Current Floor: " + currentFloor);
        System.out.println("Max Floors: " + maxFloors);
        System.out.println("Working Status: " + isWorking);
        System.out.println("Type: " + type);
        System.out.println("Speed: " + speed + " m/s");
        System.out.println("--------------------------------");
    }
}