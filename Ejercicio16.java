import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int num = sc.nextInt();
        boolean esPrimo = true; 
        for(int i=2;i<num;i++){
            if((num%i)==0){
                esPrimo = false;
            }
        }
        if (esPrimo){
            System.out.print("El número es primo");
        }else{
            System.out.print("El número no es primo");
        }
        sc.close();
    }
}
