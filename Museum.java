class Museum {

    String historicalMonuments[] = new String[16];
    int index;

    public boolean addMonument(String name) {
        boolean isAdded = false;

        if (index < historicalMonuments.length) {
            if (name != null && !name.isEmpty()) {
                historicalMonuments[index] = name;
                index++;
                isAdded = true;
            }
        }
        return isAdded;
    }

    public void getAllMonuments() {
        for (String m : historicalMonuments) {
            if (m != null) {
                System.out.println(m);
            }
        }
    }

    public boolean updateMonument(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < historicalMonuments.length; i++) {
            if (historicalMonuments[i] != null && historicalMonuments[i].equals(oldName)) {
                historicalMonuments[i] = newName;
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    public boolean deleteMonument(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < historicalMonuments.length; i++) {
            if (historicalMonuments[i] != null && historicalMonuments[i].equals(name)) {
                historicalMonuments[i] = null;
                isDeleted = true;
            }
        }
        return isDeleted;
    }
}