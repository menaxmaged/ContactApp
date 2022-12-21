/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactapp;

/**
 *
 * @author mena
 */
public class Contact {
private String name;
private String mail;
private String phone; 
private Integer id; 
//constructor 

public Contact(Integer id,String name,String mail, String phone) {
 this.id=id;
  this.name = name;
 this.mail = mail;
 this.phone = phone;
 
}
//setters
public void setName(String name){
 this. name = name;
}

public void setMail(String mail){
 this.mail = mail;
}

public void setPhone(String phone){
 this. phone = phone;
}
//Getters

public String GetName(){
    return this.name;
}


public  String GetMail(){
    return this.mail;
}

public String GetPhone(){
    return this.phone;
}




}


