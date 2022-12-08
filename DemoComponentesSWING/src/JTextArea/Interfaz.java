
package JTextArea; //Paquete de trabajo

//Importaciones necesarias
import java.awt.event.MouseEvent; 

/**
 *
 * @author mario
 * @version 1.0
 * @description Un programa que simule un editor de texto sencillo, a su vez que sea capaz de contar palabras y letras
 */
public class Interfaz extends javax.swing.JFrame { //Clase Principal

    //Clase Interfaz
    public Interfaz() {
        initComponents();
        
        lblLetrasPorDefecto = lblLetras.getText(); //Almacenamos el texto por defecto en nuestra variable
        lblPalabrasPorDefecto = lblPalabras.getText(); //Almacenamos el texto por defecto en nuestra variable
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUp = new javax.swing.JPopupMenu();
        MenuItemCopiar = new javax.swing.JMenuItem();
        jMenuItemCortar = new javax.swing.JMenuItem();
        jMenuItemPegar = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDatos = new javax.swing.JTextArea();
        lblPalabras = new javax.swing.JLabel();
        lblLetras = new javax.swing.JLabel();

        MenuItemCopiar.setText("Copiar");
        MenuItemCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCopiarActionPerformed(evt);
            }
        });
        popUp.add(MenuItemCopiar);

        jMenuItemCortar.setText("Cortar");
        jMenuItemCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCortarActionPerformed(evt);
            }
        });
        popUp.add(jMenuItemCortar);

        jMenuItemPegar.setText("Pegar");
        jMenuItemPegar.setToolTipText("");
        jMenuItemPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPegarActionPerformed(evt);
            }
        });
        popUp.add(jMenuItemPegar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTextAreaDatos.setBackground(new java.awt.Color(23, 7, 74));
        jTextAreaDatos.setColumns(20);
        jTextAreaDatos.setForeground(new java.awt.Color(177, 209, 210));
        jTextAreaDatos.setRows(5);
        jTextAreaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaDatosMouseClicked(evt);
            }
        });
        jTextAreaDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAreaDatosKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaDatos);

        lblPalabras.setText("Numero de Palabras: ");

        lblLetras.setText("Numero de Letras:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(lblLetras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPalabras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLetras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPalabras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /*DETECAR PULSACIONES POR TECLADO DIRIGIDAS AL TEXTAREA*/
    private void jTextAreaDatosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaDatosKeyTyped
        String texto = jTextAreaDatos.getText(); //Recogemos el texto del TextArea
        
        int numCaracteres = texto.length(); //Contamos las letras
        
        String palabras[] = texto.split("\\s"); //Separamos las palabras por un breve espacio...
            int numPalabras = palabras.length; //Contamos las palabras
            
        lblLetras.setText(lblLetrasPorDefecto + "\t"+numCaracteres); //Actualizamos el primer campo label
        lblPalabras.setText(lblPalabrasPorDefecto + "\t"+numPalabras); //Actualizamos el segundo campo label
        
    }//GEN-LAST:event_jTextAreaDatosKeyTyped
    /*CLICK EN EL TEXTAREA*/
    private void jTextAreaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaDatosMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON3) { //En caso de ser click izquierdo (el tercer boton del raton...)
            popUp.show(this, evt.getX(), evt.getY()); //Mostramos la ventana emergente en la posicion cercana al raton
        }
    }//GEN-LAST:event_jTextAreaDatosMouseClicked

    /*OPCIONES POPUP*/
    private void MenuItemCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCopiarActionPerformed
        textoMarcado = jTextAreaDatos.getSelectedText(); //Accion Copiar
    }//GEN-LAST:event_MenuItemCopiarActionPerformed

    private void jMenuItemCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCortarActionPerformed
        textoMarcado = jTextAreaDatos.getSelectedText();
        jTextAreaDatos.replaceSelection(""); //Accion Cortar
    }//GEN-LAST:event_jMenuItemCortarActionPerformed

    private void jMenuItemPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPegarActionPerformed
        int position = jTextAreaDatos.getCaretPosition();
        jTextAreaDatos.insert(textoMarcado, position); //Accion Pegar
    }//GEN-LAST:event_jMenuItemPegarActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    
    /*Inicio declaracion mis variables*/
    private String lblLetrasPorDefecto; //Creamos una variable por defecto para el texto base en cuenta letras
    private String lblPalabrasPorDefecto; //Creamos una variable por defecto para el texto base en cuenta palabras
    
    private String textoMarcado; //Creamos una variable capaz de recoger el texto seleccionado
    /*Fin declaracion mis variables*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemCopiar;
    private javax.swing.JMenuItem jMenuItemCortar;
    private javax.swing.JMenuItem jMenuItemPegar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDatos;
    private javax.swing.JLabel lblLetras;
    private javax.swing.JLabel lblPalabras;
    private javax.swing.JPopupMenu popUp;
    // End of variables declaration//GEN-END:variables
}
