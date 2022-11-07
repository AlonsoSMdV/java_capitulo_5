import java.util.Scanner;
public class Ejercicio69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide maya: ");
        int altura = sc.nextInt();
        int planta = 1;
        int longitud = 1;
        int espacios = altura - 1;
        while (planta <= altura) {
            for (int i = 1; i <= espacios; i++) {
                System.out.print(' ');
            }
            for (int i = 0; i <= longitud / 2; i++) {
                System.out.print('*');
            }
            System.out.print(planta % 2 == 1 ? "****" : "    ");
            for (int i = 0; i <= longitud / 2; i++) {
                System.out.print('*');
            }
            System.out.println();
            planta++;
            espacios--;
            longitud += 2;
        }
        sc.close();
    }
}