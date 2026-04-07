class WhatsAppService {

    WhatsAppAccount account;

    public boolean createAccount(WhatsAppAccount user) {

        boolean isCreated = false;

        if (user.getUserName() != null && !user.getUserName().isEmpty() &&
            user.getEmail() != null && !user.getEmail().isEmpty() &&
            user.getPassword() != null && !user.getPassword().isEmpty() &&
            user.getContactNo() > 0 &&
            user.getStatus() != null && !user.getStatus().isEmpty()) {

            account = user;
            isCreated = true;

        } else {
            System.out.println("Invalid WhatsApp details");
        }

        return isCreated;
    }

    public void getDetails() {
        if (account != null) {
            System.out.println(account.getUserName());
            System.out.println(account.getEmail());
            System.out.println(account.getPassword());
            System.out.println(account.getContactNo());
            System.out.println(account.getStatus());
        }
    }
}