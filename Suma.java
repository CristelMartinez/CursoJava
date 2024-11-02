import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese dos números
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        
        // Sumar los números
        int suma = numero1 + numero2;
        
        // Mostrar el resultado
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        
        scanner.close();
    }
}

    
