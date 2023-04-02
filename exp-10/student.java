package Exp10;


public class student {
    public String name;
    public String email;
    public int phonenum;
    public String address;
    public student(String name,String email,int phonenum,String address){
        this.name=name;
        this.email=email;
        this.address=address;
        this.phonenum=phonenum;
    }
    public String getName(){
        return name;
    }
    public int getphonenum(){
        return phonenum;
    }
    public String getMail(){
        return email;
    }
    public String getAddress(){
        return address;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPhonenum(int phonenum){
        this.phonenum=phonenum;
    }
    public void setMail(String email){
        this.email=email;
    }
    public void setAddress(String address){
        this.address=address;
    }
}

