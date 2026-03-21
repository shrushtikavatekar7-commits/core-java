class Diabetes {

    int id;
    String type;
    String cause;
    String symptoms;
    String treatment;
    boolean hereditary;
    String severity;
    String diagnosis;
    String prevention;
    String diet;
    String exercise;
    String medicine;
    String doctor;
    String hospital;
    double sugarLevel;
    String riskLevel;
    String ageGroup;
    String lifestyle;
    String monitoring;
    String duration;

    public Diabetes(int id, String type, String cause, String symptoms,
                    String treatment, boolean hereditary, String severity,
                    String diagnosis, String prevention, String diet,
                    String exercise, String medicine, String doctor,
                    String hospital, double sugarLevel, String riskLevel,
                    String ageGroup, String lifestyle, String monitoring,
                    String duration) {

        this.id = id;
        this.type = type;
        this.cause = cause;
        this.symptoms = symptoms;
        this.treatment = treatment;
        this.hereditary = hereditary;
        this.severity = severity;
        this.diagnosis = diagnosis;
        this.prevention = prevention;
        this.diet = diet;
        this.exercise = exercise;
        this.medicine = medicine;
        this.doctor = doctor;
        this.hospital = hospital;
        this.sugarLevel = sugarLevel;
        this.riskLevel = riskLevel;
        this.ageGroup = ageGroup;
        this.lifestyle = lifestyle;
        this.monitoring = monitoring;
        this.duration = duration;
    }

    public void display() {
        System.out.println("Diabetes: " + id + " " + type + " " + sugarLevel + " " + riskLevel);
    }
}