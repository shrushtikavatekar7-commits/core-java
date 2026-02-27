public class GiriasExecutor {

    public static void main(String[] args) {

        boolean isCreated = Girias.createWashingMachine(
                "LG",
                "TurboWash 7kg",
                28000,
                7,
                "Front Load",
                2,
                "Silver",
                true,
                1200,
                65.5
        );

        if (isCreated) {
            Girias.getWashingMachineDetails();
        }
    }
}