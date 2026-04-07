class GooglePayService {

    GooglePayAccount account;

    public boolean createAccount(GooglePayAccount user) {

        boolean isCreated = false;

        if (user.getUserName() != null &&
            user.getEmail() != null &&
            user.getPassword() != null &&
            user.getContactNo() > 0 &&
            user.getBalance() >= 0) {

            account = user;
            isCreated = true;
        }

        return isCreated;
    }

    public void getDetails() {
        if (account != null) {
            System.out.println(account.getUserName());
            System.out.println(account.getEmail());
            System.out.println(account.getPassword());
            System.out.println(account.getContactNo());
            System.out.println(account.getBalance());
        }
    }
}