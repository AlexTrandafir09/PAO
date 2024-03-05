package lab1.task2;

import java.util.Scanner;

public class StudentAllocator {
    public static Student[] createStudents(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of students: ");
        int nr_studenti= scanner.nextInt();
        scanner.nextLine();
        Student[] studenti= new Student[nr_studenti];
        for(int i=0;i<nr_studenti;i++){
            System.out.print("Enter a string: ");
            String name = scanner.nextLine();
            System.out.print("Enter a grade: ");
            double grade = scanner.nextDouble();
            scanner.nextLine();
            Student student_=new Student(name,grade);
            studenti[i]=student_;
        }
        return studenti;
    }

}
