package com.somu.entity;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginData {

    @NotBlank(message = "This Field Cannot Be Blank")
    @Size(min = 3, max = 12, message = "Username Between 3 - 12 Character...")
    private String username;
    private String email;

    public LoginData() {
    }

    public LoginData(String username, String email) {
        this.username = username;
        this.email = email;
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

    @Override
    public String toString() {
        return "LoginData{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
