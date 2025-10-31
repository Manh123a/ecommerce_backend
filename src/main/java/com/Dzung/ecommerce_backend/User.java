package com.Dzung.ecommerce_backend;

public class User {
    private int id;
    private String name;
    private int age;
    private String address;
    private String email;
    private String password;
    private String role; // user or admin
    public User(){}
    public User(int id, String name, int age, String address, String email, String password, String role){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.password = password;
        this.role = role;
    }
    // Creating Getter and Setter
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getUsername() {
        return name;
    }

    public void setUsername(String username) {
        this.name = username;
    }

    public String getEmail() {
        return email;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // --- toString ---
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", role='" + role + '\'' +
                '}';
    }    
}
