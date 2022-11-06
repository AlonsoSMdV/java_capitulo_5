import java.util.Scanner;
public class Ejercicio43 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
    long numero = sc.nextLong();
    System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
    long lugar = sc.nextLong();
    long n = numero;
    int lon = 0;
    do {
        n /= 10;
        lon++;
    } while (n > 0);
    long PI = numero / (long)(Math.pow(10, lon - lugar + 1));
    long PD = numero % (long)(Math.pow(10, lon - lugar + 1));
    System.out.print("Los números partidos son el " + PI+ " y el " + PD  );
    sc.close();
    }
}
