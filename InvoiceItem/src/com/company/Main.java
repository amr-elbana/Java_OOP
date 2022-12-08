package com.company;

public class Main {

    public static void main(String[] args) {

    InvoiceItem i1 = new InvoiceItem("211013176","mobile",25,20500.0);
    System.out.println(i1);
    System.out.println("The total Price = " + i1.getotal());

    }
}
