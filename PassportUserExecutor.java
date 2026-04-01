class PassportUserExecutor {

    public static void main(String[] args) {

        PassportUser user1 = new PassportUser();

        user1.setName("Shrushti");
        user1.setSurname("Kavatekar");
        user1.setPassportId(12345);
        user1.setDateOfBirth("24-05-2004");
        user1.setReligion("Hindu");
        user1.setLocation("Bangalore");
        user1.setContactNo(9876543210L);
           System.out.println("USER1");
        System.out.println("Name: " + user1.getName());
        System.out.println("Surname: " + user1.getSurname());
        System.out.println("Passport ID: " + user1.getPassportId());
        System.out.println("Date of Birth: " + user1.getDateOfBirth());
        System.out.println("Religion: " + user1.getReligion());
        System.out.println("Location: " + user1.getLocation());
        System.out.println("Contact No: " + user1.getContactNo());
    }
}