class Television {

    String channelNames[] = new String[17];
    int index;

    public boolean addChannel(String name) {
        boolean isAdded = false;

        if (index < channelNames.length) {
            if (name != null && !name.isEmpty()) {
                channelNames[index] = name;
                index++;
                isAdded = true;
            } else {
                System.out.println("Invalid channel name");
            }
        } else {
            System.out.println("Array is full");
        }

        return isAdded;
    }

    public void getAllChannels() {
        for (String ch : channelNames) {
            if (ch != null) {
                System.out.println(ch);
            }
        }
    }

    public boolean updateChannel(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < channelNames.length; i++) {
            if (channelNames[i] != null && channelNames[i].equals(oldName)) {
                channelNames[i] = newName;
                isUpdated = true;
            }
        }

        if (!isUpdated) {
            System.out.println(oldName + " not found");
        }

        return isUpdated;
    }

    public boolean deleteChannel(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < channelNames.length; i++) {
            if (channelNames[i] != null && channelNames[i].equals(name)) {
                channelNames[i] = null;
                isDeleted = true;
            }
        }

        if (!isDeleted) {
            System.out.println(name + " not found");
        }

        return isDeleted;
    }
}