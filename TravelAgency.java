class TravelAgency {

    String places[] = new String[17];
    int index;

    public boolean addPlace(String name) {
        boolean isAdded = false;

        if (index < places.length) {
            if (name != null && !name.isEmpty()) {
                places[index] = name;
                index++;
                isAdded = true;
            }
        }
        return isAdded;
    }

    public void getAllPlaces() {
        for (String p : places) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }

    public boolean updatePlace(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < places.length; i++) {
            if (places[i] != null && places[i].equals(oldName)) {
                places[i] = newName;
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    public boolean deletePlace(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < places.length; i++) {
            if (places[i] != null && places[i].equals(name)) {
                places[i] = null;
                isDeleted = true;
            }
        }
        return isDeleted;
    }
}