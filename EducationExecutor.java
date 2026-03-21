class EducationExecutor {
    public static void main(String[] args) {

        Education e1 = new Education(1,"BCA","ABC College","VTU",
                "Degree",3,50000,"Offline","CS",
                "UG","India","KA","Belgaum",
                4.5,"Good","Updated","Semester",
                "Yes","Good","English");

        Education e2 = new Education(2,"MCA","XYZ College","VTU",
                "PG",2,70000,"Offline","IT",
                "PG","India","KA","Bangalore",
                4.7,"Excellent","Advanced","Semester",
                "Yes","Excellent","English");

        e1.display();
        e2.display();
    }
}