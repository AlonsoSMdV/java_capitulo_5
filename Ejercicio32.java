import java.util.Scanner;
public class Ejercicio32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo: ");
        long numero = sc.nextLong();
        int longitud = 0;
        long volteado=0;
        if (numero == 0){
            longitud = 1;
        }
        while(numero>0){
            volteado = (volteado*10) + (numero%10);
            numero /= 10;
            longitud++;
        }
        System.out.print("Dígitos pares en el nº: ");
        int digito;
        int SumP = 0;

        for(int i = 0; i<longitud;i++){

            digito = (int)(volteado % 10);

            if((digito % 2)==0){
                System.out.print(digito+" ");
                SumP += digito;
            }

            volteado /= 10;

        }
        System.out.println("\nLa suma de los números pares es: "+SumP);
        sc.close();
    }
}