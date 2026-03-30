class Cylinder {

    String cylinderNames[] = new String[10];
    int index;

    public boolean addCylinder(String name) {
        boolean isAdded = false;

        if (index < cylinderNames.length) {
            if (name != null && !name.isEmpty()) {
                cylinderNames[index] = name;
                index++;
                isAdded = true;
            }
        }
        return isAdded;
    }

    public void getAllCylinders() {
        for (String c : cylinderNames) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }

    public int searchCylinder(String name) {
        for (int i = 0; i < cylinderNames.length; i++) {
            if (cylinderNames[i] != null && cylinderNames[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean updateCylinder(String oldName, String newName) {
        boolean isUpdated = false;

        int i = searchCylinder(oldName);
        if (i != -1) {
            cylinderNames[i] = newName;
            isUpdated = true;
        }

        return isUpdated;
    }

    public boolean deleteCylinder(String name) {
        boolean isDeleted = false;

        int i = searchCylinder(name);
        if (i != -1) {
            cylinderNames[i] = null;
            isDeleted = true;
        }

        return isDeleted;
    }
}