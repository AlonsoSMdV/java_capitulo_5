import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca el número deseado");
    int valor = sc.nextInt();
    for(int cont=0;cont<=4;cont++){
        System.out.println(valor+cont+","+Math.pow(valor+cont, 2)+","+Math.pow(valor+cont, 3));
    }
    sc.close();
    }
}
