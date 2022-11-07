import java.util.Scanner;
public class Ejercicio36 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Intriduzca un nº: ");
        long numero = sc.nextInt();
        long girado = 0;
        while(numero>0){
            girado = (girado * 10) + (numero % 10);
            numero /= 10;
        }
        if(girado == numero){
            System.out.print("No es capicuo");

        }else{
            System.out.print("Es capicuo");

        }
        sc.close();
    }
}
