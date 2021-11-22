package com.company;
public class Figure {

    double area;
    double perimeter;
    String name;

    //constructor
    public Figure() {
        this.area = 0;
        this.perimeter = 0;
        this.name = "";
    }

    //setters and getters
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //method print
    public void print() {
        System.out.println("Figure{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                ", name='" + name + '\'' +
                '}');
    }
}
