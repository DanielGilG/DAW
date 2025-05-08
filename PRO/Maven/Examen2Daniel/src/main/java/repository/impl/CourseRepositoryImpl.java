package repository.impl;

import domain.entity.Course;
import domain.entity.CourseLevel;
import domain.entity.Student;
import exceptions.InvalidCourseId;
import exceptions.InvalidStudentId;
import repository.CourseRepository;

import java.util.ArrayList;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepository {
    List<Student> studentList = new ArrayList<>();

    Course c1 = new Course(1, "Maths", CourseLevel.BEGGINER, studentList);
    List<Course> courseList = List.of();

    @Override
    public void save(Course course) {
        //Con id único
        try {
            if (courseList.stream().anyMatch(c -> c.getId() == course.getId())) {
                throw new InvalidCourseId("");
            }else {
                courseList.add(course);
            }
        } catch (InvalidCourseId e) {
            throw new InvalidCourseId("Exception::saveCourse with id: " + course.getId());
        }
    }

    @Override
    public Course findbyId(int id) {
        return (Course) courseList.stream().filter(c -> c.getId() == id);
    }

    @Override
    public void deleteById(int id) {
        courseList.remove(courseList.stream().filter(c -> c.getId() == id));
    }

    @Override
    public List<Course> findAll() {
        return courseList;
    }

    @Override
    public List<Course> findByLevel(CourseLevel level) {
        return courseList.stream().filter(c -> c.getLevel() == level).toList();
    }

    @Override
    public void inscribeStudent(Course course, Student student) {
        course.getStudentList().add(student);
    }
}
