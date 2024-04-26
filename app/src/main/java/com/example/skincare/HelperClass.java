package com.example.skincare;

public class HelperClass {

    String name,username, email, password;

    public String getUsername() {

        return username;
    }
    public void setUser(String username) {

        this.username = username;
    }

    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public String getEmail() {

        return email;
    }
    public void setEmail(String email) {

        this.email = email;
    }
    public String getPassword() {

        return password;
    }
    public void setPassword(String password) {

        this.password = password;
    }

    public HelperClass(String username, String email, String password, String name ){
        this.username = username;
        this.email = email;
        this.password = password;
        this.name = name;
    }


}
