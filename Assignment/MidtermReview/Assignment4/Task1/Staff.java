package MidtermReview.Assignment4.Task1;

import java.util.Date;

public class Staff extends Employee{
    String rank;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Staff() {
    }

    public Staff(String name, String address, String email, String phoneNumber, String office, Date startDate, double salary, String rank) {
        super(name, address, email, phoneNumber, office, startDate, salary);
        this.rank = rank;
    }
}
