package com.company;

public class Clindar extends Circle {

    public Clindar() {

    }

    public Clindar(double height) {
        this.height = height;
    }

    public Clindar(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Clindar(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Clindar{" +
                "height=" + height +
                '}';
    }

    private double height;

    public double getVoulume(){

        return Math.PI  * 2 * height * getRadius() ;
    }

}
