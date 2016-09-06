package lab1.my.solution;

import lab1.*;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Startup {
    public static void main(String[] args) {
        
        Company company = new Company();
        HumanResourcesDept HRDept = new HumanResourcesDept();
        Employee employee = company.hireEmployee("Peter" , "Piper" , "123-45-6789" , "A123");
        HRDept.conductEmployeeFirstDay(employee);
    }
    
}

