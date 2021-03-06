/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import AccesoDatos.OpProfesionales;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Esta clase permite pintar la ventana para la búsqueda de los registros de Profesionales
 * @author Cristian A. Hoyos Jaramillo
 * @author Daniela Estrada Monsalve
 * @author Yeisson A. Ochoa Villa
 */
public class ProfesionalesRegistros extends javax.swing.JFrame {
    DefaultTableModel dtm;
    Map<String, String> p;

    public ProfesionalesRegistros() {
        initComponents();
        setIconImage (new ImageIcon(getClass().getResource("/Imagenes/professional-icon.png")).getImage());
        
        dtm = (DefaultTableModel) Registros.getModel();
        if(dtm.getRowCount()!=0){
            for (int i = 0; i < dtm.getRowCount(); i++) {
                dtm.removeRow(i);
                i-=1;
            }
        }
        try{
            ArrayList <Object[]> l = OpProfesionales.obtenerRegistros();
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
        jcProfesional = new javax.swing.JComboBox();
        labelNReg = new javax.swing.JLabel();
        btnBusqueda = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnDetalles = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtDocProf = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(847, 570));
        setResizable(false);
        getContentPane().setLayout(null);

        Registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número de Registro", "Identificación", "Nombre", "Primer Apellido", "Segundo Apellido", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        jScrollPane2.setBounds(10, 250, 820, 280);

        jcProfesional.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));
        getContentPane().add(jcProfesional);
        jcProfesional.setBounds(490, 100, 200, 27);

        labelNReg.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelNReg.setText("Documento Profesional:");
        getContentPane().add(labelNReg);
        labelNReg.setBounds(100, 100, 130, 15);

        btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        btnBusqueda.setToolTipText("La búsqueda se  puede generar a partir de los primeros números del documento");
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBusqueda);
        btnBusqueda.setBounds(430, 90, 50, 30);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(30, 170, 125, 34);

        btnDetalles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/more-details-icon.png"))); // NOI18N
        btnDetalles.setText("Ver detalles");
        btnDetalles.setEnabled(false);
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });
        getContentPane().add(btnDetalles);
        btnDetalles.setBounds(170, 170, 140, 34);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disable-icon.png"))); // NOI18N
        btnEliminar.setText("Deshabilitar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(330, 170, 140, 34);

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actions-edit-clear-icon.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(500, 170, 137, 34);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Log-Out-icon.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(670, 170, 137, 34);
        getContentPane().add(txtDocProf);
        txtDocProf.setBounds(250, 100, 170, 19);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 850, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Habilita el botón Ver detalles en caso de que se seleccione algún registro en la tabla.
     * @param evt 
     */
    private void RegistrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrosMousePressed
        btnDetalles.setEnabled(true);
        btnEliminar.setEnabled(true);
        String estado = Registros.getValueAt(Registros.getSelectedRow(), 5).toString();
        if (estado.equals("Activo")) {
            btnEliminar.setText("Deshabilitar");
            btnEliminar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/disable-icon.png")));
        }else{
            btnEliminar.setText("Habilitar");
            btnEliminar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/enable-icon.png")));
        }
    }//GEN-LAST:event_RegistrosMousePressed

    /**
     * Búsqueda de los profesionales coincidentes según un carácter ingresado
     * @param evt 
     */
    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        if(txtDocProf.getText() == null || txtDocProf.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe ingresar por lo menos un carácter del número de identificación del profesional", "Gestión Asdesilla", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                jcProfesional.removeAllItems();
                p = OpProfesionales.obtenerProfesionales(txtDocProf.getText());
                Iterator it = p.keySet().iterator();
                if (p.size()>0) {
                    //JOptionPane.showMessageDialog(null, "Se han encontrado coincidencias");
                }else{
                    //JOptionPane.showMessageDialog(null, "No se han encontrado coincidencias");
                }
                jcProfesional.addItem("Seleccione");
                while(it.hasNext()){
                    jcProfesional.addItem(p.get(it.next()));
                }
                //txtDocProf.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(ProfesionalesRegistros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnBusquedaActionPerformed
    /**
     * Llama al método buscar
     * @param evt 
     */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed
    /**
     * Obtiene la información del profesional de acuerdo a los datos de la tabla
     * y los asigna al formulario, además deshabilita el botón Crear
     * y habilita el botón modificar
     * @param evt 
     */
    private void btnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesActionPerformed
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            String numRegistro = Registros.getValueAt(Registros.getSelectedRow(), 0).toString();
            String identificacion = Registros.getValueAt(Registros.getSelectedRow(), 1).toString();
            
            OpProfesionales.buscar(numRegistro);
            Profesionales.txtNRegistro.enable(false);
            Profesionales.txtNRegistro.setText(numRegistro);
            Profesionales.txtNdoc.enable(false);
            Profesionales.txtNdoc.setText(identificacion);
            
            if (OpProfesionales.getEstado().equals("Activo")) {
                TreeMap<Integer, String> t = OpProfesionales.obtenerTipoDoc();
                for (Map.Entry<Integer, String> tipoDocs : t.entrySet()){
                    if (Integer.parseInt(OpProfesionales.getTipoId()) == tipoDocs.getKey()) {
                        Profesionales.jcTipoDoc.setEnabled(true);
                        Profesionales.jcTipoDoc.setSelectedItem(tipoDocs.getValue());
                    }
                }
                Profesionales.txtNombre.setEnabled(true);
                Profesionales.txtNombre.setText(OpProfesionales.getNombre());
                Profesionales.txtApellido1.setEnabled(true);
                Profesionales.txtApellido1.setText(OpProfesionales.getApellido1());
                Profesionales.txtApellido2.setEnabled(true);
                Profesionales.txtApellido2.setText(OpProfesionales.getApellido2());
                Profesionales.FechaN.setEnabled(true);
                Profesionales.FechaN.setDate(formatoFecha.parse(OpProfesionales.getFechaNacimiento()));
                
                TreeMap<Integer, String> g = OpProfesionales.obtenerGeneros();
                for (Map.Entry<Integer, String> generos : g.entrySet()){
                    if (Integer.parseInt(OpProfesionales.getGenero()) == generos.getKey()) {
                        Profesionales.jcGenero.setEnabled(true);
                        Profesionales.jcGenero.setSelectedItem(generos.getValue());
                    }
                }
                
                TreeMap<Integer, String> d = OpProfesionales.obtenerDepartamentos();
                for (Map.Entry<Integer, String> dep : d.entrySet()){
                    if (Integer.parseInt(OpProfesionales.getDepartamento()) == dep.getKey()) {
                        Profesionales.jcDepartamento.setEnabled(true);
                        Profesionales.jcDepartamento.setSelectedItem(dep.getValue());
                    }
                }
                
                TreeMap<Integer, String> m = OpProfesionales.obtenerMunicipios(OpProfesionales.getDepartamento());
                for (Map.Entry<Integer, String> mun : m.entrySet()){
                    if (Integer.parseInt(OpProfesionales.getMunicipio()) == mun.getKey()) {
                        Profesionales.jcMunicipio.setEnabled(true);
                        Profesionales.jcMunicipio.setSelectedItem(mun.getValue());
                    }
                }
                
                Profesionales.txtBarrio.setEnabled(true);
                Profesionales.txtBarrio.setText(OpProfesionales.getBarrio());
                Profesionales.txtDRes.setEnabled(true);
                Profesionales.txtDRes.setText(OpProfesionales.getDireccion());
                Profesionales.txtTelefono.setEnabled(true);
                Profesionales.txtTelefono.setText(OpProfesionales.getTelefono());
                Profesionales.txtCelular.setEnabled(true);
                Profesionales.txtCelular.setText(OpProfesionales.getCelular());
                
                TreeMap<Integer, String> o = OpProfesionales.obtenerCargos();
                for (Map.Entry<Integer, String> oc : o.entrySet()){
                    if (Integer.parseInt(OpProfesionales.getOcupacion()) == oc.getKey()) {
                        Profesionales.jcCargo.setEnabled(true);
                        Profesionales.jcCargo.setSelectedItem(oc.getValue());
                    }
                }
                
                TreeMap<Integer, String> h = OpProfesionales.obtenerHorarioLaboral();
                for (Map.Entry<Integer, String> hl : h.entrySet()){
                    if (Integer.parseInt(OpProfesionales.getHorarioLaboral()) == hl.getKey()) {
                        Profesionales.jcHLaboral.setSelectedItem(hl.getValue());
                        Profesionales.jcHLaboral.setEnabled(true);
                    }
                }
                Profesionales.btnModificar.setEnabled(true);
                Profesionales.btnEliminar.setEnabled(true);
                Profesionales.btnEliminar.setText("Deshabilitar");
                Profesionales.btnEliminar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/disable-icon.png")));
            }else{
                TreeMap<Integer, String> t = OpProfesionales.obtenerTipoDoc();
                for (Map.Entry<Integer, String> tipoDocs : t.entrySet()){
                    if (Integer.parseInt(OpProfesionales.getTipoId()) == tipoDocs.getKey()) {
                        Profesionales.jcTipoDoc.setEnabled(false);
                        Profesionales.jcTipoDoc.setSelectedItem(tipoDocs.getValue());
                    }
                }
                Profesionales.txtNombre.setEnabled(false);
                Profesionales.txtNombre.setText(OpProfesionales.getNombre());
                Profesionales.txtApellido1.setEnabled(false);
                Profesionales.txtApellido1.setText(OpProfesionales.getApellido1());
                Profesionales.txtApellido2.setEnabled(false);
                Profesionales.txtApellido2.setText(OpProfesionales.getApellido2());
                Profesionales.FechaN.setEnabled(false);
                Profesionales.FechaN.setDate(formatoFecha.parse(OpProfesionales.getFechaNacimiento()));
                
                TreeMap<Integer, String> g = OpProfesionales.obtenerGeneros();
                for (Map.Entry<Integer, String> generos : g.entrySet()){
                    if (Integer.parseInt(OpProfesionales.getGenero()) == generos.getKey()) {
                        Profesionales.jcGenero.setEnabled(false);
                        Profesionales.jcGenero.setSelectedItem(generos.getValue());
                    }
                }
                
                TreeMap<Integer, String> d = OpProfesionales.obtenerDepartamentos();
                for (Map.Entry<Integer, String> dep : d.entrySet()){
                    if (Integer.parseInt(OpProfesionales.getDepartamento()) == dep.getKey()) {
                        Profesionales.jcDepartamento.setEnabled(false);
                        Profesionales.jcDepartamento.setSelectedItem(dep.getValue());
                    }
                }
                
                TreeMap<Integer, String> m = OpProfesionales.obtenerMunicipios(OpProfesionales.getDepartamento());
                for (Map.Entry<Integer, String> mun : m.entrySet()){
                    if (Integer.parseInt(OpProfesionales.getMunicipio()) == mun.getKey()) {
                        Profesionales.jcMunicipio.setEnabled(false);
                        Profesionales.jcMunicipio.setSelectedItem(mun.getValue());
                    }
                }
                
                Profesionales.txtBarrio.setEnabled(false);
                Profesionales.txtBarrio.setText(OpProfesionales.getBarrio());
                Profesionales.txtDRes.setEnabled(false);
                Profesionales.txtDRes.setText(OpProfesionales.getDireccion());
                Profesionales.txtTelefono.setEnabled(false);
                Profesionales.txtTelefono.setText(OpProfesionales.getTelefono());
                Profesionales.txtCelular.setEnabled(false);
                Profesionales.txtCelular.setText(OpProfesionales.getCelular());
                
                TreeMap<Integer, String> o = OpProfesionales.obtenerCargos();
                for (Map.Entry<Integer, String> oc : o.entrySet()){
                    if (Integer.parseInt(OpProfesionales.getOcupacion()) == oc.getKey()) {
                        Profesionales.jcCargo.setEnabled(false);
                        Profesionales.jcCargo.setSelectedItem(oc.getValue());
                    }
                }
                
                TreeMap<Integer, String> h = OpProfesionales.obtenerHorarioLaboral();
                for (Map.Entry<Integer, String> hl : h.entrySet()){
                    if (Integer.parseInt(OpProfesionales.getHorarioLaboral()) == hl.getKey()) {
                        Profesionales.jcHLaboral.setEnabled(false);
                        Profesionales.jcHLaboral.setSelectedItem(hl.getValue());
                    }
                }
                Profesionales.btnModificar.setEnabled(false);
                Profesionales.btnEliminar.setEnabled(true);
                Profesionales.btnEliminar.setText("Habilitar");
                Profesionales.btnEliminar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/enable-icon.png")));
            }
            OpProfesionales.setNumRegistro("");
            OpProfesionales.setId("");
            OpProfesionales.setTipoId("");
            OpProfesionales.setNombre("");
            OpProfesionales.setApellido1("");
            OpProfesionales.setApellido2("");
            OpProfesionales.setFechaNacimiento("");
            OpProfesionales.setGenero("");
            OpProfesionales.setDepartamento("");
            OpProfesionales.setMunicipio("");
            OpProfesionales.setBarrio("");
            OpProfesionales.setDireccion("");
            OpProfesionales.setTelefono("");
            OpProfesionales.setCelular("");
            OpProfesionales.setOcupacion("");
            OpProfesionales.setHorarioLaboral("");
            OpProfesionales.setEstado("");
            Profesionales.btnCrear.setEnabled(false);
            this.setVisible(false);
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(ProfesionalesRegistros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDetallesActionPerformed
    /**
     * Llama al método cambiarEstado
     * @param evt 
     */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        cambiarEstado();
    }//GEN-LAST:event_btnEliminarActionPerformed
    /**
     * Limpia los campos del formulario, asignandoles el valor por defecto
     * @param evt 
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        jcProfesional.removeAllItems();
        jcProfesional.addItem("Seleccione");
        txtDocProf.setText("");
        btnDetalles.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnEliminar.setText("Deshabilitar");
        btnEliminar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/disable-icon.png")));
        if(dtm.getRowCount()!=0){
            for (int i = 0; i < dtm.getRowCount(); i++) {
                dtm.removeRow(i);
                i-=1;
            }
        }
        try{
            ArrayList <Object[]> l = OpProfesionales.obtenerRegistros();
            for (int i = 0; i < l.size(); i++) {
                dtm.addRow(l.get(i));
            }
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed
    /**
     * Cierra la ventana de registros.
     * @param evt 
     */
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.hide();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(ProfesionalesRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfesionalesRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfesionalesRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfesionalesRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfesionalesRegistros().setVisible(true);
            }
        });
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Registros;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnDetalles;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jcProfesional;
    private javax.swing.JLabel labelNReg;
    private java.awt.TextField txtDocProf;
    // End of variables declaration//GEN-END:variables
    /**
     * Método que permite buscar un registro de un profesional de acuerdo al número de identificación digitado
     * y muestra la información obtenida en la tabla de registros.
     */
    public void buscar() {
        String id;
        ArrayList <Object[]> l;
        id = null;
        
        if (!"Seleccione".equals(jcProfesional.getSelectedItem().toString())) {
            for (Map.Entry<String, String> profesionales : p.entrySet()){
                String u = profesionales.getKey();
                if (jcProfesional.getSelectedItem().toString().equals(profesionales.getValue())) {
                    id = u;
                }
            }
        }
        
        if(id == null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un profesional a buscar", "Gestión Asdesilla", JOptionPane.ERROR_MESSAGE);
        }else{
            l = OpProfesionales.buscarRegistros(id);
            if(l.size()>0){
                btnDetalles.setEnabled(false);
                btnEliminar.setEnabled(false);
                btnEliminar.setText("Deshabilitar");
                btnEliminar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/disable-icon.png")));
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
    
    /**
     * Método que permite cambiar el estado de un registro de profesional
     */
    public void cambiarEstado() {
        String identificacion = Registros.getValueAt(Registros.getSelectedRow(), 0).toString();
        if (identificacion == null || identificacion.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe diligenciar el campo número de documento del profesional a cambiar el estado", "Gestión Asdesilla", JOptionPane.ERROR_MESSAGE);
        }

        if (!identificacion.trim().isEmpty()) {
            JOptionPane x = new JOptionPane();
            if(x.showConfirmDialog(null,"Está seguro que desea cambiar el estado de este registro?")==0){
                OpProfesionales.cambiarEstado(identificacion);
                jcProfesional.removeAllItems();
                jcProfesional.addItem("Seleccione");
                btnDetalles.setEnabled(false);
                btnEliminar.setEnabled(false);
                btnEliminar.setText("Deshabilitar");
                btnEliminar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/disable-icon.png")));
                int k = 0;
                if(dtm.getRowCount()!=0){
                    for (int i = 0; i < dtm.getRowCount(); i++) {
                        dtm.removeRow(i);
                        i-=1;
                    }
                }
                try{
                    ArrayList <Object[]> l = OpProfesionales.obtenerRegistros();
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
