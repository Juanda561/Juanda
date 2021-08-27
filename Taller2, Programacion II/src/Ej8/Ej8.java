/*
8. Se desea un aplicativo en Java que muestre por consola el texto de un
menú con cinco opciones. Para ello, se solicita utilizar solo una
instrucción de impresión.
 */
package Ej8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej8 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int i;
        
        System.out.println("Escriba el numero de la opcion");
        
        System.out.println("Opcion 1");
        System.out.println("Opcion 2");
        System.out.println("Opcion 3");
        System.out.println("Opcion 4");
        System.out.println("Opcion 5");
         i=Integer.parseInt(br.readLine());
        System.out.println("");
        switch (i) {
            case 1:
                System.out.println("Has escogido la opcion 1");
                break;
            case 2:
                System.out.println("Has escogido la opcion 2");
                break;
            case 3: 
                System.out.println("Has escogido la opcion 3");
                break;
            case 4: 
                System.out.println("Has escogido la opcion 4");
                break;
            case 5: 
                System.out.println("Has escogido la opcion 5");
                break;
            default:
                break;
        }
    }  
}
