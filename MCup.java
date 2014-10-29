/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporal;

/**
 *
 * @author Antonio
 */
public class MCup {
    public static void main(String[] args){
        String opciones[] = new String[5];
        opciones[0]="-destdir";
        opciones[1]="src\\temporal\\";
        opciones[2] = "-parser";
        opciones[3] = "Analizador";
        opciones[4] = "src\\temporal\\analizador.cup";
        try {
        java_cup.Main.main(opciones);
        } catch (Exception e) {
        System.out.print(e);
        }
        
    }
}
