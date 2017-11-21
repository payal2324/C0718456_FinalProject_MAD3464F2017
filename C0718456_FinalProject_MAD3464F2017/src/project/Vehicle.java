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
public class Vehicle implements IPrintable {

    String make;
    String model;

    public Vehicle() {
        make = "";
        model = "";
    }

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "make=" + make + ", model=" + model + '}';
    }

    @Override
    public String printMyData() {

        return "\n\t- Make : " + this.getMake()
                + "\n\t- Model : " + this.getModel();

// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
