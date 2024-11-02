import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pregunta al usuario qué número desea calcular el factorial
        System.out.print("¿De qué número deseas calcular el factorial? ");
        int numero = scanner.nextInt();
        
        int factorial = 1;
        int i = 1; // Variable de control para el ciclo
        
        // Calcular el factorial usando un ciclo while
        while (i <= numero) {
            factorial *= i; // Multiplicamos factorial por i
            i++; // Incrementamos i en 1 en cada iteración
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);

        scanner.close();
    }
}
