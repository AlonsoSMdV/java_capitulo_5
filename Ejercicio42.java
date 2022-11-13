import java.util.Scanner;
public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int numero = Integer.parseInt(System.console().readLine());
        boolean esPrimo;
        for (int n = numero; n < numero + 5; n++) {
            esPrimo = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                System.out.println(n + " es primo");
            } else {
                System.out.println(n + " no es primo");
            }
        }
        System.out.println();
        sc.close();
    }
}
