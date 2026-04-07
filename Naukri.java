class Naukri {

    NaukriAccount naukriAccount;

    String uName;

    public boolean createUserAccount(NaukriAccount userAccount) {

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

            this.naukriAccount = userAccount;

            isUserAccountCreated = true;

        } else {

            System.out.println("Invalid Naukri account details");
        }

        return isUserAccountCreated;
    }

    public void getUserDetails() {

        if (naukriAccount != null) {

            System.out.println("user id is " + naukriAccount.getUserId());

            System.out.println("user name is " + naukriAccount.getUserName());

            System.out.println("user email is " + naukriAccount.getEmail());

        } else {

            System.out.println("No user account found");
        }
    }
}