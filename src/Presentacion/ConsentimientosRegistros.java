/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import AccesoDatos.OpConsentimientos;
import java.awt.Image;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Esta clase permite pintar la ventana para la búsqueda de registros de los Consentimientos
 * @author Cristian A. Hoyos Jaramillo
 * @author Daniela Estrada Monsalve
 * @author Yeisson A. Ochoa Villa
 */
public class ConsentimientosRegistros extends javax.swing.JFrame {
    DefaultTableModel dtm;
    Map<String, String> p;

    public ConsentimientosRegistros() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/agreement-icon.png")).getImage());

        dtm = (DefaultTableModel) Registros.getModel();
        if(dtm.getRowCount()!=0){
            for (int i = 0; i < dtm.getRowCount(); i++) {
                dtm.removeRow(i);
                i-=1;
            }
        }
        try{
            ArrayList <Object[]> l = OpConsentimientos.obtenerRegistros();
            for (int i = 0; i < l.size(); i++) {
                dtm.addRow(l.get(i));
            }
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Registros = new javax.swing.JTable();
        labelFecha = new javax.swing.JLabel();
        FechaConsentimiento = new com.toedter.calendar.JDateChooser();
        labelDoc = new javax.swing.JLabel();
        btnDetalles = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtDocPac = new java.awt.TextField();
        btnBusqueda = new javax.swing.JButton();
        jcPaciente = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(930, 570));
        setResizable(false);
        getContentPane().setLayout(null);

        Registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Fecha", "Historia Clínica", "Paciente", "Profesional"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RegistrosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(Registros);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 250, 900, 280);

        labelFecha.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelFecha.setText("Fecha:");
        getContentPane().add(labelFecha);
        labelFecha.setBounds(20, 100, 50, 15);

        FechaConsentimiento.setDateFormatString("dd-MM-yyyy");
        FechaConsentimiento.setName("FechaConsentimiento"); // NOI18N
        getContentPane().add(FechaConsentimiento);
        FechaConsentimiento.setBounds(80, 100, 181, 22);

        labelDoc.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelDoc.setText("Documento Paciente:");
        getContentPane().add(labelDoc);
        labelDoc.setBounds(311, 100, 140, 15);

