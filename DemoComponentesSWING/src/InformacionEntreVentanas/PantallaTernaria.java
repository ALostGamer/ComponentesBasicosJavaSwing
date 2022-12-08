
package InformacionEntreVentanas; //Paquete de trabajo

/**
 *
 * @author mario
 * @version 1.0
 * @description Un programa para mover informacion entre dos pantallas (JFrame & JDialog)
 */
public class PantallaTernaria extends javax.swing.JDialog {

    /*Clase PantallaTernaria*/
    public PantallaTernaria(java.awt.Frame parent, boolean modal, String campoTexto) {
        super(parent, modal);
        initComponents();
        primaria = (PantallaPrincipal) parent; //Inicializacion de la pantalla primaria
        
        txtTextoPorEntrada.setText(campoTexto); //Cada vez que se inicia la ventana se escribe en el campo texto lo necesario para efectuar correctamente la modificacion del dato.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTextoPorEntrada = new javax.swing.JTextField();
        lblInformation = new javax.swing.JLabel();
        btnIrPrimaria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        txtTextoPorEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblInformation.setText("MODIFICAR DATOS");

        btnIrPrimaria.setText("Pantalla Principal");
        btnIrPrimaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrPrimariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTextoPorEntrada)
                    .addComponent(btnIrPrimaria, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInformation)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInformation)
                .addGap(37, 37, 37)
                .addComponent(txtTextoPorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnIrPrimaria)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIrPrimariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrPrimariaActionPerformed
        String texto = txtTextoPorEntrada.getText(); //Almacenamos el texto introducido
        primaria.setCampoTexto(texto); //Invocacion al metodo personalizado proporcionandole el texto almacenado

        this.dispose(); //Cerramos la ventana activa
        primaria.setVisible(true); //Abrimos la pantalla principal
    }//GEN-LAST:event_btnIrPrimariaActionPerformed

    /*Inicio declaracion mis variables*/
    PantallaPrincipal primaria; //Declaracion de la pantalla primaria
    /*Fin declaracion mis variables*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIrPrimaria;
    private javax.swing.JLabel lblInformation;
    private javax.swing.JTextField txtTextoPorEntrada;
    // End of variables declaration//GEN-END:variables
}
