package MidtermReview.DeOnTap;

import Assignment6.Task4.Task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(5);
        Random rd = new Random();
            studentList.add(new Student("HuyHieu" + rd.nextInt(100), 10* rd.nextDouble(), "Hust2019" + Math.round((1000*(1+rd.nextDouble(6))))));
            studentList.add(new Student("Nam" + rd.nextInt(100), 10* rd.nextDouble(), "Hust2019" + Math.round((1000*(1+rd.nextDouble(6))))));
            studentList.add(new Student("Thanh" + rd.nextInt(100), 10* rd.nextDouble(), "Hust2019" + Math.round((1000*(1+rd.nextDouble(6))))));
            studentList.add(new Student("Thoa" + rd.nextInt(100), 10* rd.nextDouble(), "Hust2019" + Math.round((1000*(1+rd.nextDouble(6))))));
            studentList.add(new Student("Hung" + rd.nextInt(100), 10* rd.nextDouble(), "Hust2019" + Math.round((1000*(1+rd.nextDouble(6))))));
        for(int i=0; i<5; i++){
            System.out.println(studentList.get(i).toString());
        }
        Collections.sort(studentList, Comparator.comparingDouble(Student::getAvgScore));
        System.out.println("Sau khi sap xep theo diem");
        for(int i=0; i<5; i++){
            System.out.println(studentList.get(i).toString());
        }
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Sau khi sap xep theo ten");
        for(int i=0; i<5; i++){
            System.out.println(studentList.get(i).toString());
        }

    }
}
