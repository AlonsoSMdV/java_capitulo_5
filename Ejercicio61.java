import java.util.Scanner;
public class Ejercicio61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la V (un número mayor o igual a 3): ");
        int altura = sc.nextInt();
        int alt = 0;
        int i = 0;
        int espaciosInternos = alt * 2 - 1;
        int espaciosPorDelante = 0;
        if (alt < 3) {
            System.out.println("La altura debe ser mayor o igual a 3.");
        } else {
            while (alt < altura) {
            for (i = 1; i <= espaciosPorDelante; i++) {
                System.out.print(" ");
            }
                
            System.out.print("***");
            for (i = 1; i < espaciosInternos; i++) {
                System.out.print(" ");
            }
            System.out.println("***");
            alt++;
            espaciosPorDelante++;
            espaciosInternos -= 2;
            }
        } 
    }
}
