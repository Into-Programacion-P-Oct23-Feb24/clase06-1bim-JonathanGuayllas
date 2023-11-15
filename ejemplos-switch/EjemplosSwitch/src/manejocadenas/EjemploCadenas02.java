/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EjemploCadenas02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        // esta línea me permite pedir que ingresen datos por teclado
        entrada.useLocale(Locale.US);
        // esta línea me permite trabajar los decimales con .
        String cadenaFinal = "Datos Ingresados\n";
        
        System.out.println("Ingrese la ciudad");
        String ciudad = entrada.nextLine(); // Quito
        
        
        cadenaFinal = String.format("%sCiudad:%s\n",
                cadenaFinal, ciudad);
        //System.out.printf("%s\n", cadenaFinal);
         
        System.out.println("Ingrese la provincia");
        String provincia = entrada.nextLine(); // 
        //usando cadenaFinal y el String.format acumulo datos y los presento al final a todos
        cadenaFinal = String.format("%sProvincia:%s\n",  
                cadenaFinal,
                provincia);
        
        System.out.println("Ingrese la país");
        String pais = entrada.nextLine(); // 
        
        cadenaFinal = String.format("%sPaís:%s\n",  
                cadenaFinal, 
                pais);
        
        System.out.printf("%s", cadenaFinal);
        
    }
}
