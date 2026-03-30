class Netflix {

    String webSeries[] = new String[18];
    int index;

    public boolean addWebSeries(String name) {
        boolean isAdded = false;

        if (index < webSeries.length) {
            if (name != null && !name.isEmpty()) {
                webSeries[index] = name;
                index++;
                isAdded = true;
            } else {
                System.out.println("Invalid web series");
            }
        } else {
            System.out.println("Array is full");
        }

        return isAdded;
    }

    public void getWebSeries() {
        for (String series : webSeries) {
            if (series != null) {
                System.out.println(series);
            }
        }
    }

    public boolean updateWebSeries(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < webSeries.length; i++) {
            if (webSeries[i] != null && webSeries[i].equals(oldName)) {
                webSeries[i] = newName;
                isUpdated = true;
            }
        }

        if (!isUpdated) {
            System.out.println(oldName + " not found");
        }

        return isUpdated;
    }

    public boolean deleteWebSeries(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < webSeries.length; i++) {
            if (webSeries[i] != null && webSeries[i].equals(name)) {
                webSeries[i] = null;
                isDeleted = true;
            }
        }

        if (!isDeleted) {
            System.out.println(name + " not found");
        }

        return isDeleted;
    }
}