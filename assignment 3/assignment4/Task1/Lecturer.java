public class Lecturer extends Employee {
    private int officeHours;
    private String title;

    public Lecturer(){}

    public Lecturer(String name, String address, String phoneNumber, String email, String office, double salary, String startDate, int officeHours, String title){
        super(name, address, phoneNumber, email, office, salary, startDate);
        this.officeHours = officeHours;
        this.title = title;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
}
