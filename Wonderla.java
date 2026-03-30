class Wonderla {

    String waterGames[] = new String[20];
    int index;

    public boolean addWaterGame(String name) {
        boolean isAdded = false;

        if (index < waterGames.length) {
            if (name != null && !name.isEmpty()) {
                waterGames[index] = name;
                index++;
                isAdded = true;
            } else {
                System.out.println("Invalid game name");
            }
        } else {
            System.out.println("Array is full");
        }

        return isAdded;
    }

    public void getAllWaterGames() {
        for (String game : waterGames) {
            if (game != null) {
                System.out.println(game);
            }
        }
    }

    public boolean updateWaterGame(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < waterGames.length; i++) {
            if (waterGames[i] != null && waterGames[i].equals(oldName)) {
                waterGames[i] = newName;
                isUpdated = true;
            }
        }

        if (!isUpdated) {
            System.out.println(oldName + " not found");
        }

        return isUpdated;
    }

    public boolean deleteWaterGame(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < waterGames.length; i++) {
            if (waterGames[i] != null && waterGames[i].equals(name)) {
                waterGames[i] = null;
                isDeleted = true;
            }
        }

        if (!isDeleted) {
            System.out.println(name + " not found");
        }

        return isDeleted;
    }
}