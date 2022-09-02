package GUI;

import BaseDatos.Conexion;
import BaseDatos.SQLEmpleado;
import elmanjarcompleto.Mensajes;
import elmanjarcompleto.Tiempo;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InicioSesion extends javax.swing.JFrame {
    
    Mensajes m = new Mensajes();
    private int token = 0;
    
    public InicioSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelUser = new javax.swing.JTextField();
        labelPass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        labelUser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                labelUserKeyPressed(evt);
            }
        });

        labelPass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                labelPassKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login.png"))); // NOI18N
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogo.setToolTipText("");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/password.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N

        jButton2.setBackground(new java.awt.Color(204, 153, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(labelPass))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(labelUser))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        Salir();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        IniciarSesion();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void labelPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelPassKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_labelPassKeyPressed

    private void labelUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelUserKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_labelUserKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JPasswordField labelPass;
    private javax.swing.JTextField labelUser;
    // End of variables declaration//GEN-END:variables

    private void IniciarSesion(){
        String user = labelUser.getText();
        String pass = labelPass.getText();
        if(user.isEmpty() || pass.isEmpty()){
            m.alerta(this,"Incompleto", "Verifica que hayas colocado tu usuario y contraseña");
        }
        else {
            ResultSet res = null;
            Conexion con = new Conexion();
            SQLEmpleado se = new SQLEmpleado();
            Tiempo t = new Tiempo();
            try {
                con.Conectar();
                res = con.Consulta(se.VerificarEmpleado(user, pass));
                if (res.next()) {
                    String nombre = res.getString(2);
                    int puesto = res.getInt(5);
                    con.Cerrar();
                    if(puesto > 0) {
                        String hora = t.HoraAcceso();
                        RegistrarAcceso(user, hora);
                        Principal p = new Principal();
                        p.setLocationRelativeTo(null);
                        p.setVisible(true);
                        p.setDatos(user, nombre, puesto, token, hora);
                        this.dispose();
                    }
                    else{
                        m.error(this,"Error", "Verifica tu usuario y contraseña");
                    }
                } else {
                    m.error(this,"Error", "Verifica tu usuario y contraseña");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error01 >> "+e.getMessage());
            }finally{
                
            }
        }
    }
    
    public void RegistrarAcceso(String user, String hora){
        Conexion con = new Conexion();
        SQLEmpleado se = new SQLEmpleado();
        ResultSet res = null;
        try{
            con.Conectar();
            con.Modificar(se.RegistrarAcceso(user, hora));
            con.Cerrar();
            con.Conectar();
            res = con.Consulta(se.ObtenerToken(user));
            if(res.next()){
                token = res.getInt(1);
            }
            con.Cerrar();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Error02 >> "+e.getMessage());
        }
    }
    
    private void Salir(){
        System.exit(0);
    }
    
    public void ImagenEscalada(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/logo.png"));
        Image escala = icon.getImage().getScaledInstance(labelLogo.getWidth(), labelLogo.getHeight(), Image.SCALE_SMOOTH);
        Icon res = new ImageIcon(escala);
        labelLogo.setIcon(res);
    }    
    
    private void Eventos(KeyEvent evt){
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            IniciarSesion();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            Salir();
        }
    }
      
    
}
