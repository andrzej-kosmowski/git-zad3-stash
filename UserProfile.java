package com.example;

public class UserProfile {
    private String name;
    private String email;
    private int age;
    private String lastName;

    public UserProfile(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.lastName = lastName;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getAge() { return age; }
    public String getLastName() { return lastName; }
}
