class CricBuz {

    String teamNames[] = new String[8];
    int index;

    public boolean addTeam(String name) {
        boolean isAdded = false;

        if (index < teamNames.length) {
            if (name != null && !name.isEmpty()) {
                teamNames[index] = name;
                index++;
                isAdded = true;
            } else {
                System.out.println("Invalid team name");
            }
        } else {
            System.out.println("Array is full");
        }

        return isAdded;
    }

    public void getAllTeams() {
        for (String team : teamNames) {
            if (team != null) {
                System.out.println(team);
            }
        }
    }

    public boolean updateTeam(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < teamNames.length; i++) {
            if (teamNames[i] != null && teamNames[i].equals(oldName)) {
                teamNames[i] = newName;
                isUpdated = true;
            }
        }

        if (!isUpdated) {
            System.out.println(oldName + " not found");
        }

        return isUpdated;
    }

    public boolean deleteTeam(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < teamNames.length; i++) {
            if (teamNames[i] != null && teamNames[i].equals(name)) {
                teamNames[i] = null;
                isDeleted = true;
            }
        }

        if (!isDeleted) {
            System.out.println(name + " not found");
        }

        return isDeleted;
    }
}