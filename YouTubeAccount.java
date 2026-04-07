class YouTubeAccount {
    private int userId;
    private String userName;
    private String email;

    public void setuserId(int userId)
	{
	this.userId=userId;
	}
    public void setUserName(String userName)
	{ 
	this.userName=userName; 
	}
    public void setEmail(String email)
	{
	this.email=email; 
	}

    public int getUserId()
	{ 
	return userId;
	}
    public String getUserName()
	{
	return userName; 
	}
    public String getEmail()
	{
	return email;
	}
}