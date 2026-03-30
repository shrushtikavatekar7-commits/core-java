class Phonepe {

    String insuranceNames[] = new String[27];
    int index;

    public boolean addInsuranceName(String name) {
        boolean isAdded = false;

        if (index < insuranceNames.length) {
            if (name != null && !name.isEmpty()) {
                insuranceNames[index] = name;
                index++;
                isAdded = true;
            } else {
                System.out.println("Invalid insurance name");
            }
        } else {
            System.out.println("Array is full");
        }

        return isAdded;
    }

    public void getAllInsuranceNames() {
        for (String name : insuranceNames) {
            if (name != null) {
                System.out.println(name);
            }
        }
    }

    public boolean updateInsuranceName(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < insuranceNames.length; i++) {
            if (insuranceNames[i] != null && insuranceNames[i].equals(oldName)) {
                insuranceNames[i] = newName;
                isUpdated = true;
            }
        }

        if (!isUpdated) {
            System.out.println(oldName + " not found");
        }

        return isUpdated;
    }

    public boolean deleteInsuranceName(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < insuranceNames.length; i++) {
            if (insuranceNames[i] != null && insuranceNames[i].equals(name)) {
                insuranceNames[i] = null;
                isDeleted = true;
            }
        }

        if (!isDeleted) {
            System.out.println(name + " not found");
        }

        return isDeleted;
    }
}