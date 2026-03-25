class Architect {

	private String interiorDesignNames[] = new String[11];
	int index;

	public boolean addInteriorDesign(String design){
		boolean isAdded = false;

		if(design != null && !design.isEmpty()){
			interiorDesignNames[index] = design;
			index++;
			isAdded = true;
		}
		else{
			System.out.println(design + " is invalid");
		}

		return isAdded;
	}

	public void getInteriorDesigns(){
		for(String interiorDesignName : interiorDesignNames){
			System.out.println(interiorDesignName);
		}
	}
}