package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Author a1 = new Author("Amr","y.com",true);
        Book b1 = new Book("Atomic Habits", a1,200.2,50);
        System.out.println(b1);

    }
}
