class ElectricalShop {

    String appliances[] = new String[20];
    int index;

    public boolean addAppliance(String name) {
        boolean isAdded = false;

        if (index < appliances.length) {
            if (name != null && !name.isEmpty()) {
                appliances[index] = name;
                index++;
                isAdded = true;
            } else {
                System.out.println("Invalid appliance name");
            }
        } else {
            System.out.println("Array is full");
        }

        return isAdded;
    }

    public void getAllAppliances() {
        for (String app : appliances) {
            if (app != null) {
                System.out.println(app);
            }
        }
    }

    public boolean updateAppliance(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < appliances.length; i++) {
            if (appliances[i] != null && appliances[i].equals(oldName)) {
                appliances[i] = newName;
                isUpdated = true;
            }
        }

        if (!isUpdated) {
            System.out.println(oldName + " not found");
        }

        return isUpdated;
    }

    public boolean deleteAppliance(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < appliances.length; i++) {
            if (appliances[i] != null && appliances[i].equals(name)) {
                appliances[i] = null;
                isDeleted = true;
            }
        }

        if (!isDeleted) {
            System.out.println(name + " not found");
        }

        return isDeleted;
    }
}