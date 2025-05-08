package container;

import domain.service.StudentService;
import repository.StudentRepository;

public class StudentIoc {
    StudentService studentService;
    StudentRepository studentRepository;

    public StudentService returnService(){
         if (studentService == null){
             return studentService;
         }else {
             return null;
         }
    }

    public StudentRepository returnRepository() {
        if (studentService == null) {
            return studentRepository;
        } else {
            return null;
        }
    }
}
