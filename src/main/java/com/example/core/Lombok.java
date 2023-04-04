package com.example.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Lombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        Lombok lombok = new Lombok();
        lombok.setName("hello Lombok");

        System.out.println("lombok = " + lombok);
    }
}
