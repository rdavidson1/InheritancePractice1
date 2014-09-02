/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 *
 * @author Ryan
 */
public class SalariedEmployee extends Employee{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double getMonthlyPay(){
        return salary/12;
    }
    
    public double getWeeklyPay(){
        return salary/52;
    }
    
    public double getBiweeklyPay(){
        return salary/26;
    }

    @Override
    public int getAge() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAge(int age) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
