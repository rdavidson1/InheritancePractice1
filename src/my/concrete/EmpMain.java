/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;
//java.util.Scanner;
/**
 *
 * @author Ryan
 */
public class EmpMain {
    

    public static void main(String[] args) {
        //Scanner keyboard = New Scanner(System.in);
        
        HourlyEmployee Emp1 = new HourlyEmployee();
        Emp1.setAge(24);
        Emp1.setfName("Bob");
        Emp1.setlName("Parks");
        Emp1.setEmpId("123abc");
        
        Emp1.setHourlyRate(20.0);
        Emp1.setHoursWorked(38);
        
        SalariedEmployee Emp2 = new SalariedEmployee();
        Emp2.setfName("Jane");
        Emp2.setSalary(50000.00);
        
        SalaryPlusCommissionEmployee Emp3 = new SalaryPlusCommissionEmployee();
        Emp3.setfName("Jack");
        Emp3.setCommission(3000);
        Emp3.setSalary(45000);
        
        System.out.println(Emp1.getfName() + "'s pay this week is $" + Emp1.getTotalPay());
        System.out.println(Emp2.getfName() + "'s weekly pay is $" + Emp2.getWeeklyPay());
        System.out.println(Emp3.getfName() + "'s annual pay is $" + Emp3.getComPay());
    }
}