package org.telusko;

import java.awt.*;
import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Computer com;
//    private Laptop lap = new Laptop();

    public Alien() {
        System.out.println("Alien constructed");
    }

//    public Alien(int age) {
//        System.out.println("Para Constructor called");
//        this.age = age;
//    }

//    @ConstructorProperties({"age","lap"})
//    public Alien(int age, Computer com) {
//        this.age = age;
//        this.lap = lap;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("setter called");
        this.age = age;
    }

//    public Alien(Laptop lap) {
//        this.lap = lap;
//    }

//    public void setAge(int age) {
//        System.out.println("setter called");
//        this.age = age;
//    }

//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Alien is coding");
        com.compile();
    }
}
