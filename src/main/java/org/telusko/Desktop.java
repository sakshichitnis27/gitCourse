package org.telusko;

public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Desktop object constructor");
    }


    @Override
    public void compile(){
        System.out.println("Desktop object compiled");
    }
}
