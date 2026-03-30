class Universe {

    String galaxies[] = new String[17];
    int index;

    public boolean addGalaxy(String name) {
        boolean isAdded = false;

        if (index < galaxies.length) {
            if (name != null && !name.isEmpty()) {
                galaxies[index] = name;
                index++;
                isAdded = true;
            }
        }
        return isAdded;
    }

    public void getAllGalaxies() {
        for (String g : galaxies) {
            if (g != null) {
                System.out.println(g);
            }
        }
    }

    public boolean updateGalaxy(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < galaxies.length; i++) {
            if (galaxies[i] != null && galaxies[i].equals(oldName)) {
                galaxies[i] = newName;
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    public boolean deleteGalaxy(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < galaxies.length; i++) {
            if (galaxies[i] != null && galaxies[i].equals(name)) {
                galaxies[i] = null;
                isDeleted = true;
            }
        }
        return isDeleted;
    }
}