import java.util.Scanner;
public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = sc.nextLong();
        System.out.print("Introduzca la posición donde quiere insertar: ");
        long posicion = sc.nextLong();
        System.out.print("Introduzca el dígito que quiere insertar: ");
        long digito =sc.nextLong();
        long n = numero;
        int longitud = 0;
        do {
            n /= 10;
            longitud++;
        } while (n > 0);
        long PI = numero / (long)(Math.pow(10, longitud - posicion + 1));
        PI = PI * 10 + digito;
        long PD = numero % (long)(Math.pow(10, longitud - posicion + 1));
        n = PI * (long)(Math.pow(10, longitud - posicion + 1)) + PD;
        System.out.print("El resultado es " + n);
        sc.close();
    }
}
