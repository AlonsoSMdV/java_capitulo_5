import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca cuantos números quiere que aparezcan: ");
        int n = sc.nextInt();
        int valor = 0;
        int valor2 = 1;
        for(int cont=1; cont<=n;cont++){
            int temp = valor;
			valor = valor2;
			valor2 = temp + valor2;
			System.out.print(valor2+"; ");
        }





    }
}
