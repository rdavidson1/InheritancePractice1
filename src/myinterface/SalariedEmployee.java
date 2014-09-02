/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author Ryan
 */
public abstract class SalariedEmployee implements Employee{
  private String fName;
  private String lName;
  private String empId;
  private int Age; 
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
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Override
    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Override
    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
}
