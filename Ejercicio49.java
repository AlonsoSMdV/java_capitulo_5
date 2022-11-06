import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vaya introduciendo números enteros positivos. ");
        System.out.println("Ahora introduzca un número primo:");
        int numero;
        int suma = 0;
        int cont = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        boolean Primo;
        do {
            numero = sc.nextInt();
            Primo = true;
            for (int i = 2; i < numero; i++) {
                if ((numero % i) == 0) {
                    Primo = false;
                }
            }
            if (!Primo) {
                suma += numero;
                cont++;
                max = numero > max ? numero : max;
                min = numero < min ? numero : min;
            }
        } while (!Primo);
        System.out.println("Se ha/han introducido " + cont + " números no primos.");
        System.out.println("nº máximo: " + max);
        System.out.println("nº mínimo: " + min);
        System.out.println("Media: " + (double)suma / cont);
        sc.close();
    }
}
