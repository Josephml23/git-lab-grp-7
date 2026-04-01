package pe.edu.tecsup.lab;

import java.util.ArrayList;
import java.util.List;

public class StudentController {

    // Método principal para ejecutar y probar la clase
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        List<String> listaAlumnos = controller.getStudents();

        System.out.println("\n--- REPORTE DEL GRUPO 7 ---");
        for (String alumno : listaAlumnos) {
            System.out.println("Estudiante: " + alumno);
        }
    }

    // Tu lógica original
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