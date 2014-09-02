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
public class EmpMain {
    
    public static void main(String[] args) {
        
        HourlyEmployee employee1 = new HourlyEmployee();
        SalariedEmployee employee2 = new SalariedEmployee();
        SalariedPlusCommissionEmployee employee3 = new SalariedPlusCommissionEmployee();
        
        employee1.setfName("Alice");
        employee2.setfName("Richard");
        employee3.setfName("Sarah");
        
        employee1.setHourlyRate(30);
        employee1.setHoursWorked(35);
        
        employee2.setSalary(65000);
        
        employee3.setSalary(70000);
        employee3.setCommission(5000);
        
        
        System.out.println(employee1.getfName() + "'s pay this week is $" + employee1.getTotalPay());
        System.out.println(employee2.getfName() + "'s weekly pay is $" + employee2.getWeeklyPay());
        System.out.println(employee3.getfName() + "'s annual pay is $" + employee3.getComPay());
    }
    
}
