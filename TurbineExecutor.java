class TurbineExecutor {

    public static void main(String[] args) {

        Turbine t = new Turbine();

        t.addTurbine("Steam");
        t.addTurbine("Gas");
        t.addTurbine("Wind");
        t.addTurbine("Hydraulic");
        t.addTurbine("Pelton");
        t.addTurbine("Francis");
        t.addTurbine("Kaplan");
        t.addTurbine("Impulse");
        t.addTurbine("Reaction");
        t.addTurbine("Turbo");

        t.getAllTurbines();

        System.out.println("Index: " + t.searchTurbine("Wind"));

        t.updateTurbine("Wind", "Wind Pro");

        t.getAllTurbines();

        t.deleteTurbine("Steam");

        t.getAllTurbines();
    }
}