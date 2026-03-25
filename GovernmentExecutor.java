class GovernmentExecutor {
	public static void main(String[] args){

		Government govt = new Government();

		govt.addExamName("UPSC");
		govt.addExamName("KPSC");
		govt.addExamName("SSC");
		govt.addExamName("IBPS PO");
		govt.addExamName("IBPS Clerk");
		govt.addExamName("RRB NTPC");
		govt.addExamName("RRB Group D");
		govt.addExamName("NDA");
		govt.addExamName("CDS");

		govt.getExamNames();
	}
}