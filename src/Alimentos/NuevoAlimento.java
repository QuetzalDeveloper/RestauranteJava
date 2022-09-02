package Alimentos;

import BaseDatos.Conexion;
import BaseDatos.SQLAlimentos;
import elmanjarcompleto.Mensajes;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.sql.ResultSet;
import javax.swing.JTextField;

public class NuevoAlimento extends javax.swing.JDialog {
    
    Mensajes m = new Mensajes();
    private Boolean flag, menu = false;
    private String nombre;
    private int tipo;
    private double precio;
    private int id;
    

    public NuevoAlimento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LookAndFeel();
        LlenarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        textPrecio = new javax.swing.JTextField();
        checkMenu = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo alimento");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        textNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textDescripcionKeyPressed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alimento.png"))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/precio.png"))); // NOI18N

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cubiertos.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tipo");

        comboTipo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        comboTipo.setMaximumRowCount(15);
        comboTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textDescripcionKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textDescripcionKeyPressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textDescripcionKeyPressed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Precio");

        textPrecio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textDescripcionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textPrecioKeyTyped(evt);
            }
        });

        checkMenu.setBackground(new java.awt.Color(51, 51, 51));
        checkMenu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkMenu.setForeground(new java.awt.Color(255, 255, 255));
        checkMenu.setSelected(true);
        checkMenu.setText("Agregar al menú actual");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(comboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(textNombre)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(textPrecio)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(textNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(checkMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTipo))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Cerrar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPrecioKeyTyped
        EventoPrecio(evt, textPrecio);
    }//GEN-LAST:event_textPrecioKeyTyped

    private void textDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDescripcionKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textDescripcionKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ComprobarDatos();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkMenu;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPrecio;
    // End of variables declaration//GEN-END:variables

    private void Cerrar() {
        this.dispose();
    }

    private void EditarPlatillo(){
        SQLAlimentos sq = new SQLAlimentos();
        Conexion con = new Conexion();
        try{
            String sql = sq.EditarPlatillo(id,nombre,tipo,precio,menu);
            con.Conectar();
            con.Modificar(sql);
            con.Cerrar();
            m.alerta(this, "Modificado con éxito", "El platillo se ha editado satisfactoriamente");
            this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error NA 04 >> "+e.getMessage());
        }
    }
    
    private void GuardarPlatillo(){
        SQLAlimentos sq = new SQLAlimentos();
        Conexion con = new Conexion();
        try{
            
            String sql = sq.GuardarPlatillo(nombre,tipo,precio,menu);
            con.Conectar();
            con.Modificar(sql);
            con.Cerrar();
            m.alerta(this, "Guardado con éxito", "El platillo se ha almacenado satisfactoriamente");
            this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error NA 03 >> "+e.getMessage());
        }
    }
    
    private void ComprobarDatos() {
        nombre = textNombre.getText().trim();
        tipo = comboTipo.getSelectedIndex();
        precio = Double.parseDouble(textPrecio.getText().trim());
        if (nombre.isEmpty()) {
            m.error(this, "Datos incompletos", "Revisa que tengas el nombre y la descripción del platillo");
        } else if (tipo == 0) {
            m.error(this, "Asigna un tipo", "Asigna un tipo de alimento al platillo, esto ayudará a categorizarlo en el menú");
        } else if (precio <= 0.0) {
            m.error(this, "Error en el precio", "Revisa que el platillo tenga asignado un precio adecuado");
        } else {
            if (checkMenu.isSelected()) {
                menu = m.confirmar(this, "Agregar al menú", "El platillo se agregará al menú actual. ¿Seguro que deseas continuar?");
                if (menu) {
                    if (flag) {
                            GuardarPlatillo();
                    } else {
                            EditarPlatillo();
                    }
                }
            } else {
                if (flag) {
                    GuardarPlatillo();
                } else {
                    EditarPlatillo();
                }
            }
        }

    }
    
    private void LlenarCombo(){
        ResultSet res;
        String sql;
        try{
            comboTipo.addItem("Selecciona el tipo");
            Conexion con = new Conexion();
            SQLAlimentos sa = new SQLAlimentos();
            sql = sa.TodoTipoPlatillo();
            con.Conectar();
            res = con.Consulta(sql);
            while(res.next()){
                comboTipo.addItem(res.getString(2));
            }
            con.Cerrar();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Error NA 01 >> "+e.getMessage());
        }
    }
    
    public void setAccion(boolean flag){
        this.flag = flag;
    }
    
    public void setID(int id){
        SQLAlimentos sa = new SQLAlimentos();
        Conexion con = new Conexion();
        ResultSet res = null;
        this.id = id;
        int x;
        String sql = sa.ObtenerPlatilloId(this.id);
        try{
            con.Conectar();
            res = con.Consulta(sql);
            if(res.next()){
                textNombre.setText(res.getString(2));
                comboTipo.setSelectedIndex(res.getInt(3));
                textPrecio.setText(res.getDouble(4)+"");
                x = res.getInt(5);
                if(x==0){
                    checkMenu.setSelected(false);
                }else{
                    checkMenu.setSelected(true);
                }
            }
            con.Cerrar();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Error NA 04 >> "+e.getMessage());
        }        
    }
    
    private void LookAndFeel() {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(this);
            updateComponentTreeUI(this);
            this.getContentPane().setBackground(Color.WHITE);
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){}
    }
  
    private void EventoPrecio(KeyEvent evt, JTextField text) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c!= '.') {
            getToolkit().beep();
            evt.consume();

        }
    }
    
    private void Eventos(KeyEvent evt){
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            ComprobarDatos();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            Cerrar();
        }
    }

}
