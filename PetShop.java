class PetShop {

    String petAccessories[] = new String[20];
    int index;

    public boolean addAccessory(String name) {
        boolean isAdded = false;

        if (index < petAccessories.length) {
            if (name != null && !name.isEmpty()) {
                petAccessories[index] = name;
                index++;
                isAdded = true;
            }
        }
        return isAdded;
    }

    public void getAllAccessories() {
        for (String a : petAccessories) {
            if (a != null) {
                System.out.println(a);
            }
        }
    }

    public boolean updateAccessory(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < petAccessories.length; i++) {
            if (petAccessories[i] != null && petAccessories[i].equals(oldName)) {
                petAccessories[i] = newName;
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    public boolean deleteAccessory(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < petAccessories.length; i++) {
            if (petAccessories[i] != null && petAccessories[i].equals(name)) {
                petAccessories[i] = null;
                isDeleted = true;
            }
        }
        return isDeleted;
    }
}