class Flipkart {

    FlipkartAccount flipkartAccount;
    String uName;

    public boolean createUserAccount(FlipkartAccount userAccount) {

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
            this.flipkartAccount = userAccount;
            isUserAccountCreated = true;
        } else {
            System.out.println("Invalid Flipkart account details");
        }

        return isUserAccountCreated;
    }

    public void getUserDetails() {

        if (flipkartAccount != null) {
            System.out.println("user id is " + flipkartAccount.getUserId());
            System.out.println("user name is " + flipkartAccount.getUserName());
            System.out.println("user email is " + flipkartAccount.getEmail());
        } else {
            System.out.println("No user account found");
        }
    }
}