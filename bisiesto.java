package bisiesto;

/**
 *
 * @author ERIKA
 */
import java.util.Scanner;

public class Bisiesto {

    public static void main(String[] args) {

        int fecha;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una fecha");
        fecha = entrada.nextInt();


        while (fecha != -1) {
            if ((fecha % 4 == 0) && (fecha % 100 != 0)) {
                System.out.println("Es un a*o bisiesto");
            } else {
                System.out.println("No es un a*o bisiesto");
            }
            System.exit(0);
        }
         System.out.println("Finalizo el programa");
    }
}