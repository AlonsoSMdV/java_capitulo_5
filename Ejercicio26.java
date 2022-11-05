import java.util.Scanner;
public class Ejercicio26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int num = sc.nextInt();
        System.out.print("Ahora un dígito: ");
        int digito = sc.nextInt();
        int n = 0;
        int lugar = 1;
        while(num>=1){
            lugar = lugar + 1;
            if(num%10==digito){
                n=n+1;
                System.out.print(lugar+" ");
            }
            n=n/10;
        }
        System.out.println("");
        System.out.print("El "+digito+" está "+n+" repetido");
        sc.close();

    }
}
