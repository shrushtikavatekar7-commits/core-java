class GovernmentExecutor {

    public static void main(String[] args) {

        Government gov = new Government();

        gov.addExam("UPSC");
        gov.addExam("SSC");
        gov.addExam("Bank PO");

        gov.getAllExams();

        gov.updateExam("SSC", "Railway");

        gov.getAllExams();

        gov.deleteExam("UPSC");

        gov.getAllExams();
    }
}