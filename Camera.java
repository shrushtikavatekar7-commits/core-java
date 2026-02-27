class Camera {

    static String brand;
    static String model;
    static double price;
    static int megapixel;
    static String color;
    static String type;
    static int batteryCapacity;
    static boolean wifi;
    static boolean bluetooth;
    static double weight;

    public static boolean createCamera(String b, String m, double p, int mp,
                                       String c, String t, int battery,
                                       boolean w, boolean bt, double wt) {

        boolean isCameraCreated = false;

        boolean isBrandValid = false;
        boolean isModelValid = false;
        boolean isPriceValid = false;
        boolean isMegapixelValid = false;
        boolean isColorValid = false;
        boolean isTypeValid = false;
        boolean isBatteryValid = false;
        boolean isWeightValid = false;

        if (b != null && !b.isEmpty()) {
            brand = b;
            isBrandValid = true;
        } else {
            System.out.println("Brand is not valid");
        }

        if (m != null && !m.isEmpty()) {
            model = m;
            isModelValid = true;
        } else {
            System.out.println("Model is not valid");
        }

        if (p > 0) {
            price = p;
            isPriceValid = true;
        } else {
            System.out.println("Price is not valid");
        }

        if (mp > 0) {
            megapixel = mp;
            isMegapixelValid = true;
        } else {
            System.out.println("Megapixel is not valid");
        }

        if (c != null && !c.isEmpty()) {
            color = c;
            isColorValid = true;
        } else {
            System.out.println("Color is not valid");
        }

        if (t != null && !t.isEmpty()) {
            type = t;
            isTypeValid = true;
        } else {
            System.out.println("Type is not valid");
        }

        if (battery > 0) {
            batteryCapacity = battery;
            isBatteryValid = true;
        } else {
            System.out.println("Battery is not valid");
        }

        if (wt > 0) {
            weight = wt;
            isWeightValid = true;
        } else {
            System.out.println("Weight is not valid");
        }

        wifi = w;
        bluetooth = bt;

        if (isBrandValid && isModelValid && isPriceValid &&
            isMegapixelValid && isColorValid &&
            isTypeValid && isBatteryValid && isWeightValid) {

            isCameraCreated = true;
        }

        return isCameraCreated;
    }

    public static void getCameraDetails() {

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Megapixel: " + megapixel);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Battery: " + batteryCapacity);
        System.out.println("Wifi: " + wifi);
        System.out.println("Bluetooth: " + bluetooth);
        System.out.println("Weight: " + weight);
        System.out.println("--------------------------------");
    }
}