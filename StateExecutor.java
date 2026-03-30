class StateExecutor {

    public static void main(String[] args) {

        State state = new State();

        state.addHighway("NH44");
        state.addHighway("NH48");
        state.addHighway("NH75");

        state.getAllHighways();

        state.updateHighway("NH48", "NH50");

        state.getAllHighways();

        state.deleteHighway("NH44");

        state.getAllHighways();
    }
}