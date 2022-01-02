

public class EmployeeInfo {

    
    // ATTRIBUTES
    public int empNum;
    public String firstName;
    public String lastName;
    public int gender; // encode e.g. 0 for M, 1 for F, etc.
    public String workLoc; // encode e.g. 0 for Mississauga, etc.
    public double deductRate; // e.g. 0.21 for 21%
    
    
    // CONSTRUCTORS
    
    public EmployeeInfo(int eN, String fN, String lN, int g, String wL, double dR) {
    	empNum = eN;
    	firstName = fN;
    	lastName = lN;
    	gender = g;
    	workLoc = wL;
    	deductRate = dR;
    }
    
    
    // METHODS
    
    public int getEmpNum() {
    	return empNum;
    }
    
    public String getFirstName() {
    	return firstName;
    }
    
    public String getLastName() {
    	return lastName;
    }
    
    public int getGender() {
        return gender;
    }
    
    public String getWorkLocation() {
        return workLoc;
    }
    
    public double getYearlySalary() {
        return -1; // override in child class
    } 
    
    public double getDeductionRate() {
        return -1; // override in child class
    } 
    
    public double getHourlyWage() {
        return -1;
    }
    
    public double getHoursPerWeek() {
        return -1;
    }
    
    public double getWeeksPerYear() {
        return -1;
    }
}
