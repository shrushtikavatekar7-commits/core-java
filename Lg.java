class Lg {

    static String brand;
    static String model;
    static double price;
    static int capacity;
    static String type;
    static int warrantyYears;
    static String color;
    static boolean inverterTechnology;
    static int doors;
    static double weight;

    public static boolean createRefrigerator(String b, String m, double p,
                                             int c, String t, int w,
                                             String col, boolean inverter,
                                             int d, double wt) {

        boolean isCreated = false;

        boolean isBrandValid = false;
        boolean isModelValid = false;
        boolean isPriceValid = false;
        boolean isCapacityValid = false;
        boolean isTypeValid = false;
        boolean isWarrantyValid = false;
        boolean isColorValid = false;
        boolean isDoorValid = false;
        boolean isWeightValid = false;

        if (b != null && !b.isEmpty()) {
            brand = b;
            isBrandValid = true;
        } else {
            System.out.println("Brand is invalid");
        }

        if (m != null && !m.isEmpty()) {
            model = m;
            isModelValid = true;
        } else {
            System.out.println("Model is invalid");
        }

        if (p > 0) {
            price = p;
            isPriceValid = true;
        } else {
            System.out.println("Price is invalid");
        }

        if (c > 0) {
            capacity = c;
            isCapacityValid = true;
        } else {
            System.out.println("Capacity is invalid");
        }

        if (t != null && !t.isEmpty()) {
            type = t;
            isTypeValid = true;
        } else {
            System.out.println("Type is invalid");
        }

        if (w > 0) {
            warrantyYears = w;
            isWarrantyValid = true;
        } else {
            System.out.println("Warranty is invalid");
        }

        if (col != null && !col.isEmpty()) {
            color = col;
            isColorValid = true;
        } else {
            System.out.println("Color is invalid");
        }

        if (d > 0) {
            doors = d;
            isDoorValid = true;
        } else {
            System.out.println("Doors value is invalid");
        }

        if (wt > 0) {
            weight = wt;
            isWeightValid = true;
        } else {
            System.out.println("Weight is invalid");
        }

        inverterTechnology = inverter;

        if (isBrandValid && isModelValid && isPriceValid &&
            isCapacityValid && isTypeValid && isWarrantyValid &&
            isColorValid && isDoorValid && isWeightValid) {

            isCreated = true;
        }

        return isCreated;
    }

    public static void getRefrigeratorDetails() {

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Capacity: " + capacity + " Litres");
        System.out.println("Type: " + type);
        System.out.println("Warranty: " + warrantyYears + " Years");
        System.out.println("Color: " + color);
        System.out.println("Inverter Technology: " + inverterTechnology);
        System.out.println("Doors: " + doors);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("-----------------------------------");
    }
}