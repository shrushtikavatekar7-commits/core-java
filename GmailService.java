class GmailService {

    GmailAccount account;

    public boolean createAccount(GmailAccount user) {

        boolean isCreated = false;

        if (user.getUserName() != null && !user.getUserName().isEmpty() &&
            user.getEmail() != null && user.getEmail().contains("@") &&
            user.getPassword() != null && user.getPassword().length() >= 4 &&
            user.getContactNo() > 0 &&
            user.getRecoveryEmail() != null) {

            account = user;
            isCreated = true;

        } else {
            System.out.println("Invalid Gmail details");
        }

        return isCreated;
    }

    public void getDetails() {
        if (account != null) {
            System.out.println(account.getUserName());
            System.out.println(account.getEmail());
            System.out.println(account.getPassword());
            System.out.println(account.getContactNo());
            System.out.println(account.getRecoveryEmail());
        }
    }
}