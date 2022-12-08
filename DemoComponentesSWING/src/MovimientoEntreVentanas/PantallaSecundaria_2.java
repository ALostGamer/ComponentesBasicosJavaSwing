
package MovimientoEntreVentanas; //Paquete de trabajo

/**
 *
 * @author mario
 * @version 1.0
 * @description Un programa que permita viajar entre diferentes pantallas (Jframe & JDialog)
 */
public class PantallaSecundaria_2 extends javax.swing.JDialog {

    //Clase PantallaSecundaria_2
    public PantallaSecundaria_2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        ppal = (PantallaPrincipal) parent; //Inicializacion de la pantalla principal
        
        ternaria1 = new PantallaTernaria_2_1(this, true); //Inicializacion de la ventana ternaria 1
        ternaria2 = new PantallaTernaria_2_2(this, true); //Inicializacion de la ventana ternaria 2
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVentana_1 = new javax.swing.JButton();
        btnVentana_2 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btnVentana_1.setBackground(new java.awt.Color(126, 3, 3));
        btnVentana_1.setText("Ventana 1");
        btnVentana_1.setOpaque(true);
        btnVentana_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentana_1ActionPerformed(evt);
            }
        });

        btnVentana_2.setBackground(new java.awt.Color(11, 157, 80));
        btnVentana_2.setText("Ventana 2");
        btnVentana_2.setOpaque(true);
        btnVentana_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentana_2ActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(78, 224, 232));
        btnVolver.setText("Pantalla Principal");
        btnVolver.setOpaque(true);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVentana_1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(btnVentana_2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVentana_2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(btnVentana_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose(); //Cerramos la ventana activa
        ppal.setVisible(true); //Abrimos la pantalla principal
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnVentana_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentana_1ActionPerformed
        this.dispose(); //Cerramos la ventana activa
        ternaria1.setVisible(true); //Abrimos la ventana ternaria 1
    }//GEN-LAST:event_btnVentana_1ActionPerformed

    private void btnVentana_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentana_2ActionPerformed
        this.dispose(); //Cerramos la ventana activa
        ternaria1.setVisible(true); //Abrimos la ventana ternaria
    }//GEN-LAST:event_btnVentana_2ActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaSecundaria_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaSecundaria_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaSecundaria_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaSecundaria_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PantallaSecundaria_2 dialog = new PantallaSecundaria_2(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    /*Inicio declaracion mis variables*/
    private PantallaPrincipal ppal; //Declaracion de la pantalla principal
    private PantallaTernaria_2_1 ternaria1; //Declaracion de la ventana ternaria 1
    private PantallaTernaria_2_2 ternaria2; //Declaracion de la ventana ternaria 2
    /*Inicio declaracion mis variables*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVentana_1;
    private javax.swing.JButton btnVentana_2;
    private javax.swing.JButton btnVolver;
    // End of variables declaration//GEN-END:variables
}
