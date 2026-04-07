class SupersetRunner {

    public static void main(String[] args) {

        SupersetService service = new SupersetService();

        SupersetAccount acc = new SupersetAccount();
        acc.setUserName("arun");
        acc.setEmail("arun@superset.com");
        acc.setPassword("super123");
        acc.setContactNo(9123409876L);
        acc.setCollege("VTU");

        System.out.println(service.createAccount(acc));
        service.getDetails();
    }
}