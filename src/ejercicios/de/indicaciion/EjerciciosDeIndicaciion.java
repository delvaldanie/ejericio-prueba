
package ejercicios.de.indicaciion;

import java.util.Scanner;

public class EjerciciosDeIndicaciion {    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        float euros;
        float pesetas = 0;
        boolean salir = true;
        
        
        System.out.println("Introduce los euros para pasarlos a pesetas: " );
        euros=teclado.nextFloat();        
            
        while( euros<0 && salir){
            System.out.println("El valor de los euros tiene que se mayor a cero. Introduce los euros para pasarlos a pesetas: " );
            euros=teclado.nextFloat();  
            
        }
        
        pesetas=(float) (euros*166.386);
        System.out.println("El valor a pesetas es: " +pesetas+ " ptas");
        
    }
    
}
