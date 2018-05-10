/* MODIFICADO EN GITHUB
Se va a diseñar una aplicación que rellenará un vector de figuras (ej. 4
figuras) con círculos y rectángulos
 */
package gitproyectoclon;

import java.util.Scanner;
import java.awt.Color;
import java.util.InputMismatchException;
/**
 *
 * @author Vicente Martínez Juan
 */
public class FiguraApp {
    static Scanner tec = new Scanner(System.in);
    static float x, y;
    
    public static void main(String[] args) {
        
        int opc=0; boolean salir;
        String menu="1 Círculo"
                + "\n2 Rectángulo"
                + "\n3 Ordenar y mostrar"
                + "\n4 Salir";
        do{
            try{
                salir=true;
                System.out.println(menu); opc=tec.nextInt();
                switch(opc){
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                    case 4:
                        salir=true;                        
                }
            }catch(InputMismatchException e){
                System.out.println("Debe ser un núm."); tec.nextLine();
                salir=false;
            }
            
        }while((opc>=1 && opc<=3) || salir==false);
        
    }
   
}
