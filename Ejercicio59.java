import java.util.Scanner;
public class Ejercicio59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura del árbol: ");
        int altura = sc.nextInt();
        int espaciosD = altura - 3;
        int espaciosI = 0;
        for (int i = 1; i <= espaciosD; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        int alt = 2;
        while (alt < altura- 1) {
            for (int i = 1; i <= espaciosD; i++) {
                System.out.print(" ");
            }
            System.out.print("#");
            for (int i = 1; i < espaciosI; i++) {
                System.out.print(" ");
            }
            if (alt > 2) {
                System.out.print("#");
            }
            System.out.println();
            alt++;
            espaciosD--;
            espaciosI += 2;
        } 
        for (int i = 1; i < alt * 2 - 2; i++) {
            System.out.print("#");
        }
        System.out.println();
        
        espaciosD = altura - 3;
        for (int i = 1; i <= espaciosD; i++) {
            System.out.print(" ");
        }
        System.out.println("#");
        sc.close();
    }
}