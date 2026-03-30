class Singer {

    String singerNames[] = new String[10];
    int index;

    public boolean addSinger(String name) {
        boolean isAdded = false;

        if (index < singerNames.length) {
            if (name != null && !name.isEmpty()) {
                singerNames[index++] = name;
                isAdded = true;
            }
        }
        return isAdded;
    }

    public void getAllSingers() {
        for (String s : singerNames) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }

    public int searchSinger(String name) {
        for (int i = 0; i < singerNames.length; i++) {
            if (singerNames[i] != null && singerNames[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean updateSinger(String oldName, String newName) {
        int i = searchSinger(oldName);
        if (i != -1) {
            singerNames[i] = newName;
            return true;
        }
        return false;
    }

    public boolean deleteSinger(String name) {
        int i = searchSinger(name);
        if (i != -1) {
            singerNames[i] = null;
            return true;
        }
        return false;
    }
}