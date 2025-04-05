public class Contact {
    private String firstName;
    private String surName;
    private long phoneNumber;
    private String email;
    Contact(){

    }
    Contact(String n,String s,long p){
        this.firstName=n;
        this.surName=s;
        this.phoneNumber=p;
    }

    public String getfirstName(){
        return this.firstName;
    }
    public void setfirstName(String firstName){
        this.firstName=firstName;
    }
    public String getsurName(){
        return this.surName;
    }
    public void setsurName(String surName){
        this.surName=surName;
    }
    public long getphoneNumber(){
        return this.phoneNumber;
    }
    public void setphoneNumber(long phoneNumber ){
        this.phoneNumber=phoneNumber;
    }
    public String getemail(){
        return this.email;
    }
    public void setemail(String email ){
        this.email=email;
    }
}
