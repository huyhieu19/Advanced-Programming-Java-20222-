
public class Person{
    private String name;
    private String address;
    private String phoneNumber;
    private String email;


    public Person(){}
    public Person(String name, String address, String phoneNumber, String email){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public void setName(String _name){
        name = _name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String _address){
        address = _address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String _phoneNumber){
        phoneNumber = _phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String _email){
        email = _email;
    }

    @Override
    public String toString(){
        return "Name : " + name + ", Address: " + address + ", PhoneNumber: " + phoneNumber + ", Email: " + email;
    }
}