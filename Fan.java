class Fan {

    int fanId;
    String fanBrand;
    Capacitor capacitor; 

    Fan(int fanId, String fanBrand, Capacitor capacitor) {   // Constructor
        this.fanId = fanId;
        this.fanBrand = fanBrand;
        this.capacitor = capacitor;
    }

    public boolean saveFan(Capacitor capacitor) {     // Method

        System.out.println("Parameter capacitor: " + capacitor);
        System.out.println("Instance capacitor: " + this.capacitor);

        boolean isSaved = false;

boolean isCapacityValid = false;
boolean isBrandValid = false;
boolean isVoltageValid = false;

if (capacitor != null) {

    if (capacitor.capacity > 0) {
        isCapacityValid = true;
    }

    if (capacitor.brand != null && !capacitor.brand.isEmpty()) {
        isBrandValid = true;
    }

    if (capacitor.voltage > 0) {
        isVoltageValid = true;
    }

    if (isCapacityValid && isBrandValid && isVoltageValid) {
        this.capacitor = capacitor;
        isSaved = true;
    }
}

return isSaved;
    }

    public void getFanDetails() {
        System.out.println("Fan ID: " + this.fanId);
        System.out.println("Fan Brand: " + this.fanBrand);

        System.out.println("Capacitor Capacity: " + this.capacitor.capacity);
        System.out.println("Capacitor Brand: " + this.capacitor.brand);
        System.out.println("Capacitor Voltage: " + this.capacitor.voltage);
    }
}