class YouTube {

    YouTubeAccount youtubeaccount;
    String uName;

    public boolean createUserAccount(YouTubeAccount userAccount){

        boolean a=false,b=false,c=false;

        if(userAccount.getUserId()>0) a=true;

        String uName=userAccount.getUserName();
        if(uName!=null && !uName.isEmpty()){
            this.uName=uName;
            b=true;
        }

        if(userAccount.getEmail()!=null && !userAccount.getEmail().isEmpty()) c=true;

        if(a && b && c){
            this.youtubeaccount=userAccount;
            return true;
        }
        return false;
    }

    public void getUserDetails(){
        System.out.println(youtubeaccount.getUserId());
        System.out.println(youtubeaccount.getUserName());
        System.out.println(youtubeaccount.getEmail());
    }
}