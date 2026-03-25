class RCB {

	private String playerNames[] = new String[15];
	int index;

	public boolean addPlayerName(String playerName){
		boolean isAdded = false;

		if(playerName != null && !playerName.isEmpty()){
			playerNames[index] = playerName;
			index++;
			isAdded = true;
		}
		else{
			System.out.println(playerName + " is invalid");
		}

		return isAdded;
	}

	public void getPlayerNames(){
		for(String player : playerNames){
			System.out.println(player);
		}
	}
}