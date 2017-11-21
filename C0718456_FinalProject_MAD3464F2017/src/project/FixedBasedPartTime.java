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
public class FixedBasedPartTime extends PartTime implements IPrintable {

    int fixedPay;
    int pay;

    public FixedBasedPartTime() {
        super();
        this.fixedPay = 0;

    }

    public FixedBasedPartTime(String name, int age, int hourlyRate, int numberHoursWorked, int fixedPay) {
        super(name, age, hourlyRate, numberHoursWorked);
        this.fixedPay = fixedPay;
    }

    public FixedBasedPartTime(String name, int age, Vehicle v, int hourlyRate, int numberHoursWorked, int fixedPay) {
        super(name, age, v, hourlyRate, numberHoursWorked);
        this.fixedPay = fixedPay;
    }

    public int getFixedPay() {
        return fixedPay;
    }

    public void setFixedPay(int fixedPay) {
        this.fixedPay = fixedPay;
    }

    public int getPay() {
        return pay;
    }

    @Override
    public double calcEarnings() {
        pay = this.getNumberHoursWorked() * this.getHourlyRate(); //To change body of generated methods, choose Tools | Templates.
        return (double) (pay + fixedPay);
    }

    @Override
    public String printMyData() {
        //To change body of generated methods, choose Tools | Templates.
        //System.out.println("hi fixedbased part timeemployee");
        //return super.printMyData() + super.getV()+ " Fixed Pay : "  + fixedPay;
        return super.printMyData()
                + "\n\t- " + super.getV().make
                + " Fixed Pay : " + fixedPay
                + "\n\t- Earnings : " + this.calcEarnings()
                + "(" + this.getPay() + "+" + this.getFixedPay() + " )"
                + "\n******************************************************";
    }

    @Override
    public String toString() {
        return "FixedBasedPartTime{" + "fixedPay=" + fixedPay + '}';
    }

}
