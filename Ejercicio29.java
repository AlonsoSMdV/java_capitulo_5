import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un nº: ");
        int numero = sc.nextInt();
        System.out.print("Ahora introduzca otro: ");
        int num = sc.nextInt();
        System.out.print("Los números menores a "+numero+" son: ");
        for(int i = numero-1; i >= 0;i--){
            if(i % num != 0){
            System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
