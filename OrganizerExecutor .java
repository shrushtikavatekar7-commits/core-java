class OrganizerExecutor {
    public static void main(String[] args) {

        Organizer o1 = new Organizer(1,"Desk","Plastic","Black",300,
                "Cello",10,"Office","Rectangle","Simple",
                "India","ABC",4.5,"High","Medium","Matte",
                "Box","M1","1 year","Stationary");

        Organizer o2 = new Organizer(2,"Drawer","Wood","Brown",800,
                "Ikea",20,"Home","Square","Modern",
                "Sweden","XYZ",4.7,"High","Large","Glossy",
                "Pack","M2","2 years","Furniture");

        o1.display();
        o2.display();
    }
}