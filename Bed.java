class Bed {

    String bedNames[] = new String[10];
    int index;

    public boolean addBed(String name) {
        boolean isAdded = false;

        if (index < bedNames.length) {
            if (name != null && !name.isEmpty()) {
                bedNames[index++] = name;
                isAdded = true;
            }
        }
        return isAdded;
    }

    public void getAllBeds() {
        for (String b : bedNames) {
            if (b != null) {
                System.out.println(b);
            }
        }
    }

    public int searchBed(String name) {
        for (int i = 0; i < bedNames.length; i++) {
            if (bedNames[i] != null && bedNames[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean updateBed(String oldName, String newName) {
        int i = searchBed(oldName);
        if (i != -1) {
            bedNames[i] = newName;
            return true;
        }
        return false;
    }

    public boolean deleteBed(String name) {
        int i = searchBed(name);
        if (i != -1) {
            bedNames[i] = null;
            return true;
        }
        return false;
    }
}