class Museum {

	private String historicalMonuments[] = new String[16];
	int index;

	public boolean addHistoricalMonument(String monument){
		boolean isAdded = false;

		if(monument != null && !monument.isEmpty()){
			historicalMonuments[index] = monument;
			index++;
			isAdded = true;
		}
		else{
			System.out.println(monument + " is invalid");
		}

		return isAdded;
	}

	public void getHistoricalMonuments(){
		for(String historicalMonument : historicalMonuments){
			System.out.println(historicalMonument);
		}
	}
}