package Empleados;

import BaseDatos.Conexion;
import BaseDatos.SQLEmpleado;
import elmanjarcompleto.Mensajes;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Empleado extends javax.swing.JFrame {
    
    Mensajes m = new Mensajes();
    private int conta = 0;
    

    public Empleado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textClave = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        comboPuesto = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empleados");
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboPuestoKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clave");

        textClave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textClave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textClaveFocusGained(evt);
            }
        });
        textClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboPuestoKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        textNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textNombreFocusGained(evt);
            }
        });
        textNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboPuestoKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Puesto");

        comboPuesto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboPuesto.setMaximumRowCount(15);
        comboPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Administrador", "Aseo", "Barista", "Bartender", "Cocinero", "Cajero", "Mesero" }));
        comboPuesto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboPuestoFocusLost(evt);
            }
        });
        comboPuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboPuestoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(textClave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(comboPuesto, 0, 664, Short.MAX_VALUE))
                .addGap(128, 128, 128)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textClave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jButton3.setBackground(new java.awt.Color(255, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboPuestoKeyPressed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 204, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevapersona.png"))); // NOI18N
        jButton4.setText("Nuevo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboPuestoKeyPressed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 102, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jButton5.setText("Editar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboPuestoKeyPressed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 102, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboPuestoKeyPressed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(102, 204, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login.png"))); // NOI18N
        jButton7.setText("Accesos");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboPuestoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        tabla.setBackground(new java.awt.Color(204, 204, 204));
        tabla.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave", "Nombre", "Telefono", "Correo", "Puesto", "Contraseña"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setRowHeight(35);
        tabla.setRowMargin(2);
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboPuestoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(320);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(250);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(5).setResizable(false);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Consulta();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Cerrar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        NuevoTrabajador();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        EditarTrabajador();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Eliminar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Accesos();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void textClaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textClaveFocusGained
        textNombre.setText(null);
        comboPuesto.setSelectedIndex(0);
    }//GEN-LAST:event_textClaveFocusGained

    private void textNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textNombreFocusGained
        textClave.setText(null);
        comboPuesto.setSelectedIndex(0);
    }//GEN-LAST:event_textNombreFocusGained

    private void comboPuestoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboPuestoFocusLost
        textNombre.setText(null);
        textClave.setText(null);
    }//GEN-LAST:event_comboPuestoFocusLost

    private void comboPuestoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboPuestoKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_comboPuestoKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboPuesto;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField textClave;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
    
    private void Accesos(){
        Accesos a = new Accesos(this, true);
        int fila = tabla.getSelectedRow();
        if(fila < 0){
            a.AccesosTodos();
        }
        else{
            String clave = tabla.getValueAt(fila, 0).toString();
            a.AccesosEmpleado(clave);
        }
        a.setLocationRelativeTo(null);
        a.setVisible(true);
    }
    
    private void Eliminar(){
        int fila = tabla.getSelectedRow();
        if(fila < 0){
            m.alerta(this, "Selecciona un empleado", "Debes seleccionar el empleado a eliminar de la tabla");
        }else{
            if(m.confirmar(this, "Eliminar empleado", "El acceso del empleado será eliminado, pero el registro continuará oculto para preservar el historial del negocio.")){
                Conexion con = new Conexion();
                SQLEmpleado se = new SQLEmpleado();
                String sql = se.OcultarEmpleado(tabla.getValueAt(fila, 0).toString());
                con.Conectar();
                con.Modificar(sql);
                con.Cerrar();
                m.alerta(this, "Empleado eliminado", "El empleado ha sido eliminado satisfactoriamente");
            }
        }
    }
    
    private void EditarTrabajador() {
        int fila = tabla.getSelectedRow();
        if (fila < 0) {
            m.alerta(this, "Selecciona un empleado", "Debes seleccionar el empleado a editar de la tabla");
        } else {
            NuevoEmpleado n = new NuevoEmpleado(this, true);
            n.setAccion(tabla.getValueAt(fila, 0).toString(),
                    tabla.getValueAt(fila, 1).toString(),
                    tabla.getValueAt(fila, 2).toString(),
                    tabla.getValueAt(fila, 3).toString(),
                    PuestoNumero(tabla.getValueAt(fila, 4).toString()),
                    tabla.getValueAt(fila, 5).toString());
            n.setLocationRelativeTo(null);
            n.setVisible(true);
        }
    }
    
    private int PuestoNumero(String p){
        int x = 0;
        if(p.equals("Administrador")){ x= 1; }
        else if(p.equals("Aseo")){ x=2; }
        else if(p.equals("Barista")){ x=3; }
        else if(p.equals("Bartender")){ x=4; }
        else if(p.equals("Cocinero")){ x=5; }
        else if(p.equals("Cajero")){ x=6; }
        else if(p.equals("Mesero")){ x=6; }
        else{
            x = 0;
        }
        return x;
    }
    
    private void NuevoTrabajador(){
        NuevoEmpleado n = new NuevoEmpleado(this,true);
        n.setAccion();
        n.setLocationRelativeTo(null);
        n.setVisible(true);
    }   
    
    public void Consulta(){
        SQLEmpleado se = new SQLEmpleado();
        String clave = textClave.getText();
        String nombre = textNombre.getText();
        int puesto = comboPuesto.getSelectedIndex();
        String sql="";
        if(clave.isEmpty() && nombre.isEmpty() && puesto <= 0){ //Todos
            sql = se.TodosEmpleados();
        }
        else if(!clave.isEmpty() && nombre.isEmpty() && puesto <= 0){   //Clave
            sql = se.EmpleadosClave(clave);
        }
        else if(clave.isEmpty() && !nombre.isEmpty() && puesto <= 0){ //Nombre
            sql = se.EmpleadosNombre(nombre);
        }
        else if(clave.isEmpty() && nombre.isEmpty() && puesto > 0){ //Puesto
            sql = se.EmpleadosPuesto(puesto);
        }
        else{
            sql = se.TodosEmpleados();
        }
        System.out.println(sql);
        LlenarTabla(sql);
    }
    
    
    private void LlenarTabla(String sql){
        Conexion con = new Conexion();
        ResultSet res;
        Object nf[] = {null,null,null,null,null,null};
        DefaultTableModel ntm = (DefaultTableModel) tabla.getModel();
        int p;
        for(int b = (conta -1); b >= 0; b--){
            ntm.removeRow(b);
        }
        conta = 0;
        try{
            con.Conectar();
            res = con.Consulta(sql);
            while(res.next()){
                p = res.getInt(5);
                if(p >= 0){
                    ntm.addRow(nf);
                    tabla.setValueAt(res.getString(1), conta, 0); //Clave
                    tabla.setValueAt(res.getString(2), conta, 1); //Nombre
                    tabla.setValueAt(res.getString(3), conta, 2); //Telefono
                    tabla.setValueAt(res.getString(4), conta, 3); //Correo
                    switch (p) { //Puesto
                        case 1:
                            tabla.setValueAt("Administrador(a)", conta, 4);
                            break;
                        case 2:
                            tabla.setValueAt("Aseo", conta, 4);
                            break;
                        case 3:
                            tabla.setValueAt("Barista", conta, 4);
                            break;
                        case 4:
                            tabla.setValueAt("Bartender", conta, 4);
                            break;
                        case 5:
                            tabla.setValueAt("Cocinero", conta, 4);
                            break;
                        case 6:
                            tabla.setValueAt("Cajer@", conta, 4);
                            break;
                        case 7:
                            tabla.setValueAt("Meser@", conta, 4);
                            break;
                        case 666:
                            tabla.setValueAt("Root", conta, 4);
                            break;
                        default:
                            tabla.setValueAt("Sin determinar", conta, 4);
                            break;
                    }
                    tabla.setValueAt(res.getString(6), conta, 5); //Contrasena
                    conta++;
                }
            }
            con.Cerrar();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Empleado01 >> "+e.getMessage());
        }
        
    }
    
    private void Cerrar(){
        this.dispose();
    }

    private void Eventos(KeyEvent evt){
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER:
                Consulta();
                break;
            case KeyEvent.VK_F1:
                NuevoTrabajador();
                break;
            case KeyEvent.VK_F2:
                EditarTrabajador();
                break;
            case KeyEvent.VK_DELETE:
                Eliminar();
                break;
            case KeyEvent.VK_F3:
                Accesos();
                break;
            case KeyEvent.VK_ESCAPE:
                Cerrar();
                break;
            default:
                break;
        }
    }
}
