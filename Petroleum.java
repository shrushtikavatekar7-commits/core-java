class Petroleum {

    String petroleumNames[] = new String[10];
    int index;

    public boolean addPetroleum(String name) {
        boolean isAdded = false;

        if (index < petroleumNames.length) {
            if (name != null && !name.isEmpty()) {
                petroleumNames[index++] = name;
                isAdded = true;
            }
        }
        return isAdded;
    }

    public void getAllPetroleum() {
        for (String p : petroleumNames) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }

    public int searchPetroleum(String name) {
        for (int i = 0; i < petroleumNames.length; i++) {
            if (petroleumNames[i] != null && petroleumNames[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean updatePetroleum(String oldName, String newName) {
        int i = searchPetroleum(oldName);
        if (i != -1) {
            petroleumNames[i] = newName;
            return true;
        }
        return false;
    }

    public boolean deletePetroleum(String name) {
        int i = searchPetroleum(name);
        if (i != -1) {
            petroleumNames[i] = null;
            return true;
        }
        return false;
    }
}