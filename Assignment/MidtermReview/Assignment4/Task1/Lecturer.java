package MidtermReview.Assignment4.Task1;

import java.util.Date;

public class Lecturer extends Employee{
    String title; // chuc danh
    int officeHours; //

    public Lecturer(String title, int officeHours) {
        this.title = title;
        this.officeHours = officeHours;
    }

    public Lecturer() {
    }

    public Lecturer(String name, String adress, String email, String phoneNumber, String office, Date startDate, double salary, String title, int officeHours) {
        super(name, adress, email, phoneNumber, office, startDate, salary);
        this.title = title;
        this.officeHours = officeHours;
    }

    public String getTitle() {
        return title;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }
}
