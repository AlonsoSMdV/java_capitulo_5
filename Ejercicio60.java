import java.util.Scanner;
public class Ejercicio60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de los calcetines: ");
        int altura = sc.nextInt();
        for (int i = 0; i < altura - 2; i++) {
            System.out.println("***     ***");
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("******  ******");            
        }
        sc.close();
        }
}
