class LinkedinRunner{

public static void main(String[] link){

System.out.println("main started");

ProfessionalAccount professionalAccount = new ProfessionalAccount();
professionalAccount.setUserId(4);
professionalAccount.setUserName("victory");
professionalAccount.setPassword("victory@134");

Linkedin linkedin = new Linkedin();
boolean ref = linkedin.CreateProfessionalAccount(professionalAccount);
if(ref){
linkedin.getProfessionalAccount();
}
else{
System.out.println("professionalAccount is invalid");
}
System.out.println("main ended");
}
}