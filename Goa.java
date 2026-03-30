class Goa {

    String beachNames[] = new String[19];
    int index;

    public boolean addBeach(String name) {
        boolean isAdded = false;

        if (index < beachNames.length) {
            if (name != null && !name.isEmpty()) {
                beachNames[index] = name;
                index++;
                isAdded = true;
            }
        }
        return isAdded;
    }

    public void getAllBeaches() {
        for (String b : beachNames) {
            if (b != null) {
                System.out.println(b);
            }
        }
    }

    public boolean updateBeach(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < beachNames.length; i++) {
            if (beachNames[i] != null && beachNames[i].equals(oldName)) {
                beachNames[i] = newName;
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    public boolean deleteBeach(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < beachNames.length; i++) {
            if (beachNames[i] != null && beachNames[i].equals(name)) {
                beachNames[i] = null;
                isDeleted = true;
            }
        }
        return isDeleted;
    }
}