        btnDetalles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/more-details-icon.png"))); // NOI18N
        btnDetalles.setText("Ver detalles");
        btnDetalles.setEnabled(false);
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });
        getContentPane().add(btnDetalles);
        btnDetalles.setBounds(280, 170, 140, 34);

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actions-edit-clear-icon.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(450, 170, 137, 34);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(120, 170, 125, 34);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Log-Out-icon.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(620, 170, 137, 34);

        txtDocPac.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtDocPac);
        txtDocPac.setBounds(460, 100, 170, 19);

        btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        btnBusqueda.setToolTipText("La búsqueda se  puede generar a partir de los primeros números del documento");
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBusqueda);
        btnBusqueda.setBounds(640, 90, 50, 30);

        jcPaciente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));
        getContentPane().add(jcPaciente);
        jcPaciente.setBounds(700, 100, 210, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 930, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Carga la información de un consentimiento en el formulario correspondiente, y además deshabilita el botón Crear
     * y habilita el botón Imprimir
     * @param evt 
     */
    private void btnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesActionPerformed
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            String codigo = Registros.getValueAt(Registros.getSelectedRow(), 0).toString();
            String fecha = Registros.getValueAt(Registros.getSelectedRow(), 1).toString();
            String hc = Registros.getValueAt(Registros.getSelectedRow(), 2).toString();
            String paciente = Registros.getValueAt(Registros.getSelectedRow(), 3).toString();
            String profesional = Registros.getValueAt(Registros.getSelectedRow(), 4).toString();
            Consentimientos.jcPaciente.addItem(paciente);
            Consentimientos.jcPaciente.setSelectedItem(paciente);
            Consentimientos.jcProfesional.addItem(profesional);
            Consentimientos.jcProfesional.setSelectedItem(profesional);
            OpConsentimientos.buscar(codigo);
            Consentimientos.txtNHC.setEnabled(false);
            Consentimientos.txtNHC.setText(hc);
            Consentimientos.txtNConsentimiento.setEnabled(false);
            Consentimientos.txtNConsentimiento.setText(codigo);
            Consentimientos.FechaConsentimiento.setEnabled(false);
            Consentimientos.FechaConsentimiento.setDate(formatoFecha.parse(fecha));
            Consentimientos.jcPaciente.setEnabled(false);
            Consentimientos.jcProfesional.setEnabled(false);
            ImageIcon fot = new ImageIcon(OpConsentimientos.getAdjunto());
            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Consentimientos.jlabelImagen.getWidth(), Consentimientos.jlabelImagen.getHeight(), Image.SCALE_SMOOTH));
            Consentimientos.jlabelImagen.setIcon(icono);
            OpConsentimientos.setFecha("");
            OpConsentimientos.setIdHistoriaClinica("");
            OpConsentimientos.setCodigo("");
            OpConsentimientos.setIdProfesional("");
            
            Consentimientos.txtDocPac.setEnabled(false);
            Consentimientos.btnBusquedaPac.setEnabled(false);
            Consentimientos.txtDocProf.setEnabled(false);
            Consentimientos.btnBusquedaProf.setEnabled(false);
            Consentimientos.btnCrearConsentimientos.setEnabled(false);
            Consentimientos.btnCargarAdjunto.setEnabled(false);
            Consentimientos.btnImprimir.setEnabled(true);
            this.setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(ProfesionalesRegistros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDetallesActionPerformed

    /**
     * Limpia todos los campos y restaura los datos de la tabla en caso de haberse hecho una consulta.
     * @param evt 
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        FechaConsentimiento.setDate(null);
        jcPaciente.removeAllItems();
        jcPaciente.addItem("Seleccione");
        txtDocPac.setText("");
        btnDetalles.setEnabled(false);
        if(dtm.getRowCount()!=0){
            for (int i = 0; i < dtm.getRowCount(); i++) {
                dtm.removeRow(i);
                i-=1;
            }
        }
        try{
            ArrayList <Object[]> l = OpConsentimientos.obtenerRegistros();
            for (int i = 0; i < l.size(); i++) {
                dtm.addRow(l.get(i));
            }
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * Habilita el botón Ver detalles en caso de que se seleccione algún registro en la tabla.
     * @param evt 
     */
    private void RegistrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrosMousePressed
        btnDetalles.setEnabled(true);
    }//GEN-LAST:event_RegistrosMousePressed

    /**
     * Llama al método buscar.
     * @param evt 
     */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * Cierra la ventana de registros.
     * @param evt 
     */
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.hide();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * Búsqueda de los pacientes coincidentes según un carácter ingresado
     * @param evt 
     */
    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        if(txtDocPac.getText() == null || txtDocPac.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe ingresar por lo menos un carácter del número de identificación del paciente", "Gestión Asdesilla", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                jcPaciente.removeAllItems();
                p = OpConsentimientos.consultarPacientes(txtDocPac.getText());
                Iterator it = p.keySet().iterator();
                if (p.size()>0) {
                    //JOptionPane.showMessageDialog(null, "Se han encontrado coincidencias");
                }else{
                    //JOptionPane.showMessageDialog(null, "No se han encontrado coincidencias");
                }
                jcPaciente.addItem("Seleccione");
                while(it.hasNext()){
                    jcPaciente.addItem(p.get(it.next()));
                }
                //txtDocPac.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(PacientesRegistros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnBusquedaActionPerformed

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsentimientosRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsentimientosRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsentimientosRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsentimientosRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsentimientosRegistros().setVisible(true);
            }
        });
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaConsentimiento;
    private javax.swing.JTable Registros;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnDetalles;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JComboBox jcPaciente;
    private javax.swing.JLabel labelDoc;
    private javax.swing.JLabel labelFecha;
    public static java.awt.TextField txtDocPac;
    // End of variables declaration//GEN-END:variables
    /**
     * Método que permite buscar un registro de un consentimiento de acuerdo a la fecha y/o número de identificación digitada
     * y muestra la información obtenida en la tabla de registros.
     */
    public void buscar() {
        String id, diaFecha, mesFecha, annoFecha, fecha;
        fecha = "";
        id = null;
        ArrayList <Object[]> l;
        if(FechaConsentimiento.getDate() != null){
            diaFecha = String.valueOf(FechaConsentimiento.getCalendar().get(Calendar.DAY_OF_MONTH));
            mesFecha = String.valueOf(FechaConsentimiento.getCalendar().get(Calendar.MONTH) + 1);
            annoFecha = String.valueOf(FechaConsentimiento.getCalendar().get(Calendar.YEAR));
            fecha = diaFecha + "/" + mesFecha + "/" + annoFecha;
        }else{
            fecha = null;
        }
        if (!jcPaciente.getSelectedItem().equals("Seleccione")) {
            for (Map.Entry<String, String> pacientes : p.entrySet()){
                String u = pacientes.getKey();
                if (jcPaciente.getSelectedItem().toString().equals(pacientes.getValue())) {
                    id = u;
                }
            }
        }
        
        if(fecha == null && id == null){
            JOptionPane.showMessageDialog(null, "Debe diligenciar una fecha o un número de identificación a buscar", "Gestión Asdesilla", JOptionPane.ERROR_MESSAGE);
        }else{
            l = OpConsentimientos.buscarRegistros(fecha, id);
            if(l.size()>0){
                btnDetalles.setEnabled(false);
                if(dtm.getRowCount()!=0){
                    for (int i = 0; i < dtm.getRowCount(); i++) {
                        dtm.removeRow(i);
                        i-=1;
                    }
                }
                try{
                    for (int i = 0; i < l.size(); i++) {
                        dtm.addRow(l.get(i));
                    }
                }catch(Exception e){
                    System.out.println("Error: "+e);
                }
            }
        }
    }
}
