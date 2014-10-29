/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporal;
import java.io.File;
/**
 *
 * @author Antonio
 */
public class MLexer {
    public static void main(String[] args){
        jflex.Main.generate(new File("src\\\\Temporal\\\\archivo.flex"));
    }
}
