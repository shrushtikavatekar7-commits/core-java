class OrganExecutor {

    public static void main(String[] args) {

        Organ o1 = new Organ(1,"Heart","Pump Blood","Chest",0.3,
                "Red","Muscle","Healthy","None","Circulatory",
                "Complex","Center","Ribs",4.8,"Medical",
                "Normal","Fast","Active","Full","Vital");

        Organ o2 = new Organ(2,"Liver","Filter","Abdomen",1.5,
                "Brown","Gland","Good","None","Digestive",
                "Soft","Right","Ribs",4.5,"Research",
                "Normal","Moderate","Active","Growth","Important");

        Organ o3 = new Organ(3,"Kidney","Filter Blood","Back",0.5,
                "Dark Red","Bean","Healthy","None","Excretory",
                "Smooth","Side","Ribs",4.6,"Study",
                "Normal","Slow","Active","Normal","Important");

        
        o1.display();
        o2.display();
        o3.display();
    }
}