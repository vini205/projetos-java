/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linguagemdosistema;
import java.util.Locale;
/**
 *
 * @author vini
 */
public class LinguagemDoSistema {

    public static void main(String[] args) {
        Locale loc =  Locale.getDefault();
        String pais = loc.getDisplayCountry();
        String lingua = loc.getDisplayLanguage();
        System.out.println("Você está no: "+ pais + ", e fala "+ lingua );
    }
    
}
