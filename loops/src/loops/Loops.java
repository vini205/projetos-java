/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loops;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author vini
 */
public class Loops {

    /**
     * @param lenght
     * @param arr
     * @param element
     * @return int[]
     */
    public static int[] push(int lenght,int arr[],int element){
        int newArray[] = new int[lenght+1];
        
        for(int i=0; i< lenght;i++){
            newArray[i]= arr[i];
        }
        newArray[lenght]= element;
        
        // newArray[1 +newArray.lenght] = element; --- ISSO funcionaria?
        return newArray;
        /*
        
        */
    }
    public static void main(String[] args) {
        /*
        int c =0;
        int cc =10;
        System.out.println("\nFor loop");
        for (int i =0;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("\nWhile Loop\n");
        while(c<=10){
            System.out.println(++c);// Add e dps lê
            
        }
        System.out.println("\nDo-While Loop\n");
        do{
            System.out.println(cc--);
        }while(cc>1);
        */
        
        int totalAlunos;
        totalAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de alunos"));
        int medias[] = new int[totalAlunos];
        for (int i = 0; i <totalAlunos;i++){// Guardando médias
            int media = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota do aluno", "Notas", JOptionPane.QUESTION_MESSAGE));
            
            // medias=push(totalAlunos,medias,media); Inútil
            medias[i]=media;
            
        }
        System.out.println("Total de Alunos: "+totalAlunos);
        String txt = "" ;
        
        for (int i=0;i<totalAlunos;i++){// Mostrando médias
        txt+= "Aluno "+i+"\t Média: "+medias[i]+"\n";
        }
            JOptionPane.showMessageDialog(null,txt , "Tabela", JOptionPane.INFORMATION_MESSAGE);
        int total = 0; 
        for(int i=0; i<(totalAlunos);i++){
            total += medias[i];
        }
        double mediaTotal = total/totalAlunos;
        JOptionPane.showMessageDialog(null,"Média Total: \n"+mediaTotal);
        
        
    }
    
}
