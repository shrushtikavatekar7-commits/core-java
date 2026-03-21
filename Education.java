class Education {

    int id;
    String course;
    String institute;
    String university;
    String degree;
    int duration;
    double fees;
    String mode;
    String subject;
    String level;
    String country;
    String state;
    String city;
    double rating;
    String faculty;
    String syllabus;
    String examType;
    String certification;
    String placement;
    String language;

    public Education(int id, String course, String institute, String university,
                     String degree, int duration, double fees, String mode,
                     String subject, String level, String country, String state,
                     String city, double rating, String faculty, String syllabus,
                     String examType, String certification, String placement,
                     String language) {

        this.id = id;
        this.course = course;
        this.institute = institute;
        this.university = university;
        this.degree = degree;
        this.duration = duration;
        this.fees = fees;
        this.mode = mode;
        this.subject = subject;
        this.level = level;
        this.country = country;
        this.state = state;
        this.city = city;
        this.rating = rating;
        this.faculty = faculty;
        this.syllabus = syllabus;
        this.examType = examType;
        this.certification = certification;
        this.placement = placement;
        this.language = language;
    }

    public void display() {
        System.out.println("Education: " + id + " " + course + " " + institute);
    }
}