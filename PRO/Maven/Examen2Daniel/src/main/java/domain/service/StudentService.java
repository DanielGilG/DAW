package domain.service;

import domain.entity.Student;

import java.util.List;

public interface StudentService {
    public void save(Student student);
    public Student findbyId(int id);
    public void deleteById(int id);
    public List<Student> findAll();
}
