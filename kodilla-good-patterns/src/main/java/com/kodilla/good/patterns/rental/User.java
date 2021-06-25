package com.kodilla.good.patterns.challenges;

public class User {
    private final String name;
    private String surname;

    public User(String name, String surname){
        this.name=name;
        this.surname=surname;

    }
    public String getName(){
        return name;
    }
    public void setName(String name) {

    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

}
