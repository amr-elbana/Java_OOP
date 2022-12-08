package com.company;


public class Main {

    public static void main(String[] args) {
    Circle c1 = new Circle(2.5,"Red");
    Clindar cy1 = new Clindar(3.5);

    System.out.println("The Area = "+c1.getArea());
    System.out.println("The Volume = "+cy1.getVoulume());

        System.out.println(c1 + " " + cy1);


    }
}
