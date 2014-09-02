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
public class EmpMain {
    
    public static void main(String[] args) {
        
        
        HourlyEmployee emp1 = new HourlyEmployee() {

            @Override
            public void setfName() {
                
            }

            @Override
            public void setlName() {
                
            }

            @Override
            public void setEmpId() {
                
            }

            @Override
            public void setAge() {
                
            }
        };
        SalariedEmployee emp2 = new SalariedEmployee();
        SalaryPlusCommissionEmployee emp3 = new SalaryPlusCommissionEmployee() {};

           emp1.setfName("John");
           emp1.setHourlyRate(30);
           emp1.setHoursWorked(40);
           
           emp2.setfName("Bill");
           emp2.setSalary(60000);
           
           emp3.setfName("Melissa");
           emp3.setCommission(10000);
           emp3.setSalary(55000);
           
        
        System.out.println(emp1.getfName() + "'s pay this week is $" + emp1.getHPay());
        System.out.println(emp2.getfName() + "'s weekly pay is $" + emp2.getWeeklyPay());
        System.out.println(emp3.getfName() + "'s annual pay is $" + emp3.getCommPay());
    }
    
}
