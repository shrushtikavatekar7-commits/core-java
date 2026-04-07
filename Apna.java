class Apna {

    ApnaAccount apnaAccount;

    String uName;

    public boolean createUserAccount(ApnaAccount userAccount) {

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

            this.apnaAccount = userAccount;

            isUserAccountCreated = true;

        } else {

            System.out.println("Invalid Apna account details");
        }

        return isUserAccountCreated;
    }

    public void getUserDetails() {

        if (apnaAccount != null) {

            System.out.println("user id is " + apnaAccount.getUserId());

            System.out.println("user name is " + apnaAccount.getUserName());

            System.out.println("user email is " + apnaAccount.getEmail());

        } else {

            System.out.println("No user account found");
        }
    }
}