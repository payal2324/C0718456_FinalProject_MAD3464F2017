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
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Car c = new Car("May 2017", "Latest", "Maruti Suzuki", "Red");
        Car c1 = new Car("May 2008", "Old", "Wagon R", "Silver");
        MotorCycle m1 = new MotorCycle("January 1999", "Old", "Hero Honda", "Black");
        FixedBasedPartTime emp1 = new FixedBasedPartTime("Payal", 30, c, 40, 8, 10);
        CommissionBasedPartTime emp2 = new CommissionBasedPartTime("Ankita", 30, m1, 10, 10, 10);
        FullTime emp3 = new FullTime("Kiran", 28, c1, 14000, 300);
        Intern emp4 = new Intern("Palak", 25, "Lambton", 15000);

        //System.out.println(emp1.printMyData());
        //  System.out.println(emp2.printMyData());
        //  System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // System.out.println(emp4.printMyData());
        // System.out.println(emp5.printMyData());
        ArrayList<Employee> empList = new ArrayList<>(Employee.getEmpList());
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);

        for (Employee e : empList) {
            System.out.println(e.printMyData());

        }
    }
}
