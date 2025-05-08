package repository;

import domain.entity.Course;
import domain.entity.CourseLevel;
import domain.entity.Student;

import java.util.List;

public interface CourseRepository {
    public void save(Course course); //vale como createCourse
    public Course findbyId(int id);
    public void deleteById(int id);
    public List<Course> findAll();

    //Personalizadas
    public List<Course> findByLevel(CourseLevel level);
    public void inscribeStudent(Course course, Student student);
}
