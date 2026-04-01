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
        System.out.println("Estudiante: " + studentName);
        System.out.println("Promedio Final: " + calculateAverage());
    }
}