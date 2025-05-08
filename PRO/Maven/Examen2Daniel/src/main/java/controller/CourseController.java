package controller;

import domain.entity.Course;
import domain.entity.CourseLevel;
import repository.CourseRepository;
import repository.impl.CourseRepositoryImpl;

public class CourseController {
    public static void main(String[] args) {
        CourseRepository courseRepository = new CourseRepositoryImpl();

        /*
        * DILEMA:
        * Se necesita de una lista de estudiantes para crear el objeto.
        * Crear una lista aquí, no lo estoy guardando en memoria.
        * Si hago List.of salta error de ObjectInmutable (no puedo hacer list.add)
        * CourseController se queda sin hacer.
        * */

        //Course c1 = new Course(1, "Math", CourseLevel.BEGGINER, *Lista*);
    }
}
