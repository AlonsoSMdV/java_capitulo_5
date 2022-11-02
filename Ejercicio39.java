import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numInt;
        System.out.print("Introduzca un número entero positivo: ");
        numInt = sc.nextInt();
        for (int n = 1; n <= numInt; n++) {
        int factorial = n;
        
        for (int i = 1; i < n; i++) {
        factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
        }
        sc.close();
        }
}
