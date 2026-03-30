class CylinderExecutor {

    public static void main(String[] args) {

        Cylinder c = new Cylinder();

        c.addCylinder("HP");
        c.addCylinder("Indane");
        c.addCylinder("Bharat");
        c.addCylinder("Total");
        c.addCylinder("Shell");
        c.addCylinder("Reliance");
        c.addCylinder("Adani");
        c.addCylinder("Essar");
        c.addCylinder("GasOne");
        c.addCylinder("SuperGas");

        c.getAllCylinders();

        System.out.println("Index: " + c.searchCylinder("Shell"));

        c.updateCylinder("Shell", "NewShell");

        c.getAllCylinders();

        c.deleteCylinder("HP");

        c.getAllCylinders();
    }
}