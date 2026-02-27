class Nurse {

    public void basicCheck(String patientName, String symptom, int bp, boolean sugar) {
        System.out.println("Nurse is doing basic checkup for: " + patientName);
        System.out.println("Symptom: " + symptom);
        System.out.println("BP Level: " + bp);

        if (sugar) {
            System.out.println("Patient has sugar problem.");
        } else {
            System.out.println("No sugar problem.");
        }

        System.out.println("Basic checkup completed.\n");
    }
}