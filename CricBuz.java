class CricBuz {

	private String teamNames[] = new String[8];
	int index;

	public boolean addTeamName(String teamName){
		boolean isAdded = false;

		if(teamName != null && !teamName.isEmpty()){
			teamNames[index] = teamName;
			index++;
			isAdded = true;
		}
		else{
			System.out.println(teamName + " is invalid");
		}

		return isAdded;
	}

	public void getTeamNames(){
		for(String team : teamNames){
			System.out.println(team);
		}
	}
}