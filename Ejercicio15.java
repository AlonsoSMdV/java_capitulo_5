import java.util.Scanner;
public class Ejercicio15{
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        System.out.print("Base: ");
        int base = sc.nextInt();
        System.out.print("Exponente final: ");
        int exponenteUltimo = sc.nextInt();
        int potencia;
        int exponente;
        for(int i = 1;i<=exponenteUltimo; i++){
            potencia=1;
            exponente=i;
            for(int j = 0;j<exponente;j++){
                potencia*=base;

            }
            System.out.println(base + "^" + i + " = " + potencia);
        }
        sc.close();
    }
}