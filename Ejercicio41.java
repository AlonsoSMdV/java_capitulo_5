import java.util.Scanner;
public class Ejercicio41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número(entero y positivo): ");
        long numero = sc.nextLong();
        int contP = 0;
        int contI = 0;
        while(numero>0){
            if((numero % 10) % 2 == 0){
                contP++;
            }else{
                contI++;
            }
            numero /= 10;
        }
        System.out.print("El "+numero+" tiene "+contP+" dígitos pares y "+contI+" dígitos impares");
        sc.close();

    }
}
