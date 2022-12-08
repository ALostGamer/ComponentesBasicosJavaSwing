
package JOptionPane; //Paquete de trabajo

//Importaciones necesarias
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 * @version 1.0
 * @description Un programa que muestre los diferentes JoptionPane
 */
public class showInputDialog extends javax.swing.JFrame { //Clase Principal

    //Clase showInputDialog
    public showInputDialog() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Forma1 = new javax.swing.JButton();
        btn_Forma2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn_Forma1.setBackground(new java.awt.Color(126, 3, 3));
        btn_Forma1.setText("Lista De Opciones");
        btn_Forma1.setOpaque(true);
        btn_Forma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Forma1ActionPerformed(evt);
            }
        });

        btn_Forma2.setBackground(new java.awt.Color(78, 224, 232));
        btn_Forma2.setText("Texto A Escribir");
        btn_Forma2.setOpaque(true);
        btn_Forma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Forma2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_Forma2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Forma1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn_Forma1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btn_Forma2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /*showInputDialog por opciones*/
    private void btn_Forma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Forma1ActionPerformed
        Object[] possibilities = {"Mundo", "Clase", "Alumno"}; //Opciones
        
        String salida = (String)JOptionPane.showInputDialog(
            this, //Ventana de ejecucion
            "Completa la sentencia:\n"+ "\"Hola...\"", //Texto
            "Un InputDialog por opciones", //Titulo
            JOptionPane.INFORMATION_MESSAGE, //Icono
            null, //Obligatorio (Usar iconos por defecto)
            possibilities, //Lista personalizada de opciones
            possibilities[0]); //Obligatorio (Establecer el boton marcado)

    if ((salida != null) && (salida.trim().length() > 0)) { //Si una salida es seleccionada y se pulsa en "aceptar"...
        JOptionPane.showMessageDialog(this, "Cualquiera de las opciones servía...\nHas escogido: \"Hola " + salida + "\"");
    } else { //Si sucede cualquier situacion no esperada...
        JOptionPane.showMessageDialog(this, "No seas agüafiestas");
    }
    }//GEN-LAST:event_btn_Forma1ActionPerformed

    /*showInputDialog por texto*/
    private void btn_Forma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Forma2ActionPerformed
        String salida = (String)JOptionPane.showInputDialog(
                this, //Ventana de ejecucion
                "Completa la sentencia:\n" + "\"Hola...\"", //Texto
                "Un InputDialog por texto", //Titulo
                JOptionPane.INFORMATION_MESSAGE); //Icono
        
    if ((salida != null) && (salida.trim().length() > 0)) { //Si una salida es escrita y se pulsa en "aceptar"...
        JOptionPane.showMessageDialog(this, "Cualquiera de las opciones servía...\nHas escogido: \"Hola " + salida + "\"");
    } else { //Si sucede cualquier situacion no esperada...
        JOptionPane.showMessageDialog(this, "No seas agüafiestas");
    }
    }//GEN-LAST:event_btn_Forma2ActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(showInputDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showInputDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showInputDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showInputDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showInputDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Forma1;
    private javax.swing.JButton btn_Forma2;
    // End of variables declaration//GEN-END:variables
}
