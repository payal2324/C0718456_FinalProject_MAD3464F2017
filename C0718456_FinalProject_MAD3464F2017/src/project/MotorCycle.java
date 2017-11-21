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
public class MotorCycle extends Vehicle implements IPrintable {

    String brand;
    String color;

    public MotorCycle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public MotorCycle(String brand, String color, String make, String model) {
        super(make, model);
        this.brand = brand;
        this.color = color;
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
        return "MotorCycle{" + "brand=" + brand + ", color=" + color + '}';
    }

    @Override
    public String printMyData() {
        return super.printMyData()
                + "\n\t-Brand : " + this.getBrand()
                + "\n\t-Color: " + this.getColor();
        //To change body of generated methods, choose Tools | Templates.
    }

}
