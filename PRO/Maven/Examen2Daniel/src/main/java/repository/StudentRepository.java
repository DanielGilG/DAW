package repository;

import domain.entity.Student;
import exceptions.InvalidLevel;

import java.util.List;

public interface StudentRepository {
    public void save(Student student) throws InvalidLevel; //También vale como Crear Student
    public Student findbyId(int id);
    public void deleteById(int id);
    public List<Student> findAll();
}
