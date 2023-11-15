/*
*   Ingrese una cadena de texto y verifique que pertenece a un  de un día de la 
*   semana.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el nombre del día de la semana");
        String cadena = entrada.nextLine();

        switch (cadena) {
            case "Lunes":
                System.out.printf("%s, es el primer día de la semana\n",
                        cadena);
                break;

            case "Martes":
            case "martes":
                System.out.printf("%s, es el segundo día de la semana\n",
                        cadena);
                break;

            case "Miercoles":
                System.out.printf("%s, es el tercer día de la semana\n",
                        cadena);
                break;

            case "Jueves":
                System.out.printf("%s, es el cuarto día de la semana\n",
                        cadena);
                break;

            case "Viernes":
            case "VIERNES":
            case "viernes":
                System.out.printf("%s, es el quinto día de la semana\n", 
                        cadena);
                break;

            case "Sabado":
                System.out.printf("%s, es el sexto día de la semana\n", 
                        cadena);
                break;

            case "Domingo":
                System.out.printf("%s, es el séptimo dia de la semana\n", 
                        cadena);
                break;

            default:
                System.out.println("ninguna de las anteriores\n");
                break;
        }

    }
}
