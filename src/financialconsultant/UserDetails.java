/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financialconsultant;

/**
 *
 * @author MAX
 */
public class UserDetails {
    
    private String firstname;
    private String Lastname;
    private String Username;
    private String password;
    private String Emailaddress;
    
    public UserDetails ud;
    
    public UserDetails(){
        firstname = "";
        Lastname = "";
        Username = "";
        password = "";
        Emailaddress = "";
    }
    
    public void setFname(String ss){
        firstname = ss;
    }
    
    public void setLname(String LL){
        Lastname = LL;
    }
    
    public void setUsername(String use){
        Username = use;
    }
    
    public void setPassword(String pass){
        password = pass;
    }
    
    public void setEmailaddress(String email){
        Emailaddress = email;
    }
    
    public String getFname(){
        return firstname;
    }
    
    public String getLname(){
        return Lastname;
    }
    
    public String getUsername(){
        return Username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getEmailAddress(){
        return Emailaddress;
    }
    
}
