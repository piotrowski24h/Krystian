package com.kodilla.good.patterns.order;

public class User {
    private final String name;
    private String surmane;
    private int age;
    private double money;

    public User(String name, String surmane, int age ,double money) {
        this.name=name;
        this.surmane=surmane;
        this.age=age;
        this.money=money;
    }
 public String getName() {
        return name;

 }
 public void setName(String name) {

 }

    public String getSurmane() {
        return surmane;
    }
    public void setSurmane(String surmane) {
        this.surmane =surmane;
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
        String surname = null;
        return "User{" + "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }
}
