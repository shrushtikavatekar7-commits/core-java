class AirAsia {

    String passengers[] = new String[30];
    int index;

    public boolean addPassenger(String name) {
        boolean isAdded = false;

        if (index < passengers.length) {
            if (name != null && !name.isEmpty()) {
                passengers[index] = name;
                index++;
                isAdded = true;
            } else {
                System.out.println("Invalid passenger name");
            }
        } else {
            System.out.println("Array is full");
        }

        return isAdded;
    }

    public void getAllPassengers() {
        for (String p : passengers) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }

    public boolean updatePassenger(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null && passengers[i].equals(oldName)) {
                passengers[i] = newName;
                isUpdated = true;
            }
        }

        if (!isUpdated) {
            System.out.println(oldName + " not found");
        }

        return isUpdated;
    }

    public boolean deletePassenger(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null && passengers[i].equals(name)) {
                passengers[i] = null;
                isDeleted = true;
            }
        }

        if (!isDeleted) {
            System.out.println(name + " not found");
        }

        return isDeleted;
    }
}