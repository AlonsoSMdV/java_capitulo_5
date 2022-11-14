import java.util.Scanner;
public class Ejercicio58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long numero = sc.nextLong();
        int suma = 0;
        int longitud = 0;
        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
            longitud++;
        }
        System.out.println("La media de sus dígitos es " + (double)suma / longitud);
        sc.close();
    }
}