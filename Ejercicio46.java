import java.util.Scanner;
public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
        int anchura = sc.nextInt();
        System.out.print("Ahora introduzca la altura (como mínimo 2): ");
        int altura = sc.nextInt();
        if ((anchura < 2) || (altura < 2)) {
        System.out.println("Los datos introducidos no son correctos");
        } else {
        
        for (int i = 1; i <= anchura; i++) {
        System.out.print("*");
        }
        for (int i = 2; i < altura; i ++) {
        System.out.print("\n*");
        for (int espacios = 2; espacios < anchura; espacios++) {
        System.out.print(" ");
        }
        System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= anchura; i++) {
        System.out.print("*");
        }
        } 
        sc.close();
    }
}
