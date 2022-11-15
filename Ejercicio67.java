import java.util.Scanner;
public class Ejercicio67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de escalones: ");
        int escalones = sc.nextInt();
        System.out.print("Introduzca la altura de cada escalón: ");
        int altoEscalon = sc.nextInt();
        for (int i = 1; i <= escalones; i++) {
            for (int j = 1; j <= altoEscalon; j++) {
                for (int k = 0; k < i; k++) {
                    System.out.print("****");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}