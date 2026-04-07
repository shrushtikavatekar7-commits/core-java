class CutshortService {

    CutshortAccount account;

    public boolean createAccount(CutshortAccount user) {

        boolean isCreated = false;

        if (user.getUserName() != null && !user.getUserName().isEmpty() &&
            user.getEmail() != null && user.getEmail().contains("@") &&
            user.getPassword() != null && user.getPassword().length() >= 4 &&
            user.getContactNo() > 0 &&
            user.getSkills() != null && !user.getSkills().isEmpty()) {

            account = user;
            isCreated = true;

        } else {
            System.out.println("Invalid Cutshort details");
        }

        return isCreated;
    }

    public void getDetails() {
        if (account != null) {
            System.out.println(account.getUserName());
            System.out.println(account.getEmail());
            System.out.println(account.getPassword());
            System.out.println(account.getContactNo());
            System.out.println(account.getSkills());
        }
    }
}