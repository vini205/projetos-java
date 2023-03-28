/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch;
import javax.swing.JOptionPane;     
/**
 *
 * @author vini
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String dayName;
        boolean keep = true;
        while(keep){
            int day= Integer.parseInt(JOptionPane.showInputDialog("Digite o dia:"));
            switch (day){
                case 1:
                    dayName="Domingo";
                    break;
                case 2:
                    dayName="Segunda";
                    break;
                case 3:
                    dayName="Terça";
                    break;
                case 4:
                    dayName = "Quarta";
                    break;
                case 5:
                    dayName = "Quinta";
                    break;
                case 6:
                    dayName = "Sexta";
                    break;
                case 7:
                    dayName = "Sábado";
                    break;
                default:
                    dayName ="Dia Invalido";
            }
            JOptionPane.showMessageDialog(null, "Hoje é "+ dayName , "Dia da Semana", JOptionPane.INFORMATION_MESSAGE);
            int confirm = JOptionPane.showConfirmDialog(null, "Deseja continuar", "Continuar?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            System.out.println(confirm);
            if(1 == confirm){
                break;
            }
        }
    }
    
}
