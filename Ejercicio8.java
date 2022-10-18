import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número deseado: ");
        int num = sc.nextInt();
        for(int mul = 0; mul <= 10; mul++){
            System.out.println(num+" * "+mul+" = "+ num*mul);
        }
        
    }
}
