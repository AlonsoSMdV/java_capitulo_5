import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura: ");
        int altura = sc.nextInt();
        System.out.print("Introduzca el valor: ");
        String r = System.console().readLine();
        int planta = 1;
        int longitud = 1;
        int espacios = altura - 1;
        while (planta <= altura) {
            for (int i = 1; i <= espacios; i++) {
            System.out.print(" ");
            }
            for (int i = 1; i <= longitud; i++) {
                System.out.print(r);
            }
            System.out.println();
            planta++;
            espacios--;
            longitud += 2;
    }
    sc.close();
}
}