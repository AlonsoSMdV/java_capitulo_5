import java.util.Scanner;

public class Ejercicio39forma2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo: ");
        int numInt = sc.nextInt();
        long factorial = 1;
        System.out.printf("%d!",numInt);
        if(numInt <0){
            System.out.print("No existe");
        }
        else if (numInt==0){
            System.out.print("1");
        }else{
            for(int i = numInt;i>1;i--){
                factorial *= i;
                System.out.printf("%dx",i);
            }
            System.out.printf("1=%d",factorial);
        }
        sc.close();
        }

{
    
}
}