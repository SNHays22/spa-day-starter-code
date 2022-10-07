package org.launchcode.spaday.models;

import java.util.Objects;

public class User {

    private String username;
    private String email;
    private String password;


    public void UserProfile(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
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
    }


}
