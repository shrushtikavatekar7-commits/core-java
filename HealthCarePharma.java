class HealthCarePharma {

    static String medicineName;
    static String manufacturer;
    static double price;
    static String expiryDate;
    static int dosageMg;
    static String type;
    static boolean prescriptionRequired;
    static int stockQuantity;

    public static boolean createMedicine(String mName, String manu,
                                         double p, String exp,
                                         int dosage, String t,
                                         boolean prescription,
                                         int stock) {

        boolean isMedicineCreated = false;

        boolean isNameValid = false;
        boolean isManufacturerValid = false;
        boolean isPriceValid = false;
        boolean isExpiryValid = false;
        boolean isDosageValid = false;
        boolean isTypeValid = false;
        boolean isStockValid = false;

        if (mName != null && !mName.isEmpty()) {
            medicineName = mName;
            isNameValid = true;
        } else {
            System.out.println("Medicine name is invalid");
        }

        if (manu != null && !manu.isEmpty()) {
            manufacturer = manu;
            isManufacturerValid = true;
        } else {
            System.out.println("Manufacturer is invalid");
        }

        if (p > 0) {
            price = p;
            isPriceValid = true;
        } else {
            System.out.println("Price is invalid");
        }

        if (exp != null && !exp.isEmpty()) {
            expiryDate = exp;
            isExpiryValid = true;
        } else {
            System.out.println("Expiry date is invalid");
        }

        if (dosage > 0) {
            dosageMg = dosage;
            isDosageValid = true;
        } else {
            System.out.println("Dosage is invalid");
        }

        if (t != null && !t.isEmpty()) {
            type = t;
            isTypeValid = true;
        } else {
            System.out.println("Type is invalid");
        }

        if (stock >= 0) {
            stockQuantity = stock;
            isStockValid = true;
        } else {
            System.out.println("Stock quantity is invalid");
        }

        prescriptionRequired = prescription;

        if (isNameValid && isManufacturerValid && isPriceValid &&
            isExpiryValid && isDosageValid &&
            isTypeValid && isStockValid) {

            isMedicineCreated = true;
        }

        return isMedicineCreated;
    }

    public static void getMedicineDetails() {

        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Price: " + price);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Dosage: " + dosageMg + " mg");
        System.out.println("Type: " + type);
        System.out.println("Prescription Required: " + prescriptionRequired);
        System.out.println("Stock Quantity: " + stockQuantity);
        System.out.println("-------------------------------------");
    }
}