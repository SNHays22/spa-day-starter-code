package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Objects;

public class User {

    @NotEmpty(message="Please enter a username")
    @Size(min=5, max=15, message="Username must be between 5 and 15 characters.")
    private String username;

    @Email(message="Must enter a valid email.")
    private String email;

    @NotEmpty(message="Please enter a password.")
    @Size(min=6,message="Password must be at least 6 characters")
    private String password;

    @NotEmpty(message="Passwords do not match.")
    private String verifyPassword;


    private void checkPassword(){
        if(this.password != null && this.verifyPassword != null && !this.password.equals(this.verifyPassword)){
            this.verifyPassword = null;
        }
    }


    public User(){

    }

    public void UserProfile(String username, String email, String password, String verifyPassword) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.verifyPassword = verifyPassword;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public String verify(String password, String passwordA){
//        if(Objects.equals(password, passwordA)){
//            return "redirect:user/index.html";
//        }
//        else {
//            return "redirect:user/add.html";
//        }
//
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return password.equals(user.password);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        checkPassword();
    }


}
