import java.util.Scanner;
public class Ejercicio64 {
    public static void main(String[] args) {
        int ancho = 6;
        int alto = 3;
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            for (int i = 0; i < ancho; i++) {
                System.out.print("*");
            }
                System.out.println();
            for (int i = 0; i < alto - 2; i++) {
                System.out.print("*");
            for (int j = 0; j < ancho - 2; j++) {
                System.out.print(" ");  
            }
                System.out.println("*");
            }
            for (int i = 0; i < ancho; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.println("1. El rectángulo se agranda");
            System.out.println("2. El rectángulo se achica");
            System.out.println("3. El rectángulo cambiará de orientación");
            System.out.println("4. Salir");
            System.out.print("Qué desea que pase con el rectángulo: ");
            opcion = sc.nextInt();
            switch(opcion) {
                case 1:
                    ancho++;
                    alto++;
                    break;
                case 2:
                    if ((ancho > 2) && (alto > 2)) {
                        ancho--;
                        alto--;
                    }
                    break;
                case 3:
                    int aux = ancho;
                    ancho = alto;
                    alto = aux;
                    break;
                default:
            }
                System.out.println();
        } while (opcion != 4);
        sc.close();
    }
}