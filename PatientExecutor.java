public class PatientExecutor {

    public static void main(String[] args) {

        Patient patient = new Patient();
        Mobile mobile = new Mobile();
        Reception reception = new Reception();
        Hospital hospital = new Hospital();
        Nurse nurse = new Nurse();
        Doctor doctor = new Doctor();

        patient.sick();

        mobile.register("Srushti", "Cold", "shrushtikavatekar@gmail.com", 9482863035L);

        reception.book("Srushti", "Cold", "shrushtikavatekar@gmail.com", 9482863035L);

        hospital.bookAppointment("Srushti", "Cold");

        nurse.basicCheck("Srushti", "Cold", 120, false);

        doctor.treat("Srushti", "Cold");

        System.out.println("Process Completed Successfully.");
    }
}