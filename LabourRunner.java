class LabourRunner {

    public static void main(String[] args) {

        Labour l1 = new Labour();
        l1.name = "Ravi";
        l1.salary = 15000;
        l1.idProof = "Aadhar";

        Labour l2 = new Labour();
        l2.name = "Amit";
        l2.salary = 18000;
        l2.idProof = "PAN";

        Labour l3 = new Labour();
        l3.name = "Rahul";
        l3.salary = 17000;
        l3.idProof = "VoterID";

        Labour l4 = new Labour();
        l4.name = "Kiran";
        l4.salary = 16000;
        l4.idProof = "DrivingLicense";

        System.out.println("Labour1 Name: " + l1.name);
        System.out.println("Labour1 Salary: " + l1.salary);
        System.out.println("Labour1 ID: " + l1.idProof);

        System.out.println("Labour2 Name: " + l2.name);
        System.out.println("Labour2 Salary: " + l2.salary);
        System.out.println("Labour2 ID: " + l2.idProof);

        System.out.println("Labour3 Name: " + l3.name);
        System.out.println("Labour3 Salary: " + l3.salary);
        System.out.println("Labour3 ID: " + l3.idProof);

        System.out.println("Labour4 Name: " + l4.name);
        System.out.println("Labour4 Salary: " + l4.salary);
        System.out.println("Labour4 ID: " + l4.idProof);
    }
}