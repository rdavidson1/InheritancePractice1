/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author Ryan
 */
public class EmpMain {
    

    public static void main(String[] args) {
//        Scanner keyboard = New Scanner(System.in);
        
        HourlyEmployee Emp1 = new HourlyEmployee();
        Emp1.setAge(24);
        Emp1.setfName("Bob");
        Emp1.setlName("Parks");
        Emp1.setEmpId("123abc");
        
        Emp1.setHourlyRate(20.0);
        Emp1.setHoursWorked(38);
        
        
        System.out.println("Pay is " + Emp1.getTotalPay());
    }
}