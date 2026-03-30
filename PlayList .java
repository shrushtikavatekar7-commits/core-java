class PlayList {

    String songNames[] = new String[15];
    int index;

    public boolean addSong(String name) {
        boolean isAdded = false;

        if (index < songNames.length) {
            if (name != null && !name.isEmpty()) {
                songNames[index] = name;
                index++;
                isAdded = true;
            } else {
                System.out.println("Invalid song name");
            }
        } else {
            System.out.println("Array is full");
        }

        return isAdded;
    }

    public void getAllSongs() {
        for (String song : songNames) {
            if (song != null) {
                System.out.println(song);
            }
        }
    }

    public boolean updateSong(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < songNames.length; i++) {
            if (songNames[i] != null && songNames[i].equals(oldName)) {
                songNames[i] = newName;
                isUpdated = true;
            }
        }

        if (!isUpdated) {
            System.out.println(oldName + " not found");
        }

        return isUpdated;
    }

    public boolean deleteSong(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < songNames.length; i++) {
            if (songNames[i] != null && songNames[i].equals(name)) {
                songNames[i] = null;
                isDeleted = true;
            }
        }

        if (!isDeleted) {
            System.out.println(name + " not found");
        }

        return isDeleted;
    }
}