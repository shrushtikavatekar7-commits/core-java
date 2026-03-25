class StateExecutor {
	public static void main(String[] args){

		State state = new State();

		state.addHighwayName("NH 44");
		state.addHighwayName("NH 48");
		state.addHighwayName("NH 75");
		state.addHighwayName("NH 275");
		state.addHighwayName("NH 50");
		state.addHighwayName("NH 67");
		state.addHighwayName("NH 73");
		state.addHighwayName("NH 150A");
		state.addHighwayName("NH 766");

		state.getHighwayNames();
	}
}