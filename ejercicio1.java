import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de los números a y b
        System.out.print("Introduce el primer número (a): ");
        int a = scanner.nextInt();

        System.out.print("Introduce el segundo número (b): ");
        int b = scanner.nextInt();

        // Intercambiar si 'a' es mayor que 'b'
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Contador de números primos
        int contadorPrimos = 0;

        System.out.println("Números primos entre " + a + " y " + b + ":");

        // Recorrer el rango de a a b y mostrar los números primos
        for (int i = a; i <= b; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
                contadorPrimos++;
            }
        }

        // Mostrar el total de números primos
        System.out.println("\nTotal de números primos: " + contadorPrimos);
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

