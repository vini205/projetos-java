/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tela;

import java.util.Arrays;
import javax.swing.DefaultListModel;

/**
 *
 * @author vini
 */
public class tela extends javax.swing.JFrame {

    
    
    int vetor[] = new int[5];
    DefaultListModel listaM = new DefaultListModel();
    int index = 0;
    
    /**
     * Creates new form tela
     */
    public tela() {
        initComponents();
        mudarTamanhoPainel.setVisible(false);
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spinner = new javax.swing.JSpinner();
        order = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        info = new javax.swing.JLabel();
        mudarTamanhoPainel = new javax.swing.JPanel();
        mudarTamanhoSpinner = new javax.swing.JSpinner();
        mudarTamanho = new javax.swing.JButton();
        mudarTamanhoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        spinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        order.setText("Ordenar");
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });

        remove.setText("Remover");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        add.setText("Adicionar");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        lista.setModel(listaM);
        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        info.setText("vetor");

        mudarTamanho.setText("Mudar");
        mudarTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mudarTamanhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mudarTamanhoPainelLayout = new javax.swing.GroupLayout(mudarTamanhoPainel);
        mudarTamanhoPainel.setLayout(mudarTamanhoPainelLayout);
        mudarTamanhoPainelLayout.setHorizontalGroup(
            mudarTamanhoPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mudarTamanhoPainelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(mudarTamanhoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mudarTamanho)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        mudarTamanhoPainelLayout.setVerticalGroup(
            mudarTamanhoPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mudarTamanhoPainelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(mudarTamanhoPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mudarTamanhoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mudarTamanho))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        mudarTamanhoBtn.setText("Mudar o tamanho da lista");
        mudarTamanhoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mudarTamanhoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(info)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(add)
                                .addGap(26, 26, 26)
                                .addComponent(remove)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(order)
                        .addGap(69, 69, 69)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(mudarTamanhoBtn)
                .addGap(29, 29, 29)
                .addComponent(mudarTamanhoPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(info)
                            .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add)
                            .addComponent(remove))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(order)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(mudarTamanhoPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mudarTamanhoBtn)
                        .addGap(50, 50, 50))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        vetor[index] = 0;
        update(vetor);
        
    }//GEN-LAST:event_removeActionPerformed
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        int n = Integer.parseInt(spinner.getValue().toString());
        vetor[index] = n;
        update(vetor);
        
    }//GEN-LAST:event_addActionPerformed

    /**
     *
     * @param vetor array que seta a lista
     */
    public void update(int[] vetor){
        listaM.removeAllElements();
        for (int i = 0; i < vetor.length; i++) {
            listaM.addElement(vetor[i]);
        }       
        
    }
    private void mudarTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mudarTamanhoActionPerformed
        int novoTamanho = Integer.parseInt(mudarTamanhoSpinner.getValue().toString());
        int tamanho = vetor.length;
        int[] guardar = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            guardar[i] = vetor[i];
        }
        
        vetor = new int[novoTamanho];
        
        if(novoTamanho < tamanho){
            for (int i = 0; i < vetor.length;i++){
                vetor[i] = guardar[i];
            }
        } else{
            for (int i = 0; i < guardar.length; i++) {
            vetor[i] = guardar[i];
        }
        }
        
        
        update(vetor);
        
        
    }//GEN-LAST:event_mudarTamanhoActionPerformed

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        index = lista.getSelectedIndex();
        info.setText("vetor[" +index+"]");
    }//GEN-LAST:event_listaMouseClicked

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        Arrays.sort(vetor);
        update(vetor);
    }//GEN-LAST:event_orderActionPerformed

    private void mudarTamanhoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mudarTamanhoBtnActionPerformed
        mudarTamanhoPainel.setVisible(true);
    }//GEN-LAST:event_mudarTamanhoBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel info;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    private javax.swing.JButton mudarTamanho;
    private javax.swing.JButton mudarTamanhoBtn;
    private javax.swing.JPanel mudarTamanhoPainel;
    private javax.swing.JSpinner mudarTamanhoSpinner;
    private javax.swing.JButton order;
    private javax.swing.JButton remove;
    private javax.swing.JSpinner spinner;
    // End of variables declaration//GEN-END:variables
}
