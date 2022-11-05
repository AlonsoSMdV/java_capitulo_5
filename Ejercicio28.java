import java.util.Scanner;
public class Ejercicio28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();
        int factorial=1;
        for(int i =1; i<=n;i++){
            factorial *= i;
        }
        System.out.println(n+"! ="+factorial);
        sc.close();
    }
}
