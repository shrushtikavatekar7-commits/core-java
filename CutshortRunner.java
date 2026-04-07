class CutshortRunner {

    public static void main(String[] args) {

        CutshortService service = new CutshortService();

        CutshortAccount acc = new CutshortAccount();
        acc.setUserName("shruthi");
        acc.setEmail("shruthi@cutshort.com");
        acc.setPassword("cut123");
        acc.setContactNo(9876501234L);
        acc.setSkills("Java, SQL, Data Analytics");

        System.out.println(service.createAccount(acc));
        service.getDetails();
    }
}