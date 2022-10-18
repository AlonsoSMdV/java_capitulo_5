import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float valor = 0;
        float suma = 0;
        int cont = 0;
        do {
            System.out.print("Introduzca el número deseado: ");
            valor = sc.nextFloat();
            if(valor>=0){
                cont++;
                suma+=valor;
            }
        }while(valor>=0);
        System.out.printf( "la media es %.1f", suma/cont);
        sc.close();
    }

}
