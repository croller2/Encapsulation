/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.my.solution;

/**
 *
 * @author chris
 */
public class Company {
       
    
    public Employee hireEmployee(String firstName, String lastName, String SSN, String cubeID){
        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setSsn(SSN);
        employee.setCubeId(cubeID);   
        return employee;
    }
    
    

}
