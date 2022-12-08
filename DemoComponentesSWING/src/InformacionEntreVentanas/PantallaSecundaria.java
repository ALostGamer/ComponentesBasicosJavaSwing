
package InformacionEntreVentanas; //Paquete de trabajo

/**
 *
 * @author mario
 * @version 1.0
 * @description Un programa para mover informacion entre dos pantallas (JFrame & JDialog)
 */
public class PantallaSecundaria extends javax.swing.JDialog {

    /*Clase PantallaSecundaria*/
    public PantallaSecundaria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        primaria = (PantallaPrincipal) parent; //Inicializacion de la pantalla primaria
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTextoPorEntrada = new javax.swing.JTextField();
        btnIrPrimaria = new javax.swing.JButton();
        lblInformation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        txtTextoPorEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnIrPrimaria.setText("Pantalla Principal");
        btnIrPrimaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrPrimariaActionPerformed(evt);
            }
        });

        lblInformation.setText("INTRODUCIR DATOS");

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

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        txtTextoPorEntrada.setText(""); //Cada vez que se abra la ventan se vacia el contenido del campo texto
    }//GEN-LAST:event_formComponentShown

    /*Inicio declaracion mis variables*/
    PantallaPrincipal primaria; //Declaracion de la pantalla primaria
    /*Fin declaracion mis variables*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIrPrimaria;
    private javax.swing.JLabel lblInformation;
    private javax.swing.JTextField txtTextoPorEntrada;
    // End of variables declaration//GEN-END:variables
}
