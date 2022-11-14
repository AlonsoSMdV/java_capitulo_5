import java.util.Scanner;
public class Ejercicio62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long numero = sc.nextLong();
        long n = numero;
        int suerte = 0;
        int malaSuerte = 0;
        while (numero > 0) {
            int digito = (int)(numero % 10);
            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
                suerte++;
            } else {
                malaSuerte++;
            }
            numero /= 10;
            }
        if (suerte > malaSuerte) {
            System.out.println("El " + n + " es un número afortunado.");
        } else {
            System.out.println("El " + n + " no es un número afortunado.");
        }
        sc.close();
    }
}
