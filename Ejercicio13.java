import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 10 números enteros: ");
        int positivos = 0;
        int negativos = 0;
        for(int i = 0; i<10;i++ ){
            if(sc.nextInt()<0){
                negativos++;
            }else{
                positivos++;
            }
        }
        System.out.println("Ha introducido "+positivos+" positivos y "+negativos+"negativos");
        sc.close();
    }
}
