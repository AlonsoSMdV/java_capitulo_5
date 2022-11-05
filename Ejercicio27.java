import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int numero = sc.nextInt();
        int n = 0;
        System.out.printf("Los múltiplos de 3 hasta %d son: ",numero);
        for(int i = 0;i<=numero; i+=3){
            n = n + i;
            System.out.printf("%d ",i);

        }
        System.out.println("");
        System.out.printf("La suma de estos es: %d",n);
        sc.close();
    }
}
