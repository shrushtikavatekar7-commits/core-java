class PatientCaseEvidence {

    private int caseId;
    private String patientName;
    private String disease;
    private String symptoms;
    private String doctorName;
    private String hospitalName;
    private String status;

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public int getCaseId() {
        return this.caseId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientName() {
        return this.patientName;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDisease() {
        return this.disease;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getSymptoms() {
        return this.symptoms;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorName() {
        return this.doctorName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return this.hospitalName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}