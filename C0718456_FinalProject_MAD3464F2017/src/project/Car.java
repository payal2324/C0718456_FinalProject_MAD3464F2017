/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author macstudent
 */
public class Car extends Vehicle implements IPrintable {

    private String brand;
    private String color;

    public Car(String make, String model, String brand, String color) {
        super(make, model);
        this.brand = brand;
        this.color = color;
        this.brand = brand;
        this.color = color;
    }

    public Car() {
        super();
        this.brand = "";
        this.color = "";

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" + "brand=" + brand + ", color=" + color + '}';
    }

    @Override
    public String printMyData() {

        return super.printMyData()
                + "\n\t- Brand : " + this.getBrand()
                + "\n\t- Color : " + this.getColor();

    }

}
