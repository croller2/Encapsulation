package lab1.my.solution;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Employee {
    
    // Change all properties to private.
    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date currentDate;

    
    
    //Employee First Name Methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        validateFirstName(firstName);
    }

    private void validateFirstName(String firstName){
        if(firstName.length() > 0){
            this.firstName = firstName;
        }else{
            System.out.println("Please Enter a valid first name");
        }
    }
    
    
    // Employee Last Name Methods
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        validateLastName(lastName);
    }
     
    private void validateLastName(String lastName){
        if(lastName.length() > 0){
            this.lastName = lastName;
        }else{
            System.out.println("Please Enter a valid last name");
        }
    }
    
    
    // Social Security Methods
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        validateSSN(ssn);
    }
    private void validateSSN(String ssn){
        if(ssn.length() > 0 && ssn.matches("\\d{3}-\\d{2}-\\d{4}")){
            this.ssn = ssn;
        }else{
            System.out.println("Please Enter a valid SSN: 123-45-6789");
        }
    }
    
    
    // Birth Date Methods
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        validateBirthDay(birthDate);
    }

    
    private void validateBirthDay(Date birthDate){
        int cutOffYear = 2000;
        if(cutOffYear < birthDate.getYear() ){
            this.birthDate = birthDate;
        }else{
            System.out.println("Please Enter a valid Date of Birth: 01-01-1990");
        }
    }
    
    
    
    //Met With HR Methods
    public boolean isMetWithHr() {
        return metWithHr;
    }

    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    public void setCubeId(String cubeId) {
        this.cubeId = cubeId;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    
    public Employee() {
        currentDate = new Date();
    }


}
