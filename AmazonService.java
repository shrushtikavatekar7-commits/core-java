class AmazonService {

    AmazonAccount account;

    public boolean createAccount(AmazonAccount user) {

        boolean isCreated = false;

        if (user.getUserName() != null && !user.getUserName().isEmpty() &&
            user.getEmail() != null && !user.getEmail().isEmpty() &&
            user.getPassword() != null && !user.getPassword().isEmpty() &&
            user.getContactNo() > 0 &&
            user.getGender() != null && !user.getGender().isEmpty()) {

            this.account = user;
            isCreated = true;

        } else {
            System.out.println("Invalid Amazon account details");
        }

        return isCreated;
    }

    public void getDetails() {
        if (account != null) {
            System.out.println("Name: " + account.getUserName());
            System.out.println("Email: " + account.getEmail());
            System.out.println("Password: " + account.getPassword());
            System.out.println("Contact: " + account.getContactNo());
            System.out.println("Gender: " + account.getGender());
        } else {
            System.out.println("No account found");
        }
    }
}