package com.exercise.method;

import java.sql.SQLOutput;

class Engine {


    private String name;

    public Engine(String name, String type) {
        this.name = name;
    }

    public Engine() {

    }
}
class Application{
    public static void main () {
   Engine opel = new Engine("Opel","Astra");
        System.out.println(opel);




    }

}
