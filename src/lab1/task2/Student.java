package lab1.task2;
import java.lang.String;
public class Student {
    private String name;
    private double grade;



    public Student(String name_, double grade_) {
        this.name=name_;
        this.grade=grade_;
    }

    public String getName() {
        return name;
    }


    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Nume: "+ name + ", grade: " + grade;
    }
}
