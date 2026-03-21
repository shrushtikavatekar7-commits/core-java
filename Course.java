class Course {

    int id;
    String name;
    String duration;
    String trainer;
    String institute;
    double fees;
    String mode;
    String level;
    int students;
    String language;
    String certification;
    boolean isOnline;

   
    public Course(int id, String name, String duration, String trainer,
                  String institute, double fees, String mode,
                  String level, int students, String language,
                  String certification, boolean isOnline) {

        this.id = id;
        this.name = name;
        this.duration = duration;
        this.trainer = trainer;
        this.institute = institute;
        this.fees = fees;
        this.mode = mode;
        this.level = level;
        this.students = students;
        this.language = language;
        this.certification = certification;
        this.isOnline = isOnline;
    }

    public void display() {
        System.out.println("Course Details:");
        
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Duration: " + duration);
        System.out.println("Trainer: " + trainer);
        System.out.println("Institute: " + institute);
        System.out.println("Fees: " + fees);
        System.out.println("Mode: " + mode);
        System.out.println("Level: " + level);
        System.out.println("Students: " + students);
        System.out.println("Language: " + language);
        System.out.println("Certification: " + certification);
        System.out.println("Online: " + isOnline);
    }
}