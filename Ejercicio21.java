import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un nº: ");
        int nIntroducido;
        int Elemento = 0;
        int ElementoI = 0;
        int impar = 0;
        int par = 0;
        do{
            nIntroducido = sc.nextInt();
            if(nIntroducido>0){
                Elemento++;
            }
            if ( nIntroducido%2 == 1) {
                impar += nIntroducido;
                ElementoI++;
            }else if(nIntroducido>par){
                par=nIntroducido;
            }
        }while(nIntroducido>0);
        System.out.println("Se han introducido "+Elemento+" dígitos");
        System.out.println("La media de los impares es: "+(impar/ElementoI));
        System.out.println("El par más alto es: "+par);
        sc.close();
    }
}
