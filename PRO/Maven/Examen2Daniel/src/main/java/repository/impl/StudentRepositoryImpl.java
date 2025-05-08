package repository.impl;

import domain.entity.Student;
import exceptions.InvalidLevel;
import exceptions.InvalidStudentId;
import repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    List<Student> studentList = new ArrayList<>();

    @Override
    public void save(Student student) throws InvalidStudentId {
        //Con id único
        try {
            if (studentList.stream().anyMatch(s -> s.getId() == student.getId())) {
                throw new InvalidStudentId("");
            } else {
                studentList.add(student);
            }
        } catch (InvalidStudentId e) {
            throw new InvalidLevel("Exception::saveStudent with id: " + student.getId());
        }
    }

    @Override
    public Student findbyId(int id) {
        return (Student) studentList.stream().filter(s -> s.getId() == id);
    }

    @Override
    public void deleteById(int id) {
        studentList.remove(studentList.stream().filter(s -> s.getId() == id));
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }
}
