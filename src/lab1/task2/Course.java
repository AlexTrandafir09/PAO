package lab1.task2;

import java.util.Random;
import lab1.task2.Student;
public class Course {
    String name;
    double minimumGrade;
    Student[] students;

    public Course(String name,double minimumGrade,Student[] students) {
        this.name=name;
        this.minimumGrade=minimumGrade;
        this.students=students;
    }

    public Student chooseStudentRandomly(){
        Random rand=new Random();

        int randomIndex=rand.nextInt(students.length);
        return students[randomIndex];
    }
    public Student[] showAllPassingStudents(){
        Student[] temp=new Student[students.length];
        int c=0;
        for(int i=0;i<students.length;i++){
            if(students[i].getGrade()>=minimumGrade) {
                temp[c] = students[i];
                c++;
            }
        }
        return temp;
    }

    public boolean isStudentPassing(Student student_) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(student_.getName())) {
                if (students[i].getGrade() > minimumGrade)
                    return true;
                else
                    return false;
            }
        }
        return false;
    }

    public boolean isStudentPassing(int index){
        if(students[index].getGrade()>minimumGrade)
            return true;
        return false;
    }
    void printStudents(Student[] students_){
        for(int i=0;i<students_.length;i++)
            System.out.println(students_[i].toString());
    }
}
