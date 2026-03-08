class PenDriveRunner {

    public static void main(String[] args) {

        PenDrive p1 = new PenDrive();

        p1.brand = "Sandisk";
        p1.capacity = 64;
        p1.price = 800;
        p1.color = "Black";
        p1.type = "USB3.0";

        p1.supportedDevices = new String[]{"Laptop","Mobile","TV"};
        p1.fileSystems = new String[]{"FAT32","NTFS"};
        p1.features = new String[]{"FastTransfer","Secure","Portable"};

        System.out.println("Brand: " + p1.brand);
        System.out.println("Capacity: " + p1.capacity);
        System.out.println("Price: " + p1.price);

        System.out.println("Device1: " + p1.supportedDevices[0]);
        System.out.println("Device2: " + p1.supportedDevices[1]);
        System.out.println("Device3: " + p1.supportedDevices[2]);
    }
}