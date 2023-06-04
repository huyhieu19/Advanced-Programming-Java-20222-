package MidtermReview.Assignment4.Task1;

import java.util.Date;

public class Employee extends Person{
    String office;
    Date startDate;
    double salary;

    public Employee() {
    }

    public Employee(String name, String adress, String email, String phoneNumber, String office, Date startDate, double salary) {
        super(name, adress, email, phoneNumber);
        this.office = office;
        this.startDate = startDate;
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public Date getStartDate() {
        return startDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
