class GymExecutor {

    public static void main(String[] args) {

        Gym gym = new Gym();

        gym.addEquipment("Dumbbell");
        gym.addEquipment("Treadmill");
        gym.addEquipment("Bench Press");

        System.out.println("All Equipments:");
        gym.getAllEquipments();

        System.out.println("-----------");

        gym.updateEquipment("Treadmill", "Cycling Machine");

        System.out.println("After Update:");
        gym.getAllEquipments();

        System.out.println("-----------");

        gym.deleteEquipment("Dumbbell");

        System.out.println("After Delete:");
        gym.getAllEquipments();
    }
}