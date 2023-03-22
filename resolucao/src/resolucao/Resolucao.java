/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolucao;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;

/**
 *
 * @author vini
 */
public class Resolucao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Toolkit tkit = Toolkit.getDefaultToolkit();
        int res = tkit.getScreenResolution();
        Dimension d = tkit.getScreenSize();
        int width = d.width;
        int height = d.height;
        Clipboard sC = tkit.getSystemClipboard();
        System.out.println("Sua resolução é");
        System.out.println(width+"x"+height);
              
    }
    
}
