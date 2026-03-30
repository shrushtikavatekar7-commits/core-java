class Gym {

    String equipments[] = new String[16];
    int index;

    public boolean addEquipment(String name) {
        boolean isAdded = false;

        if (index < equipments.length) {
            if (name != null && !name.isEmpty()) {
                equipments[index] = name;
                index++;
                isAdded = true;
            } else {
                System.out.println("Invalid equipment name");
            }
        } else {
            System.out.println("Array is full");
        }

        return isAdded;
    }

    public void getAllEquipments() {
        for (String eq : equipments) {
            if (eq != null) {
                System.out.println(eq);
            }
        }
    }

    public boolean updateEquipment(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < equipments.length; i++) {
            if (equipments[i] != null && equipments[i].equals(oldName)) {
                equipments[i] = newName;
                isUpdated = true;
            }
        }

        if (!isUpdated) {
            System.out.println(oldName + " not found");
        }

        return isUpdated;
    }

    public boolean deleteEquipment(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < equipments.length; i++) {
            if (equipments[i] != null && equipments[i].equals(name)) {
                equipments[i] = null;
                isDeleted = true;
            }
        }

        if (!isDeleted) {
            System.out.println(name + " not found");
        }

        return isDeleted;
    }
}