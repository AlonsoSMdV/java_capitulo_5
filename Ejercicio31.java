import java.util.Scanner;
public class Ejercicio31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la L: ");
        int altura = sc.nextInt();
        int longitud = (altura+1)/2;
        for(int i = 0; i<altura-1;i++){
            System.out.println("*");
            
        }
        for(int j = 0;j<=longitud-1;j++){
            System.out.print("* ");
        }
        sc.close();
    }
}