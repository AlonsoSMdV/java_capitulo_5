import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dia1 = 0;
        int dia2 = 0;
        int hora;
        int hora2;
        String dia1String;
        String dia2String;
        String dia1nombre = "";
        String dia2nombre = "";
        boolean correctos = true;

        do{
            System.out.println("\nPor favor, introduzca la primera hora y el  dia.");
            System.out.print("Día: ");
            dia1String = sc.nextLine();
            System.out.print("Hora: ");
            hora = sc.nextInt();

            switch(dia1String){
                case "lunes":
                case "1":
                dia1 = 1;
                dia1nombre = "lunes";
                break;
                case "martes":
                case "2":
                dia1 = 2;
                dia1nombre = "martes";
                break;
                case "miércoles":
                case "3":
                dia1 = 3;
                dia1nombre = "miércoles";
                break;
                case "jueves":
                case "4":
                dia1 = 4;
                dia1nombre = "jueves";
                break;
                case "viernes":
                case "5":
                dia1 = 5;
                dia1nombre = "viernes";
                break;
                case "sábado":
                case "6":
                dia1 = 6;
                dia1nombre = "sábado";
                break;
                case "domingo":
                case "7":
                dia1 = 7;
                dia1nombre = "domingo";
                break;
                default:
                dia1 = 0;
            }
            
            System.out.println("Por favor, introduzca la segunda hora y el segundo dia.");
            System.out.print("Día: ");
            dia2String = sc.nextLine();
            System.out.print("Hora: ");
            hora2 = sc.nextInt();
            switch(dia2String){
                case "lunes":
                case "1":
                dia2 = 1;
                dia2nombre = "lunes";
                break;
                case "martes":
                case "2":
                dia2 = 2;
                dia2nombre = "martes";
                break;
                case "miércoles":
                case "3":
                dia2 = 3;
                dia2nombre = "miércoles";
                break;
                case "jueves":
                case "4":
                dia2 = 4;
                dia2nombre = "jueves";
                break;
                case "viernes":
                case "5":
                dia2 = 5;
                dia2nombre = "viernes";
                break;
                case "sábado":
                case "6":
                dia2 = 6;
                dia2nombre = "sábado";
                break;
                case "domingo":
                case "7":
                dia2 = 7;
                dia2nombre = "domingo";
                break;
                default:
                dia2 = 0;
            }
            correctos = true;
            if (dia2 <= dia1) {
                System.out.println("El segundo día debe ser posterior al primero.");
                correctos = false;
                }
                if ((dia1 == 0) || (dia2 == 0)) {
                System.out.println("No se ha introducido correctamente el día de la semana.");
                correctos = false;
                }
                if ((hora < 0) || (hora > 23) || (hora2 < 0) || (hora2 > 23)) {
                System.out.println("No se ha introducido correctamente la hora del día.");
                correctos = false;
                }
        }while(!correctos);
        System.out.print("Entre las " + hora + ":00h del " + dia1nombre);
        System.out.print(" y las " + hora2 + ":00h del " + dia2nombre);
        System.out.println(" hay " + (((dia2 * 24) + hora2) - ((dia1 * 24) + hora)) + " horas.");
        sc.close();
    }
}
