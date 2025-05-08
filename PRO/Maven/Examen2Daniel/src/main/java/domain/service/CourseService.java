package domain.service;

import domain.entity.Course;
import domain.entity.Student;

import java.util.List;

public interface CourseService {
    public void save(Course course);
    public Course findbyId(int id);
    public void deleteById(int id);
    public List<Course> findAll();
}
