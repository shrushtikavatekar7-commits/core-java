class SalonExecutor {

    public static void main(String[] args) {

        Service s1 = new Service(1,"Haircut",200);
        Salon sA = new Salon(101,"Style Salon",s1);

        Service s2 = new Service(2,"Facial",500);
        Salon sB = new Salon(102,"Beauty Hub",s2);

        sA.display();
        sB.display();
    }
}