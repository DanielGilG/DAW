package domain.entity;

import java.util.List;

public class Course {
    private int id;
    private String title;
    private CourseLevel level;
    private List<Student> studentList;

    public Course(int id, String title, List<Student> studentList) {
        this.id = id;
        this.title = title;
        this.studentList = studentList;
        level = CourseLevel.BEGGINER; //Default para cuando no se indica
    }

    public Course(int id, String title, CourseLevel level, List<Student> studentList) {
        this.id = id;
        this.title = title;
        this.level = level;
        this.studentList = studentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CourseLevel getLevel() {
        return level;
    }

    public void setLevel(CourseLevel level) {
        this.level = level;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
