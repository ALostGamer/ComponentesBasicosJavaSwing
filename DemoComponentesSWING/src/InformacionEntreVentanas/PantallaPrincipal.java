
package InformacionEntreVentanas; //Paquete de trabajo

/**
 *
 * @author mario
 * @version 1.0
 * @description Un programa para mover informacion entre dos pantallas (JFrame & JDialog)
 */
public class PantallaPrincipal extends javax.swing.JFrame { //CLase Principal

    /*Clase PantallaPrincipal*/
    public PantallaPrincipal() {
        initComponents();
        
        secundaria = new PantallaSecundaria(this, true); //Inicializacion de la ventana secundaria
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSalida = new javax.swing.JLabel();
        txtTextoPorSalida = new javax.swing.JTextField();
        btnIrSecundaria = new javax.swing.JButton();
        btnIrTernaria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalida.setText("Output:");

        txtTextoPorSalida.setEditable(false);
        txtTextoPorSalida.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnIrSecundaria.setText("Ventana Secundaria");
        btnIrSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrSecundariaActionPerformed(evt);
            }
        });

        btnIrTernaria.setText("Ventana Ternaria");
        btnIrTernaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrTernariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIrSecundaria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIrTernaria))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                        .addComponent(txtTextoPorSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTextoPorSalida)
                    .addComponent(lblSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIrSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIrTernaria, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIrSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrSecundariaActionPerformed
        this.dispose(); //Cerramos la pantalla activa
        secundaria.setVisible(true); //Abrimos la ventana secundaria
    }//GEN-LAST:event_btnIrSecundariaActionPerformed

    private void btnIrTernariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrTernariaActionPerformed
        ternaria = new PantallaTernaria(this, true, txtTextoPorSalida.getText()); //Inicializacion de la entana ternaria
        
        this.dispose(); //Cerramos la pantalla activa
        ternaria.setVisible(true); //Abrimos la ventana ternaria
    }//GEN-LAST:event_btnIrTernariaActionPerformed
    
    protected void setCampoTexto(String dato) {
        txtTextoPorSalida.setText(dato); //Metodo personalizado que pasa la informacion de la ventana secundaria a la pantalla principal
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    /*Inicio declaracion mis variables*/
    PantallaSecundaria secundaria; //Declaracion de la ventana secundaria
    PantallaTernaria ternaria; //Declaracion de la ventana ternaria
    /*Fin declaracion mis variables*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIrSecundaria;
    private javax.swing.JButton btnIrTernaria;
    private javax.swing.JLabel lblSalida;
    private javax.swing.JTextField txtTextoPorSalida;
    // End of variables declaration//GEN-END:variables
}
