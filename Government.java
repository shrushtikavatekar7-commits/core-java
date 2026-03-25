class Government {

	private String competitiveExamNames[] = new String[9];
	int index;

	public boolean addExamName(String examName){
		boolean isAdded = false;

		if(examName != null && !examName.isEmpty()){
			competitiveExamNames[index] = examName;
			index++;
			isAdded = true;
		}
		else{
			System.out.println(examName + " is invalid");
		}

		return isAdded;
	}

	public void getExamNames(){
		for(String exam : competitiveExamNames){
			System.out.println(exam);
		}
	}
}