
package JTable; //Paquete de trabajo

//Importaciones necesarias
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 * @version 1.0
 * @description Un programa para agregar y eliminar datos a un JTable
 */
public class Interfaz extends javax.swing.JFrame { //Clase Principal

    /*Clase Interfaz*/
    public Interfaz() {
        initComponents();
        
        jTableDatos.getTableHeader().setReorderingAllowed(false); //Funcion para evitar que el usuario pueda mover las columnas de la tabla.
        /*
        modelo = new DefaultTableModel(); //Inicializamos el modelo para el Table
            modelo.addColumn("Columna_1"); //Agregamos la primera columna
            modelo.addColumn("Columna_2"); //Agregamos la segunda columna
            modelo.addColumn("Columna_3"); //Agregamos la tercera columna
                jTableDatos.setModel(modelo); //Establecemos el modelo
        */
        modelo = (DefaultTableModel) jTableDatos.getModel(); //Recogemos el Table que se crea por defecto
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Campo_1", "Campo_2", "Campo_3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableDatos);
        if (jTableDatos.getColumnModel().getColumnCount() > 0) {
            jTableDatos.getColumnModel().getColumn(0).setResizable(false);
            jTableDatos.getColumnModel().getColumn(1).setResizable(false);
            jTableDatos.getColumnModel().getColumn(2).setResizable(false);
        }

        btnAgregar.setText("Añadir Datos");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar Datos");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        /*
        String salida = (String)JOptionPane.showInputDialog(this, "Completa la sentencia:\n" + "\"Hola...\"", "Un InputDialog por texto", JOptionPane.INFORMATION_MESSAGE); //Sacamos los datos por medio de un JOptionPane
            String fila[] = {salida, salida, salida}; //Declaramos un array con los datos
            modelo.addRow(fila); //Agregamos una fila extra al modelo con el array
        */
        String fila[] = {"Fila"+modelo.getRowCount()+"_1", "Fila"+modelo.getRowCount()+"_2", "Fila"+modelo.getRowCount()+"_3"}; //Declaramos un array con los datos a agregar
            modelo.addRow(fila); //Agregamos al modelo creado una lista de elementos
            jTableDatos.setModel(modelo); //Actualizamos la Table
    }//GEN-LAST:event_btnAgregarActionPerformed
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        for (int i = modelo.getRowCount()-1; i >= 0; i--) { //Bucle desde el final de la lista hasta el inicio
            modelo.removeRow(i); //Eliminamos del modelo creado los datos fila a fila
        }
        
            jTableDatos.setModel(modelo); //Actualizamos la Table
    }//GEN-LAST:event_btnEliminarActionPerformed

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
    DefaultTableModel modelo; //Declaramos el modelo para el ComboBox
    /*Fin declaracion mis variables*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDatos;
    // End of variables declaration//GEN-END:variables
}
