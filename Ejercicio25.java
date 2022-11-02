import java.util.Scanner;
public class Ejercicio25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        int numero = sc.nextInt();
        int num = numero;
        int girado = 0;
        while(num > 0){
            girado = (girado * 10) + (num % 10);
            num /= 10;
        }
        System.out.println("Si ponemos del revés " + numero + " tenemos: " + girado);
        sc.close();
    }
}
