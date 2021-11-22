package com.company;

public class Main {

    public static void main(String[] args) {

        //new object Figure
        Figure object1 = new Figure();

        //setting name
        object1.setName("Square");

        object1.setArea(4);
        object1.setPerimeter(8);

        //printing informations about object1
        object1.print();
    }
}
