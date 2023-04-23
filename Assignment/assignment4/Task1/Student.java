public class Student extends Person {
    private int status;

    public Student(){}

    public Student(String name, String address, String phoneNumber, String email, int status){
        super(name, address, phoneNumber, email);
        this.status = status;
    }
    public int getStatus() {
        return status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString(){
        String statusString = "";
        switch(status) {
            case 1:
              statusString = "freshman";
              break;
            case 2:
              statusString = "sophomore";
              break;
            case 3:
              statusString = "junior";
              break;
            case 4:
              statusString = "senior";
              break;
        }
        return super.toString() + ", Status: " + statusString;
    }
}
