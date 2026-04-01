package pe.edu.tecsup.lab;

public class StudentReport {
    private String studentName;
    private double[] grades;

    public StudentReport(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    // --- AGREGAMOS ESTE MÉTODO ---
    public double calculateAverage() {
        if (grades.length == 0) return 0.0;
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public void printReport() {
        
        String formattedName = studentName.toUpperCase();
        double average = calculateAverage();
        
        System.out.println("REPORTE OFICIAL");
        System.out.println("Estudiante: " + formattedName);
        
        if (average >= 11) { // Suponiendo escala vigesimal
            System.out.println("Estado: APROBADO con " + average);
        } else {
            System.out.println("Estado: DESAPROBADO con " + average);
        }
    }
}