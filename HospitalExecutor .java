class HospitalExecutor {

    public static void main(String[] args) {

        String[] specializations = {
            "Cardiac Sciences",
            "Dental Science",
            "Dermatology",
            "Diabetology/Endocrinology",
            "ENT",
            "Emergency and Trauma",
            "Foetal Medicine",
            "Gastroenterology and Hepatobiliary Sciences",
            "General Surgery",
            "Haematology",
            "Infectious Diseases",
            "Infertility medicine",
            "Internal Medicine",
            "Mental Health and Behavioural Sciences",
            "Nephrology",
            "Neurointerventional Radiology",
            "Neurology",
            "Neurosurgery",
            "Obstetrics and Gynaecology",
            "Oncology",
            "Ophthalmology",
            "Organ Transplant",
            "Orthopaedics",
            "Paediatrics",
            "Physiotherapy and Rehabilitation",
            "Plastic and Reconstructive Surgery",
            "Pulmonology",
            "Radiology",
            "Rheumatology",
            "Support Specialties",
            "Thoracic Surgery",
            "Transfusion Medicine",
            "Urology",
            "Endocrine Surgery",
            "Vascular Surgery",
            "Liver Transplant and Hepatobiliary Sciences",
            "Palliative Medicine",
            "Medical Genetics",
            "Pain and Palliative Medicine",
            "Geriatric Medicine",
            "Critical Care",
            "Nuclear Medicine"
        };

        for (String specialization : specializations) {

            System.out.println("Doctors in " + specialization + " :");

            String[] result = Hospital.findDoctorsBySpecialization(specialization);

            Hospital.displayDoctors(result);

            System.out.println("----------------------------------------");
        }
    }
}