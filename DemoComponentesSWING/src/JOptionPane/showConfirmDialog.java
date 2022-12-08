
package JOptionPane; //Paquete de trabajo

//Importaciones necesarias
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 * @version 1.0
 * @description Un programa que muestre los diferentes JoptionPane
 */
public class showConfirmDialog extends javax.swing.JFrame { //Clase Principal

    //Clase showConfirmDialog
    public showConfirmDialog() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSimple = new javax.swing.JButton();
        btnPersonalizado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnSimple.setBackground(new java.awt.Color(126, 3, 3));
        btnSimple.setText("SIMPLE");
        btnSimple.setOpaque(true);
        btnSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpleActionPerformed(evt);
            }
        });

        btnPersonalizado.setBackground(new java.awt.Color(78, 224, 232));
        btnPersonalizado.setText("PERSONALIZADO");
        btnPersonalizado.setOpaque(true);
        btnPersonalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalizadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSimple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPersonalizado, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSimple, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnPersonalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*showConfirmDialog basico*/
    private void btnSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpleActionPerformed
        int SiNo = JOptionPane.showConfirmDialog(
            this, //Ventana de ejecucion
            "¿Esto es un OptionPane de respuesta Si o No?", //Texto
            "Un OptionPane por defecto", //Titulo
            JOptionPane.YES_NO_OPTION, //Categoria de opciones
            JOptionPane.QUESTION_MESSAGE //Icono
        );
    }//GEN-LAST:event_btnSimpleActionPerformed

    /*showConfirmDialog personalizado*/
    private void btnPersonalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalizadoActionPerformed
        Object[] options = {"Sí, por favor", "Ni loco"}; //Opciones
        
        int SiNo = JOptionPane.showOptionDialog(
            this, //Ventana de ejecucion
            "¿Esto es un OptionPane de respuesta personalizada?", //Texto
            "Un OptionPane por defecto", //Titulo
            JOptionPane.YES_NO_OPTION, //Categoria de opciones
            JOptionPane.QUESTION_MESSAGE, //Icono
            null,       //Obligatorio (Usar iconos por defecto)
            options,    //Lista personalizada de opciones
            options[0]  //Obligatorio (Establecer el boton marcado)
        ); 
    }//GEN-LAST:event_btnPersonalizadoActionPerformed

    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(showConfirmDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showConfirmDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showConfirmDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showConfirmDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showConfirmDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPersonalizado;
    private javax.swing.JButton btnSimple;
    // End of variables declaration//GEN-END:variables
}
