class PhonepeExecutor {

    public static void main(String[] args) {

        Phonepe phonepe = new Phonepe();

        phonepe.addInsuranceName("LIC");
        phonepe.addInsuranceName("HDFC Life");
        phonepe.addInsuranceName("ICICI Prudential");

        System.out.println("All Insurance Names:");
        phonepe.getAllInsuranceNames();

        System.out.println("-----------");

        phonepe.updateInsuranceName("LIC", "SBI Life");

        System.out.println("After Update:");
        phonepe.getAllInsuranceNames();

        System.out.println("-----------");

        phonepe.deleteInsuranceName("HDFC Life");

        System.out.println("After Delete:");
        phonepe.getAllInsuranceNames();
    }
}