package container;

import domain.service.CourseService;
import domain.service.StudentService;
import repository.CourseRepository;
import repository.StudentRepository;

public class CourseIoc {
    CourseService courseService;
    CourseRepository courseRepository;

    public CourseService returnService(){
        if (courseService == null){
            return courseService;
        }else {
            return null;
        }
    }

    public CourseRepository returnRepository() {
        if (courseRepository == null) {
            return courseRepository;
        } else {
            return null;
        }
    }
}
