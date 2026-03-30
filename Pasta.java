class Pasta {

    String pastaNames[] = new String[10];
    int index;

    public boolean addPasta(String name) {
        boolean isAdded = false;

        if (index < pastaNames.length) {
            if (name != null && !name.isEmpty()) {
                pastaNames[index++] = name;
                isAdded = true;
            }
        }
        return isAdded;
    }

    public void getAllPastas() {
        for (String p : pastaNames) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }

    public int searchPasta(String name) {
        for (int i = 0; i < pastaNames.length; i++) {
            if (pastaNames[i] != null && pastaNames[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean updatePasta(String oldName, String newName) {
        int i = searchPasta(oldName);
        if (i != -1) {
            pastaNames[i] = newName;
            return true;
        }
        return false;
    }

    public boolean deletePasta(String name) {
        int i = searchPasta(name);
        if (i != -1) {
            pastaNames[i] = null;
            return true;
        }
        return false;
    }
}