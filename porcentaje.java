package porcentaje;

import java.util.Scanner;

/**
 *
 * @author ERIKA
 */
public class Porcentaje {

    public static void main(String[] args) {

        int segundos = 0;
        int minutos = 0;
        int horas = 0;
        double porcentaje;
        int min = 60;



        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Digite por favor la cantidad de segundos que sea menor a 60 a calcular");
        segundos = entrada1.nextInt();

        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Digite por favor la cantidad de minutos que sea menor a 60 a calcular");
        minutos = entrada2.nextInt();

        Scanner entrada3 = new Scanner(System.in);
        System.out.println("Digite por favor la cantidad de horas que sea menor a 24 a calcular");
        horas = entrada3.nextInt();

        if (segundos <= 60 && minutos <= 60 && horas <= 24) {
            porcentaje = ((((segundos / min) + minutos + (horas * min)) * 100) / 1440);
            System.out.println("La cantidad del dia transcurrido es de:  " + porcentaje + "%");
        } else {
            System.out.println("Verifique por favor las cantidades digitadas");
        }
    }
}