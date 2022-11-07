import java.util.Scanner;
public class Ejercicio33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la U: ");
        int altura = sc.nextInt();
        for(int i = 1; i<altura;i++){
            System.out.print("* ");
            for (int k = 2; k < altura; k++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        for(int i = 2;i<altura;i++){
            System.out.print(" * ");
        }
        sc.close();
        }
    }
