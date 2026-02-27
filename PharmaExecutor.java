class PharmaExecutor {

    public static void main(String[] args) {

        boolean isCreated = HealthCarePharma.createMedicine(
                "Paracetamol",
                "HealthCare Pharma Ltd",
                25.50,
                "12/2027",
                500,
                "Tablet",
                false,
                1000
        );

        if (isCreated) {
            HealthCarePharma.getMedicineDetails();
        }
    }
}