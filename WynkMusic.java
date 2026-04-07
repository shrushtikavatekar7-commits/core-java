class WynkMusic {
    WynkMusicAccount wynkmusicaccount;
    String uName;
    public boolean createUserAccount(WynkMusicAccount userAccount) {
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
            this.wynkmusicaccount = userAccount;
            isUserAccountCreated = true;
        } else {
            System.out.println("Invalid WynkMusic account details");
        }
        return isUserAccountCreated;
    }
    public void getUserDetails() {
        if (wynkmusicaccount != null) {
            System.out.println("user id is " + wynkmusicaccount.getUserId());
            System.out.println("user name is " + wynkmusicaccount.getUserName());
            System.out.println("user email is " + wynkmusicaccount.getEmail());
        } else {
            System.out.println("No user account found");
        }
    }
}