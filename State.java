class State {

    String highwayNames[] = new String[9];
    int index;

    public boolean addHighway(String name) {
        boolean isAdded = false;

        if (index < highwayNames.length) {
            if (name != null && !name.isEmpty()) {
                highwayNames[index] = name;
                index++;
                isAdded = true;
            }
        }
        return isAdded;
    }

    public void getAllHighways() {
        for (String h : highwayNames) {
            if (h != null) {
                System.out.println(h);
            }
        }
    }

    public boolean updateHighway(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < highwayNames.length; i++) {
            if (highwayNames[i] != null && highwayNames[i].equals(oldName)) {
                highwayNames[i] = newName;
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    public boolean deleteHighway(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < highwayNames.length; i++) {
            if (highwayNames[i] != null && highwayNames[i].equals(name)) {
                highwayNames[i] = null;
                isDeleted = true;
            }
        }
        return isDeleted;
    }
}