import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la calificación del alumno
        System.out.print("Ingresa tu calificación: ");
        int calificacion = scanner.nextInt();

        // Condicionales para determinar el mensaje según la calificación
        if (calificacion < 70) {
            System.out.println("Tu calificación es reprobatoria.");
        } else if (calificacion >= 71 && calificacion <= 80) {
            System.out.println("Puedes mejorar.");
        } else if (calificacion >= 81 && calificacion <= 90) {
            System.out.println("Eres bueno.");
        } else if (calificacion >= 91 && calificacion <= 100) {
            System.out.println("Eres un excelente alumno.");
        } else {
            System.out.println("Calificación inválida. Por favor, ingresa un valor entre 0 y 100.");
        }

        scanner.close();
    }
}
