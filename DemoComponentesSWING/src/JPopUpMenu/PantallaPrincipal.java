
package JPopUpMenu; //Paquete de trabajo

//Importaciones necesarias
import java.awt.event.MouseEvent;

/**
 *
 * @author mario
 * @version 1.0
 * @description Un programa para mostrar una pequeña ventana emergente cercana al raton, cuando en este se presiona el click izquierdo
 */
public class PantallaPrincipal extends javax.swing.JFrame { //Clase Principal

    //CLase PantallaPrincipal
    public PantallaPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUp = new javax.swing.JPopupMenu();
        ELEMENTO_1 = new javax.swing.JMenuItem();
        ELEMENTO_2 = new javax.swing.JMenuItem();
        ELEMENTO_3 = new javax.swing.JMenuItem();

        ELEMENTO_1.setText("ELEMENTO 1");
        ELEMENTO_1.setName(""); // NOI18N
        ELEMENTO_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELEMENTO_1ActionPerformed(evt);
            }
        });
        popUp.add(ELEMENTO_1);

        ELEMENTO_2.setText("ELEMENTO 2");
        ELEMENTO_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELEMENTO_2ActionPerformed(evt);
            }
        });
        popUp.add(ELEMENTO_2);

        ELEMENTO_3.setText("ELEMENTO 3");
        ELEMENTO_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELEMENTO_3ActionPerformed(evt);
            }
        });
        popUp.add(ELEMENTO_3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*CLICK EN LA PANTALLA*/
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON3) { //En caso de ser click izquierdo (el tercer boton del raton...)
            popUp.show(this, evt.getX(), evt.getY()); //Mostramos la ventana emergente en la posicion cercana al raton
        }
        
    }//GEN-LAST:event_formMouseClicked

    /*OPCIONES POPUP*/
    private void ELEMENTO_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELEMENTO_1ActionPerformed
        System.out.println("HolaMundo");
    }//GEN-LAST:event_ELEMENTO_1ActionPerformed
    private void ELEMENTO_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELEMENTO_2ActionPerformed
        System.out.println("AdiosMundo");
    }//GEN-LAST:event_ELEMENTO_2ActionPerformed
    private void ELEMENTO_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELEMENTO_3ActionPerformed
        System.out.println("...");
    }//GEN-LAST:event_ELEMENTO_3ActionPerformed

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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ELEMENTO_1;
    private javax.swing.JMenuItem ELEMENTO_2;
    private javax.swing.JMenuItem ELEMENTO_3;
    private javax.swing.JPopupMenu popUp;
    // End of variables declaration//GEN-END:variables
}
