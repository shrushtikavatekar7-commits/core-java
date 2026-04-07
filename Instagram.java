class Instagram {

    InstagramAccount account;

    public boolean createUserAccount(InstagramAccount userAccount) {

        if (userAccount.getUserId() > 0 &&
            userAccount.getUserName() != null &&
            userAccount.getEmail() != null) {

            this.account = userAccount;
            return true;
        }

        System.out.println("Invalid Instagram account");
        return false;
    }