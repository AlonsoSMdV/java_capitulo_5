import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
    
        do {
            System.out.print("Introduzca un número entero positivo: ");
            num = sc.nextInt();
            
            if(num < 0) {
                System.out.print("El número introducido no es correcto");
            }
        } while (num < 0);
        int suma =0;
        if(num<0){
            System.out.print("Este número no es correcto ");
        }
        for(int i = num;i<num+100;i++){
            suma +=i;
        }
        System.out.print("las suma de los 100 siguentes números es: "+suma);
        sc.close();
    }
}
