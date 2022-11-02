import java.util.Scanner;
public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        long numInt1 = sc.nextLong();
        System.out.print("Introduzca otro número: ");
        long numInt2 = sc.nextLong();
        long num = numInt1;
        long girado1 = 0;
        int longitud = 0;
        if (num == 0) {
        longitud = 1;
        }
        
        
        while (num > 0) {
        girado1 = (girado1 * 10) + (num % 10);
        num /= 10;
        longitud++;
        } 
        num = numInt2;
        long girado2 = 0;
        while (num > 0) {
        girado2 = (girado2 * 10) + (num % 10);
        num /= 10;
        }
        long resultadoPares = 0;
        long resultadoImpares = 0;
        int digito;
        for (int i = 0; i < longitud; i++) {
        digito = (int)(girado1 % 10);
        if ((digito % 2) == 0) {
        resultadoPares = resultadoPares * 10 + digito;
        } else {
        resultadoImpares = resultadoImpares * 10 + digito;
        }
        digito = (int)(girado2 % 10);
        if ((digito % 2) == 0) {
        resultadoPares = resultadoPares * 10 + digito;
        } else {
        resultadoImpares = resultadoImpares * 10 + digito;
        }
        girado1 /= 10;
        girado2 /= 10;
    }
        System.out.println("El número formado por los dígitos pares es: " + resultadoPares);
        System.out.println("El número formado por los dígitos impares es: " + resultadoImpares);
        sc.close();
        }
}
