package com.company;

public class Employee {
    private int id;


    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        FirstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }


    private String FirstName;
    private String lastName;
    private int salary;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary*12;
    }
    // int raiseSalary(){int percent = 0 ; return 0;}

    public int raiseSalary(int percent){
        int newsalary;
        newsalary = salary + (salary*(percent/100));
        return newsalary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

}
