import java.util.Scanner;
public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = sc.nextLong();
        System.out.print("Introduzca la posición dentro del número: ");
        long posicion = sc.nextLong();
        System.out.print("Introduzca el nuevo dígito: ");
        long digito = sc.nextLong();
        long n = numero;
        int longitud = 0;
        do {
        n /= 10;
        longitud++;
        } while (n > 0);
        long PI = numero / (long)(Math.pow(10, longitud - posicion + 1));
        PI = PI * 10 + digito;
        long PD = numero % (long)(Math.pow(10, longitud - posicion));
        n = PI * (long)(Math.pow(10, longitud - posicion)) + PD;
        System.out.print("El número resultante es " + n);
        sc.close();
    }
}
