class Government {

    String competitiveExamNames[] = new String[9];
    int index;

    public boolean addExam(String name) {
        boolean isAdded = false;

        if (index < competitiveExamNames.length) {
            if (name != null && !name.isEmpty()) {
                competitiveExamNames[index] = name;
                index++;
                isAdded = true;
            }
        }
        return isAdded;
    }

    public void getAllExams() {
        for (String e : competitiveExamNames) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    public boolean updateExam(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < competitiveExamNames.length; i++) {
            if (competitiveExamNames[i] != null && competitiveExamNames[i].equals(oldName)) {
                competitiveExamNames[i] = newName;
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    public boolean deleteExam(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < competitiveExamNames.length; i++) {
            if (competitiveExamNames[i] != null && competitiveExamNames[i].equals(name)) {
                competitiveExamNames[i] = null;
                isDeleted = true;
            }
        }
        return isDeleted;
    }
}