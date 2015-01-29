/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;


/**
 *
 * @author ryancorbin
 */
public class HRRep {
        private Employee employee;
    
    public void hireEmployee(String firstName, String lastName, String ssn){
        employee = new Employee(firstName, lastName, ssn);
        int cubicle = assignCubicle();
        employee.hiringProcedure(cubicle);
    }
    
    public String getEmployeeStatus(){
        return employee.getStatus();
                
    }
    
    private int assignCubicle(){
        int cubicle = 0 + (int)(Math.random() * (100-0) + 1);
        return cubicle;
    }
    
}
