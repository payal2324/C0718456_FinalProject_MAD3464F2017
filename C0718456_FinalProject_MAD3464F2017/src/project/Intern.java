/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
/*

 * @author macstudent
 */
public class Intern extends Employee implements IPrintable{
    private String schoolName;
private int salary;
    public Intern() {
        super();
        this.schoolName = "";
        
    }

    public Intern( String name, int age,String schoolName, int salary) {
        super(name, age);
        this.schoolName = schoolName;
                this.salary = salary;
    }

    public Intern(String name, int age, Vehicle v,String schoolName, int salary) {
        super(name, age, v);
        this.schoolName = schoolName;
                this.salary = salary;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getSalary() {
        return salary;
    }

 
    
    @Override
    public String printMyData() {
         
        return super.printMyData()+  "\n\t- School Name : " + this.schoolName +"\n\t- Salary : "
 + this.getSalary()+ "\n*******************************************";
    }

    @Override
    public String toString() {
        return "Intern{" + "schoolName=" + schoolName + '}';
    }

    
    
}
