class Turbine {

    String turbineNames[] = new String[10];
    int index;

    public boolean addTurbine(String name) {
        boolean isAdded = false;

        if (index < turbineNames.length) {
            if (name != null && !name.isEmpty()) {
                turbineNames[index++] = name;
                isAdded = true;
            }
        }
        return isAdded;
    }

    public void getAllTurbines() {
        for (String t : turbineNames) {
            if (t != null) {
                System.out.println(t);
            }
        }
    }

    public int searchTurbine(String name) {
        for (int i = 0; i < turbineNames.length; i++) {
            if (turbineNames[i] != null && turbineNames[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean updateTurbine(String oldName, String newName) {
        int i = searchTurbine(oldName);
        if (i != -1) {
            turbineNames[i] = newName;
            return true;
        }
        return false;
    }

    public boolean deleteTurbine(String name) {
        int i = searchTurbine(name);
        if (i != -1) {
            turbineNames[i] = null;
            return true;
        }
        return false;
    }
}