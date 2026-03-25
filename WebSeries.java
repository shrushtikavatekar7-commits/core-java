class WebSeries {

	private String series[] = new String[18];
	int index;

	public boolean addWebSeries(String name){
		boolean isAdded = false;

		if(name != null && !name.isEmpty()){
			if(index < series.length){
				series[index] = name;
				index++;
				isAdded = true;
			}else{
				System.out.println("Series list is full");
			}
		}
		else{
			System.out.println(name + " is invalid");
		}

		return isAdded;
	}

	public void getWebSeries(){
		for(int i = 0; i < index; i++){
			System.out.println(series[i]);
		}
	}
}