package controller;

import container.StudentIoc;
import domain.entity.Student;
import repository.StudentRepository;
import repository.impl.StudentRepositoryImpl;

import java.util.Scanner;

public class StudentController {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepositoryImpl();
        //StudentIoc studentIoc = new StudentIoc();

        Student s1 = new Student(1, "Hans");
        Student s2 = new Student(2, "Albert");

        studentRepository.save(s1);
        studentRepository.save(s2);
        studentRepository.deleteById(1); //No funciona
        System.out.println(studentRepository.findbyId(2)); //Salta Error
        //Errores son seguramente de la programación funcional

        System.out.println(studentRepository.findAll());
    }




    /* --------------A MEDIO HACER--------------

    StudentRepository studentRepository;

    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int option;

        System.out.println("----STUDENT MENU----");
        System.out.println("1. Create Student");
        System.out.println("2. List all Students");
        System.out.println("3. Delete Student");
        option = lec.nextInt();

        switch (option){
            case 1:
        }
    }
    void createStudent(){
        Scanner lec = new Scanner(System.in);
        String name;

        System.out.println("Set the Student's name: ");
        name = lec.next();


    }
     */
}
