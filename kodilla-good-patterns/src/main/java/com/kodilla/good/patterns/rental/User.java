package com.kodilla.good.patterns.rental;

public class User {
    private final String name;
    private String surname;
    private int age;
    private double money;

    public User(String name, String surname, int age, double money){
        this.name=name;
        this.surname=surname;
        this.age = age;
        this.money = money;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }
}
