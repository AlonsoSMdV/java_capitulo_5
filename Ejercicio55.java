import java.util.Scanner;
public class Ejercicio55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long numero = sc.nextLong();
        long n = numero;
        int longitud = 0;
        while (n > 0) {
            n /= 10;
            longitud++;
        }
        int ultimo = (int) (numero % 10);
        long aux = numero / 10;
        long resultado = ultimo * (long) Math.pow(10, longitud - 1) + aux;
        System.out.println("El número resultado es " + resultado);
        sc.close();
        }
        
}
