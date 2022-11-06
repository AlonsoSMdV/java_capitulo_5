import java.util.Scanner;
public class Ejercicio48 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long numero = sc.nextLong();
        long n;
        boolean esta = true;
        
        System.out.print("Dígitos que están en dicho número: ");
        for(int i = 0; i < 10; i++){
            esta = false;
            n = numero;
            while(n > 0){
                if(n % 10 == i){
                esta = true;
                }
                n /= 10;
            }           
            if(esta){
                System.out.print(i+ " ");
            }
        }
        System.out.print("\nDígitos que no están en dicho número: ");
        for(int i = 0; i < 10; i++){
            esta = false;
            n = numero;
            while(n > 0){
                if(n % 10 == i){
                esta = true;
                }
                n /= 10;
            }           
            if(!esta){
                System.out.print(i+ " ");
            }
        }
        sc.close();
    }
}
