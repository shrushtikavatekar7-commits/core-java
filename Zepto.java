class Zepto {

    ZeptoAccount zeptoaccount;

    String uName;

    public boolean createUserAccount(ZeptoAccount userAccount) {

        boolean isUserAccountCreated = false;

        boolean isUserIdValid = false;

        boolean isUserNameValid = false;

        boolean isEmailValid = false;

        int uId = userAccount.getUserId();

        if (uId > 0) {
            isUserIdValid = true;
        }

        String uName = userAccount.getUserName();

        if (uName != null && !uName.isEmpty()) {
            this.uName = uName;
            isUserNameValid = true;
        }

        String email = userAccount.getEmail();

        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        if (isUserIdValid && isUserNameValid && isEmailValid) {

            this.zeptoaccount = userAccount;

            isUserAccountCreated = true;

        } else {

            System.out.println("Invalid Zepto account details");
        }

        return isUserAccountCreated;
    }

    public void getUserDetails() {

        if (zeptoaccount != null) {

            System.out.println("user id is " + zeptoaccount.getUserId());

            System.out.println("user name is " + zeptoaccount.getUserName());

            System.out.println("user email is " + zeptoaccount.getEmail());

        } else {

            System.out.println("No user account found");
        }
    }
}