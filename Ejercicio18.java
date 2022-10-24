import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int num2;
        do {
        System.out.print("Introduzca un número: ");
         num = sc.nextInt();
        System.out.print("Introduzca otro número: ");
         num2 = sc.nextInt();
        
            if(num == num2) {
                System.out.println("Los números introducidos no son correctos");
            }
        } while (num == num2);
        if(num > num2){
            int aux = num;
            num = num2;
            num2 = aux;
        }
        for (int i = num; i<=num2; i+=7){
            System.out.print(i +", ");
        }
        System.out.println();
        sc.close();
    }
}
