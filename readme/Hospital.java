class Hospital {

    
    public static String[] getDoctors() {

        String[] doctors = {
            "Dr. Rajesh Kumar",
            "Dr. Priya Sharma",
            "Dr. Anil Reddy",
            "Dr. Sneha Patil",
            "Dr. Vikram Singh",
            "Dr. Meera Nair",
            "Dr. Arjun Rao",
            "Dr. Kavitha Iyer",
            "Dr. Rohit Verma",
            "Dr. Neha Gupta",
            "Dr. Sanjay Kulkarni",
            "Dr. Divya Menon",
            "Dr. Amit Joshi",
            "Dr. Pooja Desai",
            "Dr. Kiran Shetty"
        };

        return doctors;
    }

    public static String[] findDoctorsBySpecialization(String specialization) {

        if (specialization.equalsIgnoreCase("Cardiac Sciences")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Dental Science")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Dermatology")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Diabetology/Endocrinology")) return getDoctors();
        else if (specialization.equalsIgnoreCase("ENT")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Emergency and Trauma")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Foetal Medicine")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Gastroenterology and Hepatobiliary Sciences")) return getDoctors();
        else if (specialization.equalsIgnoreCase("General Surgery")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Haematology")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Infectious Diseases")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Infertility medicine")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Internal Medicine")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Mental Health and Behavioural Sciences")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Nephrology")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Neurointerventional Radiology")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Neurology")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Neurosurgery")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Obstetrics and Gynaecology")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Oncology")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Ophthalmology")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Organ Transplant")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Orthopaedics")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Paediatrics")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Physiotherapy and Rehabilitation")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Plastic and Reconstructive Surgery")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Pulmonology")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Radiology")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Rheumatology")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Support Specialties")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Thoracic Surgery")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Transfusion Medicine")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Urology")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Endocrine Surgery")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Vascular Surgery")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Liver Transplant and Hepatobiliary Sciences")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Palliative Medicine")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Medical Genetics")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Pain and Palliative Medicine")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Geriatric Medicine")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Critical Care")) return getDoctors();
        else if (specialization.equalsIgnoreCase("Nuclear Medicine")) return getDoctors();

        else return new String[0];
    }

    public static void displayDoctors(String[] doctors) {

        for (String doctor : doctors) {
            System.out.println(doctor);
        }
    }
}