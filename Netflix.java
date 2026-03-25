class Netflix {

	private String webSeries[] = new String[18];
	int index;

	public boolean addWebSeries(String seriesName){
		boolean isAdded = false;

		if(seriesName != null && !seriesName.isEmpty()){
			webSeries[index] = seriesName;
			index++;
			isAdded = true;
		}
		else{
			System.out.println(seriesName + " is invalid");
		}

		return isAdded;
	}

	public void getWebSeries(){
		for(String series : webSeries){
			System.out.println(series);
		}
	}
}