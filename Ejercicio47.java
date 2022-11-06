import java.util.Scanner;
public class Ejercicio47 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura (ha de ser impar y mayor o igual a 5): ");
        int altura = sc.nextInt();
        int alt = (altura - 3) / 2;
        if ((altura % 2 != 0) && (altura >= 5)) {
            System.out.println("MMMMMM");
            for (int i = 0; i < alt; i++) {
            System.out.println("M    M");
            }
            System.out.println("MMMMMM");
            for (int i = 0; i < alt; i++) {
            System.out.println("M    M");
            }
            System.out.println("MMMMMM");
        } else {
            System.out.println("La altura introducida no es correcta.");
        }
        sc.close();
    }
}
