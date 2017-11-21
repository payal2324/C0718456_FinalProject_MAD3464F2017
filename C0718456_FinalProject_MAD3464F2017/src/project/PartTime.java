/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 * @author macstudent
 */
public class PartTime extends Employee implements IPrintable {

    private int hourlyRate;
    private int numberHoursWorked;
    private String employeeType = "Part Time /";
    String subclass;

    PartTime() {
        super();
        this.hourlyRate = 0;
        this.numberHoursWorked = 0;

    }

    public PartTime(String name, int age, int hourlyRate, int numberHoursWorked) {
        super(name, age);
        this.hourlyRate = hourlyRate;
        this.numberHoursWorked = numberHoursWorked;
    }

    public PartTime(String name, int age, Vehicle v, int hourlyRate, int numberHoursWorked) {
        super(name, age, v);
        this.hourlyRate = hourlyRate;
        this.numberHoursWorked = numberHoursWorked;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getNumberHoursWorked() {
        return numberHoursWorked;
    }

    public void setNumberHoursWorked(int numberHoursWorked) {
        this.numberHoursWorked = numberHoursWorked;
    }

    public String getEmployeeType() {
        if (this.getClass().getSimpleName().equalsIgnoreCase("CommissionBasedPartTime")) {
            subclass = "Commission Based";

            return employeeType + " " + this.subclass;
        } else {
            subclass = "Fixed Based";

            return employeeType + " " + subclass;
        }
    }

    @Override
    public double calcEarnings() {
        return (double) (this.numberHoursWorked * this.hourlyRate);
    }

    @Override
    public String printMyData() {
//     System.out.println("hi part timeemployee");
//     System.out.println("Hourly Rate : " + this.hourlyRate + "\nNumber Of Hours Worked : " + this.numberHoursWorked);
        return super.printMyData()
                + "\nEmployee is a " + getEmployeeType()
                + "\n\t- Hourly Rate : " + this.hourlyRate
                + "\n\t- Number Of Hours Worked : " + this.numberHoursWorked;
    }

    @Override
    public String toString() {
        return "PartTime{" + "hourlyRate=" + hourlyRate + ", numberHoursWorked=" + numberHoursWorked + '}';
    }

}
