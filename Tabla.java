import java.util.Scanner;

public class Tabla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pregunta al usuario qué tabla de multiplicar desea imprimir
        System.out.print("¿Qué tabla de multiplicar deseas imprimir? ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");

        // Imprime la tabla de multiplicar del número especificado
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
