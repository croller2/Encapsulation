/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.my.solution;

import java.text.SimpleDateFormat;

/**
 *
 * @author chris
 */
public class HumanResourcesDept {
    
    public void conductEmployeeFirstDay(Employee employee){
        meetWithHrForBenefitAndSalryInfo(employee);
        meetDepartmentStaff(employee);
        reviewDeptPolicies(employee);
        moveIntoCubicle(employee);
        getStatus(employee);
    }
    
    // Assume this must be performed first
    private void meetWithHrForBenefitAndSalryInfo(Employee employee){
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(employee.getCurrentDate() );
        System.out.println("Met with Hr on " + fmtDate);
        employee.setMetWithHr(true);
    }

    // Assume this is must be performed second
    private void meetDepartmentStaff(Employee employee) {
        if(employee.isMetWithHr()) {
            SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
            String fmtDate = sdf.format(employee.getCurrentDate() );
            System.out.println("Met with Dept. Staff on " + fmtDate);
            employee.setMetDeptStaff(true);
        } else {
            System.out.println("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }
    
    // Assume this must be performed third
    public void reviewDeptPolicies(Employee employee) {
        if(employee.isMetWithHr() && employee.isMetDeptStaff()) {
            SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
            String fmtDate = sdf.format(employee.getCurrentDate() );
            System.out.println("Reviewed Dept. Policies on " + fmtDate);
            employee.setReviewedDeptPolicies(true);
        } else {
            System.out.println("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    public void moveIntoCubicle(Employee employee) {
        if(employee.isMetWithHr() && employee.isMetDeptStaff() && employee.isReviewedDeptPolicies() ) {
            SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
            String fmtDate = sdf.format(employee.getCurrentDate());
            System.out.println("Moved into cube on " + fmtDate);
            employee.setMovedIn(true);
        } else {
            System.out.println("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }
    }

    public String getStatus(Employee employee) {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format( employee.getCurrentDate() );
        if(employee.isMetWithHr() && employee.isMetDeptStaff()
           && employee.isReviewedDeptPolicies() && employee.isMovedIn() ) {
            return "Orientation is completed on: " + fmtDate;
        } else {
            return fmtDate + ": Orientation in progress...";
        }
    }
}
