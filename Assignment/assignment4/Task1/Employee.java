public class Employee extends Person {
    private String office;
    private double salary;
    private String startDate;

    public Employee(){}

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, String startDate) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.startDate = startDate;
    }

    public String getOffice() {
        return office;
    }
    
    public void setOffice(String office) {
        this.office = office;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String getStartDate() {
        return startDate;
    }
    
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    @Override
    public String toString() {
        return super.toString() + ", Office: " + office + ", Salary: " + salary + ", Start Date: " + startDate;
    }
}
