package MidtermReview.Assignment4.Task1;

public class Student extends Person{
    private static final int freshman = 1;
    private static final int sophomore = 2;
    private static final int junior = 3;
    private static final int senior = 4;
    int status;

    public Student() {
    }

    public Student(String name, String address, String email, String phoneNumber, int status) {
        super(name, address, email, phoneNumber);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
