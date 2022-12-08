package com.company;

public class Rectangle {

    private double width;
    private double length;



    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(){
        length = 1.0;
        width = 1.0;
    }


    public void Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }
    public double getPeremeter(){
        return (length+width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }



}
