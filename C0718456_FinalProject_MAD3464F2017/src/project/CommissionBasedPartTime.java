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
public class CommissionBasedPartTime extends PartTime implements IPrintable {

    int commission;
    int pay;

    public CommissionBasedPartTime() {
        super();
        this.commission = 0;

    }

    public CommissionBasedPartTime(String name, int age, int hourlyRate, int numberHoursWorked, int commission) {
        super(name, age, hourlyRate, numberHoursWorked);
        this.commission = commission;
    }

    public CommissionBasedPartTime(String name, int age, Vehicle v, int hourlyRate, int numberHoursWorked, int commission) {
        super(name, age, v, hourlyRate, numberHoursWorked);
        this.commission = commission;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public int getPay() {
        return pay;
    }

    @Override
    public double calcEarnings() {
        pay = this.getNumberHoursWorked() * this.getHourlyRate();
        int commisionAmount = (commission * pay) / 100;
        return (double) (commisionAmount + pay); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "CommissionBasedPartTime{" + "commission=" + commission + '}';
    }

    @Override
    public String printMyData() {

        return super.printMyData()
                + "\n\t- Commission : " + this.getCommission()
                + "\n\t- Earnings : " + this.calcEarnings()
                + "(" + this.getPay() + " + " + this.getCommission() + "% Of " + this.getPay() + " ) "
                + "\n******************************************************";

        //To change body of generated methods, choose Tools | Templates.
    }

}
