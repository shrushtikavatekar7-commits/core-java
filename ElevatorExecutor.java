public class ElevatorExecutor {

    public static void main(String[] args) {

        boolean isCreated = Elevator.createElevator(
                "Otis",
                10,
                2,
                15,
                true,
                "Passenger",
                1.5
        );

        if (isCreated) {
            Elevator.getElevatorDetails();
        }
    }
}