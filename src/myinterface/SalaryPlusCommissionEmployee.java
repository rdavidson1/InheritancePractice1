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
public abstract class SalaryPlusCommissionEmployee extends SalariedEmployee{
    
    private double commission;
    
    
    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
    
    public double getCommPay(){
        return commission + getSalary();
    }
}
