
package JFileChooser; //Paquete de trabajo

//Importaciones necesarias
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author mario
 * @version 1.0
 * @description Un programa para elegir un fichero y mostrar su contenido dentro de un textArea
 */
public class Interfaz extends javax.swing.JFrame{ //Clase Principal

    /*Clase Interfaz*/
    public Interfaz(){
        initComponents();
        selectorDeArchivo = new JFileChooser(); //Inicializamos el JFileChooser creado
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Programas en .java", "java"); //Creamos un filtro de archivos
        selectorDeArchivo.setFileFilter(filtro); //Establecemos el filtro creado
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaOutput = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAgregarArchivo = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTextAreaOutput.setColumns(20);
        jTextAreaOutput.setRows(5);
        jScrollPane1.setViewportView(jTextAreaOutput);

        jMenuAgregarArchivo.setText("AgregarArchivo");
        jMenuAgregarArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuAgregarArchivoMousePressed(evt);
            }
        });
        jMenuBar1.add(jMenuAgregarArchivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAgregarArchivoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAgregarArchivoMousePressed
        int valor = selectorDeArchivo.showOpenDialog(this); //Almacenamos el tipo de boton pulsado
        
        switch (valor) { //El valor depende de...
            case (JFileChooser.APPROVE_OPTION): //Si pulsaste en agregar
                jTextAreaOutput.setText(""); //Establecemos el textArea a vacio
                File fichero = selectorDeArchivo.getSelectedFile(); //Guardamos el fichero seleccionado
                    String filePath = fichero.getPath(); //Guardamos la ruta del fichero
                    try {
                        BufferedReader lecturaLinea = new BufferedReader(new FileReader(filePath)); //Abrimos la lectura del fichero seleccionado
                        String textoPorLinea, textoParaArea; //Inicializamos una variable para leer linea a linea
                        
                        while ((textoPorLinea = lecturaLinea.readLine()) != null) { //Leemos linea a linea mientras haya texto
                            textoParaArea = textoPorLinea+"\n"; //Lo agregamos a una variable de tipo texto
                            //System.out.println(textoParaArea); //Mostramos por consola la informacion
                            jTextAreaOutput.insert(textoParaArea, jTextAreaOutput.getCaretPosition()); //Vamos insertando al final del textArea las lineas leidas
                        }
                        lecturaLinea.close(); //Cerramos la lectura una vez fue completada
                        
                    } catch (Exception eo) {
                        System.err.println(eo.getMessage()); //Por si sucede algun error
                    }
                break;
            case (JFileChooser.CANCEL_OPTION): //Si pulsaste en cancelar
                break;
            default: //Salida por defecto
        }
    }//GEN-LAST:event_jMenuAgregarArchivoMousePressed


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
    JFileChooser selectorDeArchivo; //Declaramos el JFileChooser
    /*Fin declaracion mis variables*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAgregarArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaOutput;
    // End of variables declaration//GEN-END:variables
}
