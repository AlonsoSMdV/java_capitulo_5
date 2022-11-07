import java.util.Scanner;
public class Ejercicio68 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        long numero = sc.nextLong();
        long n = numero;
        long resultado = 0;
        int cont = 0;
        while (numero > 0) {
            int digito = (int) (numero % 10);
            int NDigito = digito % 2 == 1 ? --digito : ++digito;
            resultado = (long) (NDigito * Math.pow(10, cont) + resultado);
            numero /= 10;
            cont++;
        }
        System.out.println("Dislocando el " + n + " sale el " + resultado);
        sc.close();
    }
}
