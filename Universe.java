class Universe {

	private String galaxies[] = new String[17];
	int index;

	public boolean addGalaxy(String galaxy){
		boolean isAdded = false;

		if(galaxy != null && !galaxy.isEmpty()){
			galaxies[index] = galaxy;
			index++;
			isAdded = true;
		}
		else{
			System.out.println(galaxy + " is invalid");
		}

		return isAdded;
	}

	public void getGalaxies(){
		for(String galaxy : galaxies){
			System.out.println(galaxy);
		}
	}
}