import java.util.Scanner;
public class Ejercicio38 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Intriduzca la altura del reloj: ");
        int altura = sc.nextInt();
        int alt = 1;
        int asterisco = altura;
        int espaciosD = 0;
        if((altura < 3)||(altura % 2 == 0)){
            System.out.print("Los datos introducidos no son correctos");
        }else{
            while(alt < altura / 2 + 1){
                for(int i = 1;i<=espaciosD;i++){
                    System.out.print(" ");
                }
                for(int i = 0;i<asterisco;i++){
                    System.out.print("*");
                }
                System.out.println();
                alt++;
                espaciosD++;
                asterisco -= 2;
            }
            espaciosD = altura / 2;
            alt = 1;
            while(alt <= altura / 2 + 1){
                for(int i = 1;i<=espaciosD;i++){
                    System.out.print(" ");
                }
                for(int i = 0;i<asterisco;i++){
                    System.out.print("*");
                }
                
                System.out.println();
                alt++;
                espaciosD--;
                asterisco += 2;
            }
        }
        sc.close();
    }
}
