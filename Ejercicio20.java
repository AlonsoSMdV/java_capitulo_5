import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura: ");
        int altura = sc.nextInt();
        System.out.print("Introduzca el valor: ");
        String r = System.console().readLine();
        int alt = 1;
        int i = 0;
        int espaciosFront = altura - 1;
        int espaciosint = 0;
        while (alt < altura) {
            for ( i = 1; i <= espaciosFront; i++) {
            System.out.print(" ");
            }

            System.out.print(r);
            for ( i = 1; i < espaciosint; i++) {
                System.out.print(" ");
            }
            if(alt>1){
                System.out.print(r);
            }
            System.out.println();
            alt++;
            espaciosFront--;
            espaciosint += 2;
        }
        for(i = 1; i<alt*2;i++){
            System.out.print(r);
        }
    sc.close();
}
}
