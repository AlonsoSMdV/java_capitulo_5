import java.util.Scanner;
public class Ejercicio51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero (mayor que cero): ");
        int numero = sc.nextInt();
        int n = numero;
        int volteado = 0;
        boolean Comido = false;

        while (n > 0) {
            if ((n % 10 != 0) && (n % 10 != 8)) {
                volteado = (volteado * 10) + (n % 10);
            } else {
                Comido = true;
            }
                n /= 10;
            }

        n = volteado;
        volteado = 0;
        while (n > 0) {
            volteado = (volteado * 10) + (n % 10);
            n /= 10;
        }
        if (Comido) {
            System.out.print("Después de haber sido comido por el gusano numérico se queda en " + volteado);
        } else {
            System.out.println("El gusano numérico no se ha comido ningún dígito.");
        }
        sc.close();
    }
}