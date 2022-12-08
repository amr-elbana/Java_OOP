package com.company;

public class Main {

    public static void main(String[] args) {
	Employee e1 = new Employee(211013176 , "Amr" , "Elbana" , 1000);
    System.out.println(e1);
    System.out.println("Annual Salary = "+ e1.getAnnualSalary());
    System.out.println("The new salary = " + e1.raiseSalary(30));


    }
}
