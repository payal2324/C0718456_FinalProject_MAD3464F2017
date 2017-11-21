/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;

/**
 *
 * @author macstudent
 */
public class Employee implements IPrintable {

    private String name;
    private int age;
    private Vehicle v;
    private String vehicleType;
    private static ArrayList<Employee> empList = new ArrayList();

    public Employee() {
        this.name = "";
        this.age = 0;
        this.v = null;
    }

    public Employee(String name, int age, Vehicle v) {
        this.name = name;
        this.age = age;
        this.v = v;

    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static ArrayList<Employee> getEmpList() {
        return empList;
    }

    public static void setEmpList(ArrayList<Employee> empList) {
        Employee.empList = empList;
    }

    public int calcBirthYear() {
        return (2017 - this.age);
    }

    public double calcEarnings() {
        return 1000.00;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Vehicle getV() {
        return v;
    }

    public void setV(Vehicle v) {
        this.v = v;
    }

    public String getVehicleType() {

        if ((this.getV().getClass().getSimpleName().equalsIgnoreCase("Car")) || (this.getV().getClass().getSimpleName().equalsIgnoreCase("MotorCycle"))) {

            this.vehicleType = this.v.getClass().getSimpleName();
            return this.vehicleType;
        } else {
            return " No Vehicle ";
        }
    }

    @Override
    public String printMyData() {
        if (this.getClass().getSimpleName().equalsIgnoreCase("intern")) {
            return "Name: " + this.getName() + "\nYaer Of Birth : " + this.calcBirthYear()
                    + "\nEmployee has registered no Vehicle. \nEmployee is Fan Intern .";
        }

        if ((this.getVehicleType().equalsIgnoreCase("Car")) || (this.getVehicleType().equals("MotorCycle"))) {
            //  System.out.println("hii vehicle "  + this.getVehicleType());
            Vehicle obj = new Vehicle();
            obj = this.getV();
            // System.out.println(obj.printMyData());

            return "Name: " + this.getName()
                    + "\nYear Of Birth : " + this.calcBirthYear()
                    + "\nEmployee has " + this.getVehicleType() + obj.printMyData();

        }

        {
            System.out.println("hi");

            return "Name: " + this.getName() + "\nYear Of Birth : " + this.calcBirthYear() + "\nEmployee has " + this.getVehicleType();

        }
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age + ", v=" + v + ", vehicleType=" + vehicleType + '}';
    }
}
