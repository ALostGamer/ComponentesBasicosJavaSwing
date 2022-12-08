
package JSlider_JSpinner; //Paquete de trabajo

//Importaciones necesarias
import javax.swing.JSpinner;

/**
 *
 * @author mario
 * @version 1.0
 * @description Un programa para modificar el color de fondo de un JFrame por defecto mediante dos JSlider y un JSpinner
 */
public class Selector extends javax.swing.JFrame { //Clase Principal

    /*Clase Selector*/
    public Selector() {
        initComponents();
        
        ((JSpinner.DefaultEditor) jspAzul.getEditor()).getTextField().setEditable(false); // Establecemos que el JSpinner creado no pueda ser editado via texto
        
        colorRojo = 0; //Iniciamos la variable a 0 (R)
        colorVerde = 0; //Iniciamos la variable a 0 (G)
        colorAzul = 0; //Iniciamos la variable a 0 (B)
        
        establecerFondo(colorRojo, colorVerde, colorAzul); //Llamamos al metodo para establecer el fondo del JFrame para ya iniciarlo a color
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jslRojo = new javax.swing.JSlider();
        jslVerde = new javax.swing.JSlider();
        jspAzul = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jslRojo.setMajorTickSpacing(51);
        jslRojo.setMaximum(255);
        jslRojo.setPaintLabels(true);
        jslRojo.setPaintTicks(true);
        jslRojo.setValue(0);
        jslRojo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jslRojoStateChanged(evt);
            }
        });

        jslVerde.setMajorTickSpacing(51);
        jslVerde.setMaximum(255);
        jslVerde.setPaintLabels(true);
        jslVerde.setPaintTicks(true);
        jslVerde.setValue(0);
        jslVerde.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jslVerdeStateChanged(evt);
            }
        });

        jspAzul.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        jspAzul.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jspAzulStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jslVerde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jslRojo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jslRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jspAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jslVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jslRojoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jslRojoStateChanged
        colorRojo = (int) jslRojo.getValue(); //Agregamos el valor a la variable (R)
        establecerFondo(colorRojo, colorVerde, colorAzul); //Llamamos al metodo cada vez que actualicemos el color
    }//GEN-LAST:event_jslRojoStateChanged

    private void jslVerdeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jslVerdeStateChanged
        colorVerde = (int) jslVerde.getValue(); //Agregamos el valor a la variable (G)
        establecerFondo(colorRojo, colorVerde, colorAzul); //Llamamos al metodo cada vez que actualicemos el color
    }//GEN-LAST:event_jslVerdeStateChanged

    private void jspAzulStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jspAzulStateChanged
        colorAzul = (int) jspAzul.getValue(); //Agregamos el valor a la variable (B)
        establecerFondo(colorRojo, colorVerde, colorAzul); //Llamamos al metodo cada vez que actualicemos el color
    }//GEN-LAST:event_jspAzulStateChanged

    /*Procedimiento para cambiar el color del fondo*/
    private void establecerFondo(int colorRojo, int colorVerde, int colorAzul) {
        this.getContentPane().setBackground(new java.awt.Color(colorRojo, colorVerde, colorAzul)); //Establecer el color de fondo del JFrame por defecto
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
            java.util.logging.Logger.getLogger(Selector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */ 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selector().setVisible(true);
            }
        });
    }

    /*Inicio declaracion mis variables*/
    private int colorRojo, colorVerde, colorAzul; //Creamos las variables necesarias (R/G/B)
    /*Fin declaracion mis variables*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider jslRojo;
    private javax.swing.JSlider jslVerde;
    private javax.swing.JSpinner jspAzul;
    // End of variables declaration//GEN-END:variables

    
}
