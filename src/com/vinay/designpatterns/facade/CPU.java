package com.vinay.designpatterns.facade;

public class CPU {

    public void freeze(){
        System.out.println("Computer Freezing...");
    }

    public void jump(long position){
        System.out.println("Jumping to... "+position);
    }


    public void execute(){
        System.out.println("Computer executing commands...");
    }
}
