import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args){
        System.out.print("Introduzca el número deseado: ");
        Scanner sc = new Scanner(System.in);
        long NL = sc.nextLong();
        long num = NL;
        int cont = 0;
        do {
            cont++;
            num/=10;
        }while(num!=0);
        System.out.printf( NL+" tiene "+cont+" dígito/s");
        sc.close();
    }

}