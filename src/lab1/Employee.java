package lab1;

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
    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date currentDate;

    
    public Employee(String firstName, String lastName, String ssn) {
        currentDate = new Date();
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn; 
    }

    public void hiringProcedure(int cubicle){
        meetWithHrForBenefitAndSalaryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle(Integer.toString(cubicle));
    }
    
    private String formatDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(currentDate);
        return fmtDate;
    }
    
    // Assume this must be performed first
    private void meetWithHrForBenefitAndSalaryInfo() {
        String fmtDate = formatDate();
        System.out.println("Met with Hr on " + fmtDate);
        metWithHr = true;
    }

    // Assume this is must be performed second
    private void meetDepartmentStaff() {
            String fmtDate = formatDate();
            System.out.println("Met with Dept. Staff on " + fmtDate);
            metDeptStaff = true;
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
            String fmtDate = formatDate();
            System.out.println("Reviewed Dept. Policies on " + fmtDate);
            reviewedDeptPolicies = true;
    }

    // Assume this must be performed 4th
    private void moveIntoCubicle(String cubeId) {
            String fmtDate = formatDate();
            System.out.println("Moved into cube on " + fmtDate);
            this.cubeId = cubeId;
            this.movedIn = true;
    }

    public String getStatus() {
        String fmtDate = formatDate();
        if(metWithHr && metDeptStaff
           && reviewedDeptPolicies && movedIn) {
            return "Orientation completed on: " + fmtDate;
        } else {
            return fmtDate + ": Orientation in progress...";
        }
    }
}
