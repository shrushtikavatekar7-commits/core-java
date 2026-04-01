class PassportUser {

    private String name;
    private String surname;
    private int passportId;
    private String dateOfBirth;
    private String religion;
    private String location;
    private long contactNo;

   
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

  
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    
    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public int getPassportId() {
        return this.passportId;
    }

   
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

  
    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getReligion() {
        return this.religion;
    }

    
    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return this.location;
    }

  
    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public long getContactNo() {
        return this.contactNo;
    }
}