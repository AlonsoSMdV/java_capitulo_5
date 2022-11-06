import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long numero = sc.nextLong();
        long copia = numero;
        int longitud = 0;
        while (copia > 0) {
            copia /= 10;
            longitud++;
        }
        int primero = (int)(numero / Math.pow(10, longitud - 1));
        long aux = (long)(primero * Math.pow(10, longitud - 1));
        long resul = (numero - aux) * 10 + primero;
        System.out.println("El resultado es " + resul);
        sc.close();
    }
}
