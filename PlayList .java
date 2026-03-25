class PlayList {

	private String songNames[] = new String[15];
	int index;

	public boolean addSongName(String songName){
		boolean isAdded = false;

		if(songName != null && !songName.isEmpty()){
			songNames[index] = songName;
			index++;
			isAdded = true;
		}
		else{
			System.out.println(songName + " is invalid");
		}

		return isAdded;
	}

	public void getSongNames(){
		for(String song : songNames){
			System.out.println(song);
		}
	}
}