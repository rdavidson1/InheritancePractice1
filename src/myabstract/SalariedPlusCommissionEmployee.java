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
public class SalariedPlusCommissionEmployee extends SalariedEmployee{
    private double commission;
    
    
    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
    
    public double getComPay(){
        return commission + getSalary();
    }
}
