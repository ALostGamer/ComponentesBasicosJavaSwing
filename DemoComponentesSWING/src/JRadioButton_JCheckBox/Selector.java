
package JRadioButton_JCheckBox; //Paquete de trabajo

/**
 *
 * @author mario
 * @version 1.0
 * @description Un programa para probar las principales utilidades del RadioButton y el CheckBox
 */
public class Selector extends javax.swing.JFrame { //Clase Principal

    //Clase Selector
    public Selector() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBotones = new javax.swing.ButtonGroup();
        GrupoMundo = new javax.swing.ButtonGroup();
        rbtn1 = new javax.swing.JRadioButton();
        rbtn2 = new javax.swing.JRadioButton();
        rbtn3 = new javax.swing.JRadioButton();
        rbtnHolaMundo = new javax.swing.JRadioButton();
        rbtnAdiosMundo = new javax.swing.JRadioButton();
        chboxUnique = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GrupoBotones.add(rbtn1);
        rbtn1.setText("Boton_1");
        rbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn1ActionPerformed(evt);
            }
        });

        GrupoBotones.add(rbtn2);
        rbtn2.setText("Boton_2");
        rbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn2ActionPerformed(evt);
            }
        });

        GrupoBotones.add(rbtn3);
        rbtn3.setText("Boton_3");
        rbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn3ActionPerformed(evt);
            }
        });

        GrupoMundo.add(rbtnHolaMundo);
        rbtnHolaMundo.setText("HolaMundo");
        rbtnHolaMundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnHolaMundoActionPerformed(evt);
            }
        });

        GrupoMundo.add(rbtnAdiosMundo);
        rbtnAdiosMundo.setText("AdiosMundo");
        rbtnAdiosMundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAdiosMundoActionPerformed(evt);
            }
        });

        chboxUnique.setText("Casilla de Marcacion");
        chboxUnique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxUniqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtn1)
                            .addComponent(rbtn2)
                            .addComponent(rbtn3)
                            .addComponent(rbtnHolaMundo)
                            .addComponent(rbtnAdiosMundo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(chboxUnique)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtn1)
                .addGap(18, 18, 18)
                .addComponent(rbtn2)
                .addGap(18, 18, 18)
                .addComponent(rbtn3)
                .addGap(16, 16, 16)
                .addComponent(chboxUnique)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnHolaMundo)
                .addGap(18, 18, 18)
                .addComponent(rbtnAdiosMundo)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*En caso de seleccionar el RadioButton1 del grupo1*/
    private void rbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn1ActionPerformed
        Boolean selected = (rbtnHolaMundo.isSelected() || rbtnAdiosMundo.isSelected())?true:false; //Comprobacion si en el grupo2 hay alguno seleccionado
        System.out.println(":--------------------:");
        if (selected == true) { //En caso de haber alguno seleccinado...
        System.out.println("Has pulsado el boton: "+rbtn1.getText()); //Mensaje
        /*Comprobacion para cual de los RadioButton del grupo2 esta pulsado*/
            if (rbtnHolaMundo.isSelected()) {
                System.out.println("\tEsta seleccionado el boton: "+rbtnHolaMundo.getText()); //Mensaje
            }
            if (rbtnAdiosMundo.isSelected()) {
                System.out.println("\tEsta seleccionado el boton: "+rbtnAdiosMundo.getText()); //Mensaje
            }
        } else {
        System.out.println("Has pulsado el boton: "+rbtn1.getText()); //Mensaje
        }
        System.out.println(":--------------------:");
    }//GEN-LAST:event_rbtn1ActionPerformed

    /*En caso de seleccionar el RadioButton2 del grupo1*/
    private void rbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn2ActionPerformed
        Boolean selected = (rbtnHolaMundo.isSelected() || rbtnAdiosMundo.isSelected())?true:false; //Comprobacion si en el grupo2 hay alguno seleccionado
        System.out.println(":--------------------:");
        if (selected == true) { //En caso de haber alguno seleccinado...
        System.out.println("Has pulsado el boton: "+rbtn2.getText()); //Mensaje
        /*Comprobacion para cual de los RadioButton del grupo2 esta pulsado*/
            if (rbtnHolaMundo.isSelected()) {
                System.out.println("\tEsta seleccionado el boton: "+rbtnHolaMundo.getText()); //Mensaje
            }
            if (rbtnAdiosMundo.isSelected()) {
                System.out.println("\tEsta seleccionado el boton: "+rbtnAdiosMundo.getText()); //Mensaje
            }
        } else {
        System.out.println("Has pulsado el boton: "+rbtn2.getText()); //Mensaje
        }
        System.out.println(":--------------------:");
    }//GEN-LAST:event_rbtn2ActionPerformed

    /*En caso de seleccionar el RadioButton3 del grupo1*/
    private void rbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn3ActionPerformed
        Boolean selected = (rbtnHolaMundo.isSelected() || rbtnAdiosMundo.isSelected())?true:false; //Comprobacion si en el grupo2 hay alguno seleccionado
        System.out.println(":--------------------:");
        if (selected == true) { //En caso de haber alguno seleccinado...
        System.out.println("Has pulsado el boton: "+rbtn3.getText()); //Mensaje
        /*Comprobacion para cual de los RadioButton del grupo2 esta pulsado*/
            if (rbtnHolaMundo.isSelected()) {
                System.out.println("\tEsta seleccionado el boton: "+rbtnHolaMundo.getText()); //Mensaje
            }
            if (rbtnAdiosMundo.isSelected()) {
                System.out.println("\tEsta seleccionado el boton: "+rbtnAdiosMundo.getText()); //Mensaje
            }
        } else {
        System.out.println("Has pulsado el boton: "+rbtn3.getText()); //Mensaje
        }
        System.out.println(":--------------------:");
    }//GEN-LAST:event_rbtn3ActionPerformed

    
    /*En caso de seleccionar el RadioButton1 del grupo2*/
    private void rbtnHolaMundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnHolaMundoActionPerformed
        Boolean selected = (rbtn1.isSelected() || rbtn2.isSelected() || rbtn3.isSelected())?true:false; //Comprobacion si en el grupo1 hay alguno seleccionado
        System.out.println(":--------------------:");
        if (selected == true) { //En caso de haber alguno seleccinado...
        System.out.println("Has pulsado el boton: "+rbtnHolaMundo.getText()); //Mensaje
        /*Comprobacion para cual de los RadioButton del grupo1 esta pulsado*/
            if (rbtn1.isSelected()) {
                System.out.println("\tEsta seleccionado el boton: "+rbtn1.getText()); //Mensaje
            }
            if (rbtn2.isSelected()) {
                System.out.println("\tEsta seleccionado el boton: "+rbtn2.getText()); //Mensaje
            }
            if (rbtn3.isSelected()) {
                System.out.println("\tEsta seleccionado el boton: "+rbtn3.getText()); //Mensaje
            }
        } else {
        System.out.println("Has pulsado el boton: "+rbtnHolaMundo.getText()); //Mensaje
        }
        System.out.println(":--------------------:");
    }//GEN-LAST:event_rbtnHolaMundoActionPerformed

    /*En caso de seleccionar el RadioButton2 del grupo2*/
    private void rbtnAdiosMundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAdiosMundoActionPerformed
        Boolean selected = (rbtn1.isSelected() || rbtn2.isSelected() || rbtn3.isSelected())?true:false; //Comprobacion si en el grupo1 hay alguno seleccionado
        System.out.println(":--------------------:");
        if (selected == true) { //En caso de haber alguno seleccinado...
        System.out.println("Has pulsado el boton: "+rbtnAdiosMundo.getText()); //Mensaje
        /*Comprobacion para cual de los RadioButton del grupo1 esta pulsado*/
            if (rbtn1.isSelected()) {
                System.out.println("\tEsta seleccionado el boton: "+rbtn1.getText()); //Mensaje
            }
            if (rbtn2.isSelected()) {
                System.out.println("\tEsta seleccionado el boton: "+rbtn2.getText()); //Mensaje
            }
            if (rbtn3.isSelected()) {
                System.out.println("\tEsta seleccionado el boton: "+rbtn3.getText()); //Mensaje
            }
        } else {
        System.out.println("Has pulsado el boton: "+rbtnAdiosMundo.getText()); //Mensaje
        }
        System.out.println(":--------------------:");
    }//GEN-LAST:event_rbtnAdiosMundoActionPerformed

    /*En caso de presionar el CheckBox*/
    private void chboxUniqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxUniqueActionPerformed
        System.out.println(":--------------------:");
        if (chboxUnique.isSelected()) { //En caso de estar marcada
            System.out.println("Casilla marcada"); //Mensaje
        } else { //En caso de no estar marcada
            System.out.println("Casilla desmarcada"); //Mensaje
        }
        System.out.println(":--------------------:");
    }//GEN-LAST:event_chboxUniqueActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoBotones;
    private javax.swing.ButtonGroup GrupoMundo;
    private javax.swing.JCheckBox chboxUnique;
    private javax.swing.JRadioButton rbtn1;
    private javax.swing.JRadioButton rbtn2;
    private javax.swing.JRadioButton rbtn3;
    private javax.swing.JRadioButton rbtnAdiosMundo;
    private javax.swing.JRadioButton rbtnHolaMundo;
    // End of variables declaration//GEN-END:variables
}
