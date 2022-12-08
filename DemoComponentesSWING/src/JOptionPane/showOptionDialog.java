
package JOptionPane; //Paquete de trabajo

//Importaciones necesarias
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 * @version 1.0
 * @description Un programa que muestre los diferentes JoptionPane
 */
public class showOptionDialog extends javax.swing.JFrame { //Clase Principal

    //Clase showOPtionDialog
    public showOptionDialog() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOptionMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnOptionMenu.setBackground(new java.awt.Color(78, 224, 232));
        btnOptionMenu.setText("Menu de Opciones");
        btnOptionMenu.setOpaque(true);
        btnOptionMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOptionMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOptionMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOptionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionMenuActionPerformed
        Object[] options = {"Sí, por favor", "Ni loco", "Sin opinion"}; //Opciones
        
        int option = JOptionPane.showOptionDialog(
                this, //Ventana de ejecucion
            "¿Esto es un OptionPane de respuesta personalizada?", //Texto
            "Un OptionPane por defecto", //Titulo
            JOptionPane.YES_NO_CANCEL_OPTION, //Categoria de opciones
            JOptionPane.QUESTION_MESSAGE, //Icono
            null, //Obligatorio (Usar iconos por defecto)
            options, //Lista personalizada de opciones
            options[0] //Obligatorio (Establecer el boton marcado)
        );
    }//GEN-LAST:event_btnOptionMenuActionPerformed

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
            java.util.logging.Logger.getLogger(showOptionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showOptionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showOptionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showOptionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showOptionDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOptionMenu;
    // End of variables declaration//GEN-END:variables
}
