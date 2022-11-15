public class Ejercicio40 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la altura del rombo: ");
        int alt = Integer.parseInt(System.console().readLine());
        int espaciosI = 0;
        int espaciosD = alt / 2;
        if ((alt < 3) || (alt % 2 == 0)) {
        System.out.print("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3");
        } else {
        int altura = 1;
        while (altura <= alt / 2 + 1) {
        for (int i = 1; i <= espaciosD; i++) {
        System.out.print(" ");
        }
        System.out.print("*");
        for (int i = 1; i < espaciosI; i++) {
        System.out.print(" ");
        }
        if (altura>1) {
        System.out.print("*");
        }
        System.out.println();
        altura++;
        espaciosD--;
        espaciosI+=2;
        } 
        espaciosI = alt - 3;
        espaciosD = 1;
        altura = 0;
        while (altura < alt / 2) {
        for (int i = 1; i <= espaciosD; i++) {
        System.out.print(" ");
        }

        System.out.print("*");
        for (int i = 1; i < espaciosI; i++) {
        System.out.print(" ");
        }
        if(altura < alt / 2 - 1) {
        System.out.print("*");
        }
        System.out.println();
        altura++;
        espaciosD++;
        espaciosI -= 2;
        } 
        }
        }
        
}
