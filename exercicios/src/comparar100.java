/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 * 
 * @author User
 */
public class comparar100 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String numero;
      
      numero = JOptionPane.showInputDialog( "Digite um número");
      int numeroSomado;
      String query;
      
      if(numero.equals("100")){  
          JOptionPane.showMessageDialog(null, "O número é 100");
    }else{
          JOptionPane.showMessageDialog(null,"O número não é 100. \n Ele é : "+numero);
      }
      query = JOptionPane.showInputDialog(null, "Você quer somar esse número com 1?", "sim");
      if(query.equals("sim")){
          numeroSomado = Integer.parseInt(numero) + 1;
          JOptionPane.showMessageDialog(null,"Seu número somado" + numeroSomado);
      }
    }
}
