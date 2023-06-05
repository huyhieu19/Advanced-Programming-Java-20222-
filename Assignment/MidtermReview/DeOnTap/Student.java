package MidtermReview.DeOnTap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {
    private String name;
    private double avgScore;
    private String studentId;

    public Student(){}
    public Student(String name, double avgScore, String studentId){
        this.studentId = studentId;
        this.name = name;
        this.avgScore = avgScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    @Override
    public String toString() {
        return "Student@id=" + studentId + ",name=" + name
                + ",avgScore=" + avgScore;
    }
}


