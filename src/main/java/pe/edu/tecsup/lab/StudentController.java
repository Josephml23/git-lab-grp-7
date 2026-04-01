package pe.edu.tecsup.lab;

import java.util.ArrayList;
import java.util.List;

public class StudentController {

    public List<String> getStudents() {
        List<String> students = new ArrayList<>();
        // Lógica agregada: Listado inicial de alumnos
        students.add("Josep - Responsable");
        students.add("Alumno 2");
        students.add("Alumno 3");
        
        System.out.println("Listando alumnos del grupo 7...");
        return students;
    }
}