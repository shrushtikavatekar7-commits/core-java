class Wonderla {

	private String waterGames[] = new String[20];
	int index;

	public boolean addWaterGame(String game){
		boolean isAdded = false;

		if(game != null && !game.isEmpty()){
			waterGames[index] = game;
			index++;
			isAdded = true;
		}
		else{
			System.out.println(game + " is invalid");
		}

		return isAdded;
	}

	public void getWaterGames(){
		for(String game : waterGames){
			System.out.println(game);
		}
	}
}