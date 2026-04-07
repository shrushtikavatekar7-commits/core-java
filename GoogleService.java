class GoogleService {

    GoogleAccount account;

    public boolean createAccount(GoogleAccount user) {

        if (user.getEmail() != null && user.getPassword() != null) {
            account = user;
            return true;
        }

        return false;
    }

    public void getDetails() {
        if (account != null) {
            System.out.println(account.getUserName());
            System.out.println(account.getEmail());
            System.out.println(account.getPassword());
            System.out.println(account.getContactNo());
            System.out.println(account.getLocation());
        }
    }
}