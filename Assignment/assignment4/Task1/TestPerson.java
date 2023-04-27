public class TestPerson {
    public static void main(String[] args){
        Person person1 = new Person("HuyHieu", "HaNoi", "0123456789", "HuyHieu@mail.com");
        Student person2 = new Student("HuyHieu", "HaNoi", "0123456789", "HuyHieu@mail.com", 1);
        Staff person3 = new Staff("HuyHieu", "HaNoi", "0123456789", "HuyHieu@mail.com", "HaNoiStar", 1000, "20102022",1);
        Employee person4 = new Employee("HuyHieu", "HaNoi", "0123456789", "HuyHieu@mail.com", "HaNoiStar", 1000, "20122012");
        Lecturer person5 = new Lecturer("HuyHieu", "HaNoi", "0123456789", "HuyHieu@mail.com", "HaNoiStar", 1000, "20122012",8, "abc");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());
        System.out.println(person5.toString());
    }
}
