
package MovimientoEntreVentanas; //Paquete de trabajo

/**
 *
 * @author mario
 * @version 1.0
 * @description Un programa que permita viajar entre diferentes pantallas (Jframe & JDialog)
 */
public class PantallaPrincipal extends javax.swing.JFrame { //Clase Principal

    //Clase PantallaPrincipal
    public PantallaPrincipal() {
        initComponents();
        
        secundaria1 = new PantallaSecundaria_1(this, true); //Inicializacion de la ventana secundaria 1
        secundaria2 = new PantallaSecundaria_2(this, true); //Inicializacion de la ventana secundaria 2
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVentana_1 = new javax.swing.JButton();
        btnVentana_2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnVentana_1.setBackground(new java.awt.Color(126, 3, 3));
        btnVentana_1.setText("Ventana 1");
        btnVentana_1.setOpaque(true);
        btnVentana_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentana_1ActionPerformed(evt);
            }
        });

        btnVentana_2.setBackground(new java.awt.Color(78, 224, 232));
        btnVentana_2.setText("Ventana 2");
        btnVentana_2.setOpaque(true);
        btnVentana_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentana_2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addComponent(btnVentana_2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVentana_1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVentana_1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnVentana_2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentana_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentana_1ActionPerformed
        this.dispose(); //Cerramos la pantalla activa
        secundaria1.setVisible(true); //Abrimos la ventana secundaria 1
    }//GEN-LAST:event_btnVentana_1ActionPerformed

    private void btnVentana_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentana_2ActionPerformed
        this.dispose(); //Cerramos la pantalla activa
        secundaria2.setVisible(true); //Abrimos la ventana secundaria 2
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
    private PantallaSecundaria_1 secundaria1; //Declaracion de la ventana secundaria 1
    private PantallaSecundaria_2 secundaria2; //Declaracion de la ventana secundaria 2
    /*Fin declaracion mis variables*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVentana_1;
    private javax.swing.JButton btnVentana_2;
    // End of variables declaration//GEN-END:variables
}
