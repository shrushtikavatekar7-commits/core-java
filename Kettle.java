class Kettle {

    String kettleNames[] = new String[10];
    int index;

    public boolean addKettle(String name) {
        boolean isAdded = false;

        if (index < kettleNames.length) {
            if (name != null && !name.isEmpty()) {
                kettleNames[index++] = name;
                isAdded = true;
            }
        }
        return isAdded;
    }

    public void getAllKettles() {
        for (String k : kettleNames) {
            if (k != null) {
                System.out.println(k);
            }
        }
    }

    public int searchKettle(String name) {
        for (int i = 0; i < kettleNames.length; i++) {
            if (kettleNames[i] != null && kettleNames[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean updateKettle(String oldName, String newName) {
        int i = searchKettle(oldName);
        if (i != -1) {
            kettleNames[i] = newName;
            return true;
        }
        return false;
    }

    public boolean deleteKettle(String name) {
        int i = searchKettle(name);
        if (i != -1) {
            kettleNames[i] = null;
            return true;
        }
        return false;
    }
}