public class Staff extends Employee{
    private int rank;
    public Staff(){}

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, String startDate, int rank){
        super(name, address, phoneNumber, email, office, salary, startDate);
        this.rank = rank;
    }
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
