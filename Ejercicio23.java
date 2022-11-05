import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca números y el programa terminará cuando la suma de estos sea mayor que 10000.");
        int num;
        int suma = 0;
        int elementos = 0;
        do {
        num = sc.nextInt();
        suma += num;
        elementos++;
        } while (suma <= 10000);
        System.out.println("-Ha introducido " + elementos + " números.");
        System.out.println("-La suma total es " + suma + ".");
        System.out.println("-La media es " + suma / elementos + ".");
        sc.close();
        }
}
