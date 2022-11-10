import java.util.Scanner;
public class Ejercicio35 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Intriduzca la altura de la X: ");
        int alturaX = sc.nextInt();
        int alt = 1;
        int espacios = alturaX - 1;
        int espaciosD = 0;
        if((alturaX < 3)||(alturaX % 2 == 0)){
            System.out.print("Los datos introducidos no son correctos");
        }else{
            while(alt < alturaX / 2 + 1){
                for(int i = 1;i<=espaciosD;i++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int i = 1;i<espacios;i++){
                    System.out.print(" ");
                }
                System.out.print("*");

                System.out.println();
                alt++;
                espaciosD++;
                espacios -= 2;
            }
            espacios = 0;
            espaciosD = alturaX / 2;
            alt = 1;
            while(alt <= alturaX / 2 + 1){
                for(int i = 1;i<=espaciosD;i++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int i = 1;i<espacios;i++){
                    System.out.print(" ");
                }
                if(alt > 1){
                    System.out.print("*");
                }
                
                System.out.println();
                alt++;
                espaciosD--;
                espacios += 2;
            }
        }
        sc.close();
    }
}
