class AirAsiaExecutor {

    public static void main(String[] args) {

        AirAsia air = new AirAsia();

        air.addPassenger("Ravi");
        air.addPassenger("Sneha");
        air.addPassenger("Arjun");

        System.out.println("All Passengers:");
        air.getAllPassengers();

        System.out.println("-----------");

        air.updatePassenger("Sneha", "Pooja");

        System.out.println("After Update:");
        air.getAllPassengers();

        System.out.println("-----------");

        air.deletePassenger("Ravi");

        System.out.println("After Delete:");
        air.getAllPassengers();
    }
}