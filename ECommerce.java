class ECommerce {

    String productNames[] = new String[26];
    int index;

    public boolean addProduct(String name) {
        boolean isAdded = false;

        if (index < productNames.length) {
            if (name != null && !name.isEmpty()) {
                productNames[index] = name;
                index++;
                isAdded = true;
            } else {
                System.out.println("Invalid product name");
            }
        } else {
            System.out.println("Array is full");
        }

        return isAdded;
    }

    public void getAllProducts() {
        for (String product : productNames) {
            if (product != null) {
                System.out.println(product);
            }
        }
    }

    public boolean updateProduct(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < productNames.length; i++) {
            if (productNames[i] != null && productNames[i].equals(oldName)) {
                productNames[i] = newName;
                isUpdated = true;
            }
        }

        if (!isUpdated) {
            System.out.println(oldName + " not found");
        }

        return isUpdated;
    }

    public boolean deleteProduct(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < productNames.length; i++) {
            if (productNames[i] != null && productNames[i].equals(name)) {
                productNames[i] = null;
                isDeleted = true;
            }
        }

        if (!isDeleted) {
            System.out.println(name + " not found");
        }

        return isDeleted;
    }
}