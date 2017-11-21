/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

public class FullTime extends Employee implements IPrintable {

    private int salary;
    private int bonus;

    public FullTime() {
        super();
        this.salary = 0;
        this.bonus = 0;
    }

    public FullTime(String name, int age, Vehicle v, int salary, int bonus) {
        super(name, age, v);
        this.salary = salary;
        this.bonus = bonus;
    }

    public FullTime(String name, int age, int salary, int bonus) {
        super(name, age);
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcEarnings() {
        return (double) (this.salary + this.bonus);
    }

    @Override
    public String printMyData() {
        String s = this.getV().getClass().getSimpleName();
        return super.printMyData() + "\nEmployee is a Full Time Employee."
                + "\n\t- Salary: " + this.salary
                + "\n\t- Bonus: " + this.bonus
                + "\n\t- Earnings : " + this.calcEarnings()
                + "\n******************************************************";
    }

    @Override
    public String toString() {
        return "FullTime{" + "salary=" + salary + ", bonus=" + bonus + '}';
    }

}
