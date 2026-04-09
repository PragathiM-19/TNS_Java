package com.tnsif.inheritance;

public class Singlelevelmain extends Singlelevel {
    String course = "Engineering";

    void study() {
        System.out.println("Studying Java");
    }

    public static void main(String[] args) {
        
        Singlelevelmain s = new Singlelevelmain();
        
        // Parent class properties
        System.out.println(s.name);
        System.out.println(s.age);
        s.display();
        
        // Child class properties
        System.out.println(s.course);
        s.study();
    }
}