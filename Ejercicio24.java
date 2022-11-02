import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide: ");
        int altura = sc.nextInt();
        int alt = 1;
        int i = 0;
        int espacios = altura - 1;
        while (alt <= altura) {
            for (i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            for (i = 1; i < alt; i++) {
                System.out.print(i);
            }
            for (i = alt; i > 0; i--) {
                System.out.print(i);
            }
            System.out.println();

            alt++;
            espacios--;
        } 
        }
}
