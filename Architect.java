class Architect {

    String interiorDesignNames[] = new String[11];
    int index;

    public boolean addDesign(String name) {
        boolean isAdded = false;

        if (index < interiorDesignNames.length) {
            if (name != null && !name.isEmpty()) {
                interiorDesignNames[index] = name;
                index++;
                isAdded = true;
            }
        }
        return isAdded;
    }

    public void getAllDesigns() {
        for (String d : interiorDesignNames) {
            if (d != null) {
                System.out.println(d);
            }
        }
    }

    public boolean updateDesign(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < interiorDesignNames.length; i++) {
            if (interiorDesignNames[i] != null && interiorDesignNames[i].equals(oldName)) {
                interiorDesignNames[i] = newName;
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    public boolean deleteDesign(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < interiorDesignNames.length; i++) {
            if (interiorDesignNames[i] != null && interiorDesignNames[i].equals(name)) {
                interiorDesignNames[i] = null;
                isDeleted = true;
            }
        }
        return isDeleted;
    }
}