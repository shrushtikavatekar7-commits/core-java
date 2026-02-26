class Reception {

    public void book(String patientName, String symptom, String email, long mobile) {
        System.out.println("Reception booking details:");
        System.out.println("Name: " + patientName);
        System.out.println("Symptom: " + symptom);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobile);
        System.out.println("Booking confirmed.\n");
    }
}