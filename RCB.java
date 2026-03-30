class RCB {

    String playerNames[] = new String[15];
    int index;

    public boolean addPlayer(String name) {
        boolean isAdded = false;

        if (index < playerNames.length) {
            if (name != null && !name.isEmpty()) {
                playerNames[index] = name;
                index++;
                isAdded = true;
            }
        }
        return isAdded;
    }

    public void getAllPlayers() {
        for (String p : playerNames) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }

    public boolean updatePlayer(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < playerNames.length; i++) {
            if (playerNames[i] != null && playerNames[i].equals(oldName)) {
                playerNames[i] = newName;
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    public boolean deletePlayer(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < playerNames.length; i++) {
            if (playerNames[i] != null && playerNames[i].equals(name)) {
                playerNames[i] = null;
                isDeleted = true;
            }
        }
        return isDeleted;
    }
}