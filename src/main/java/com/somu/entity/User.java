package com.somu.entity;

public class User{
    String name;
    String branch;

    String location;

    public User(String n, String b, String l){
        this.name=n;
        this.branch=b;
        this.location = l;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
