class Medicine {

    private int medicineId;
    private String medicineName;
    private String manufacturer;
    private double price;
    private String expiryDate;
    private String dosage;
    private String usage;

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public int getMedicineId() {
        return this.medicineId;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineName() {
        return this.medicineName;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getDosage() {
        return this.dosage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getUsage() {
        return this.usage;
    }
}