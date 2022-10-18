import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int intentos = 4;
        boolean valor = false;
        do{
            System.out.print("Introduzca la clave de la caja fuerte: ");
            int a = sc.nextInt();
        if(a == 4466){
            valor = true;
        }   else{
            System.out.print("Contraseña incorrecta");
        }

        intentos--;
    }while((intentos>0)&&(!valor));
    if(valor==true){
        System.out.print("Felicidades acertaste la contraseña");
    }else {
        System.out.println("Se quedó sin oportunidades porfavor vuelva en otro momento");
    }

    sc.close();
    }

}
