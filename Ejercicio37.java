import java.util.Scanner;
public class Ejercicio37 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        do {
        System.out.print("Introduce un número entero positivo: ");
        num = Integer.parseInt(System.console().readLine());
        } while (num < 1);
        System.out.print(num + " = ");
        int aux = (int)num;
        int digito = 0;
        int girado = 0;
        while (aux > 0){
            girado = ((girado*10) + (aux % 10));
            aux /=10;
            digito++;
        }
        int cifra = 0;
        
        for (int i = 0; i < digito; i++){
            cifra = girado%10;
            girado /= 10;
            for (int j = 0; j < cifra; j++){
                System.out.print("|");
            }
            if (i < digito-1){
                System.out.print("-");
            }
        }
        sc.close();
        }
}
