package pe.edu.tecsup.lab;

import java.util.ArrayList;
import java.util.List;

public class StudentController {

    public static void main(String[] args) {
        StudentController controller = new StudentController();
        List<String> listaAlumnos = controller.getStudents();

        // Formato de reporte mejorado
        System.out.println("\n==================================");
        System.out.println("   REPORTE OFICIAL - GRUPO 7");
        System.out.println("==================================");
        
        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println((i + 1) + ". " + listaAlumnos.get(i));
        }
        
        System.out.println("----------------------------------");
        System.out.println("Total de estudiantes registrados: " + listaAlumnos.size());
        System.out.println("==================================\n");
    }

    public List<String> getStudents() {
        List<String> students = new ArrayList<>();
        
        // Listado actualizado de los integrantes
        students.add("Josep - Responsable");
        students.add("Alumno 2 - Desarrollador");
        students.add("Alumno 3 - Analista");
        
        // Mensaje de estado para trazabilidad
        System.out.println("[INFO] Procesando base de datos de estudiantes...");
        
        return students;
    }
}