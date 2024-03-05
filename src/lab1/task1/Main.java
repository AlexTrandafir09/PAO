package lab1.task1;
import lab1.task2.Student;
import lab1.task2.Course;
import lab1.task2.StudentAllocator;
import lab1.task4.DummyCalculator;

public class Main {
    public static void main(String[] args){
        Student[] students= StudentAllocator.createStudents();
        Course course= new Course("Mate",5,students);

        Student student_=course.chooseStudentRandomly();
        System.out.println(student_);

        System.out.println(course.isStudentPassing(student_));

        System.out.println(course.isStudentPassing(students.length-1));

        Student[] temp=course.showAllPassingStudents();
        for (Student student : temp)
            if(student!=null)
                System.out.println(student.toString());

        DummyCalculator dummyCalculator= new DummyCalculator();
        dummyCalculator.calculator();
    }
}
