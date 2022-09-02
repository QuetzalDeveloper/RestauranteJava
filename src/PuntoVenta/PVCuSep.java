package PuntoVenta;

import BaseDatos.Conexion;
import BaseDatos.SQLVentas;
import elmanjarcompleto.Mensajes;
import elmanjarcompleto.Tiempo;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.print.attribute.standard.MediaPrintableArea;
import javax.print.attribute.standard.OrientationRequested;

public class PVCuSep extends javax.swing.JDialog {

    private int folio, conta = 0, conta2 = 0, persona = 1;
    private String cajero;
    private String mesero;
    private Double subtotal = 0.0, propina=0.0, descuento = 0.0, total = 0.0;
    private Double sepasubtotal =0.0, sepatotal = 0.0, propinatotal = 0.0, descuentototal = 0.0;
    private int estatus;
    private boolean estado;

    public PVCuSep(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public PVCuSep(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTotalTotal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelTotalSubtotal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelMesa = new javax.swing.JLabel();
        labelMesero = new javax.swing.JLabel();
        labelFolio = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        labelSubtotal = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        textPropina = new javax.swing.JTextField();
        textDescuento = new javax.swing.JTextField();
        botonPropina = new javax.swing.JButton();
        botonDescuento = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        labelPersona = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        labelEgreso = new javax.swing.JLabel();
        labelIngreso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        labelTotalTotal.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        labelTotalTotal.setForeground(new java.awt.Color(153, 0, 0));
        labelTotalTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTotalTotal.setText("$ 0.0");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Total:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Subtotal:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cuenta general");

        labelTotalSubtotal.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        labelTotalSubtotal.setForeground(new java.awt.Color(255, 255, 255));
        labelTotalSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTotalSubtotal.setText("$ 0.0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTotalTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTotalSubtotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTotalSubtotal)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTotalTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        labelMesa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelMesa.setForeground(new java.awt.Color(255, 255, 255));
        labelMesa.setText("Mesa: ");

        labelMesero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelMesero.setForeground(new java.awt.Color(255, 255, 255));
        labelMesero.setText("Mesero:");

        labelFolio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelFolio.setForeground(new java.awt.Color(255, 255, 255));
        labelFolio.setText("Folio:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFolio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMesero, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFolio)
                .addGap(18, 18, 18)
                .addComponent(labelMesa)
                .addGap(18, 18, 18)
                .addComponent(labelMesero)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Subtotal:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Total:");

        labelTotal.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(153, 0, 0));
        labelTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTotal.setText("$ 0.0");
        labelTotal.setToolTipText("");

        labelSubtotal.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        labelSubtotal.setForeground(new java.awt.Color(255, 255, 255));
        labelSubtotal.setText("$ 0.0");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Propina:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descuento:");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("$");

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("$");

        textPropina.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        textDescuento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        botonPropina.setBackground(new java.awt.Color(0, 153, 153));
        botonPropina.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonPropina.setForeground(new java.awt.Color(0, 0, 0));
        botonPropina.setText("Aplicar");
        botonPropina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPropinaActionPerformed(evt);
            }
        });

        botonDescuento.setBackground(new java.awt.Color(0, 153, 153));
        botonDescuento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonDescuento.setForeground(new java.awt.Color(0, 0, 0));
        botonDescuento.setText("Aplicar");
        botonDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDescuentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(textDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(textPropina, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonPropina, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPropina, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPropina, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        tabla.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Platillo", "Peticiones", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setRowHeight(30);
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(450);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(300);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Persona");

        labelPersona.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labelPersona.setForeground(new java.awt.Color(255, 255, 255));
        labelPersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPersona.setText("1");

        jButton2.setBackground(new java.awt.Color(51, 153, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/siguiente.png"))); // NOI18N
        jButton2.setText("Agregar");
        jButton2.setPreferredSize(new java.awt.Dimension(100, 44));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 102, 0));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anterior.png"))); // NOI18N
        jButton4.setText("Quitar");
        jButton4.setPreferredSize(new java.awt.Dimension(100, 44));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tabla2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tabla2.setForeground(new java.awt.Color(0, 0, 0));
        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Platillo", "Peticiones", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla2.setRowHeight(30);
        jScrollPane2.setViewportView(tabla2);
        if (tabla2.getColumnModel().getColumnCount() > 0) {
            tabla2.getColumnModel().getColumn(0).setResizable(false);
            tabla2.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabla2.getColumnModel().getColumn(1).setResizable(false);
            tabla2.getColumnModel().getColumn(1).setPreferredWidth(450);
            tabla2.getColumnModel().getColumn(2).setResizable(false);
            tabla2.getColumnModel().getColumn(2).setPreferredWidth(300);
            tabla2.getColumnModel().getColumn(3).setResizable(false);
            tabla2.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recibe.png"))); // NOI18N
        jButton3.setText("Ticket");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        labelEgreso.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelEgreso.setForeground(new java.awt.Color(255, 255, 255));
        labelEgreso.setText("Egreso:");

        labelIngreso.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelIngreso.setForeground(new java.awt.Color(255, 255, 255));
        labelIngreso.setText("Ingreso:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelEgreso)
                .addGap(19, 19, 19))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(labelIngreso)
                    .addContainerGap(80, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cerrar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ProcesarVenta();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AgregarPlatillo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        RegresarPlatillo();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void botonPropinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPropinaActionPerformed
        AgregarPropina();
    }//GEN-LAST:event_botonPropinaActionPerformed

    private void botonDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDescuentoActionPerformed
        AgregarDescuento();
    }//GEN-LAST:event_botonDescuentoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDescuento;
    private javax.swing.JButton botonPropina;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelEgreso;
    private javax.swing.JLabel labelFolio;
    private javax.swing.JLabel labelIngreso;
    private javax.swing.JLabel labelMesa;
    private javax.swing.JLabel labelMesero;
    private javax.swing.JLabel labelPersona;
    private javax.swing.JLabel labelSubtotal;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelTotalSubtotal;
    private javax.swing.JLabel labelTotalTotal;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField textDescuento;
    private javax.swing.JTextField textPropina;
    // End of variables declaration//GEN-END:variables
  
    public void TamañoPantalla() {
        this.setSize(1920, 1030);
    }
    
    private void SiguientePersona(){
        DefaultTableModel dtm = (DefaultTableModel) tabla2.getModel();
        textPropina.setText("0.0");
        propina = 0.0;
        textDescuento.setText("0.0");
        descuento = 0.0;
        persona++;
        labelPersona.setText(persona + "");
        sepasubtotal = 0.0;
        sepatotal = 0.0;
        labelSubtotal.setText("$ " + String.format("%.2f", sepasubtotal));
        labelTotal.setText("$ " + String.format("%.2f", sepatotal));
        for(int b = (conta2 -1); b >= 0; b--){
            dtm.removeRow(b);
        }
        conta2 = 0;
    }
    
    private void AgregarDescuento(){
        sepatotal += descuento;   // Quitar descuento anterior
        total += descuento;
        descuentototal += descuento;
        String p = textDescuento.getText();
        descuento = Double.parseDouble(p); // Nuevo descuento
        sepatotal -= descuento;  
        total -= descuento;
        descuentototal -= descuento;
        labelTotal.setText("$ "+String.format("%.2f", sepatotal));
        labelTotalTotal.setText("$ "+String.format("%.2f", total));
    }
    
    private void AgregarPropina(){
        sepatotal -= propina;   // Quitar propina anterior
        total -= propina;
        propinatotal -= propina;
        String p = textPropina.getText();
        propina = Double.parseDouble(p); // Nueva propina
        sepatotal += propina;  
        total += propina;
        propinatotal += propina;
        labelTotal.setText("$ "+String.format("%.2f", sepatotal));
        labelTotalTotal.setText("$ "+String.format("%.2f", total));
    }
    
    private void RegresarPlatillo(){
        DefaultTableModel t1 = (DefaultTableModel) tabla.getModel();
        DefaultTableModel t2 = (DefaultTableModel) tabla2.getModel();
        Object[] nf={null,null,null,null};
        Mensajes m = new Mensajes();
        int fila = tabla2.getSelectedRow();
        if(fila>=0){
            String id = tabla2.getValueAt(fila, 0).toString();
            String plat = tabla2.getValueAt(fila, 1).toString();
            String peti = tabla2.getValueAt(fila, 2).toString();
            String pre = tabla2.getValueAt(fila, 3).toString();
            t2.removeRow(fila);
            conta2 --;
            t1.addRow(nf);
            tabla.setValueAt(id, conta, 0);
            tabla.setValueAt(plat, conta, 1);
            tabla.setValueAt(peti, conta, 2);
            tabla.setValueAt(pre, conta, 3);
            conta++;
            double precio = Double.parseDouble(pre.substring(2));
            sepasubtotal -= precio;
            sepatotal -= precio;
            labelSubtotal.setText("$ "+String.format("%.2f", sepasubtotal));
            labelTotal.setText("$ "+String.format("%.2f", sepatotal));
        }else{
            m.error(this, "Selecciona", "Selecciona un paltillo de la tabla izquierda");
        }
    }
    
    private void AgregarPlatillo(){
        DefaultTableModel t1 = (DefaultTableModel) tabla.getModel();
        DefaultTableModel t2 = (DefaultTableModel) tabla2.getModel();
        Object[] nf={null,null,null,null};
        Mensajes m = new Mensajes();
        int fila = tabla.getSelectedRow();
        if(fila>=0){
            String id = tabla.getValueAt(fila, 0).toString();
            String plat = tabla.getValueAt(fila, 1).toString();
            String peti = tabla.getValueAt(fila, 2).toString();
            String pre = tabla.getValueAt(fila, 3).toString();
            t1.removeRow(fila);
            conta --;
            t2.addRow(nf);
            tabla2.setValueAt(id, conta2, 0);
            tabla2.setValueAt(plat, conta2, 1);
            tabla2.setValueAt(peti, conta2, 2);
            tabla2.setValueAt(pre, conta2, 3);
            conta2++;
            double precio = Double.parseDouble(pre.substring(2));
            sepasubtotal += precio;
            sepatotal += precio;
            labelSubtotal.setText("$ "+String.format("%.2f", sepasubtotal));
            labelTotal.setText("$ "+String.format("%.2f", sepatotal));
        }else{
            m.error(this, "Selecciona", "Selecciona un paltillo de la tabla izquierda");
        }
    }

    private void ProcesarVenta() {
        Conexion con = new Conexion();
        SQLVentas sv = new SQLVentas();
        Mensajes m = new Mensajes();
        String sql;
        try {
            if (conta2 > 0) {
                if (m.confirmar(this, "Confimar", "¿Seguro que deseas guardar la subventa?. No podrá ser modificado.")) {
                    for (int i = 0; i < conta2; i++) {
                        String iden = tabla2.getValueAt(i, 0).toString();
                        String[] claves = iden.split("-");   // 0. Alimento ,  1.id
                        sql = sv.SubventaProductos(claves[1], persona);
                        con.Conectar();
                        con.Modificar(sql);
                        con.Cerrar();
                    }
                    sql = sv.NuevaSubventa(folio, persona, sepasubtotal, descuento, sepatotal, propina);
                    con.Conectar();
                    con.Modificar(sql);
                    con.Cerrar();
                    ImagenEscalada();
                    if(conta > 0){
                        SiguientePersona();
                    }else{
                        sql = sv.CompletarVenta(folio, cajero, subtotal, descuentototal, total, propinatotal,4);
                        this.dispose();
                    }
                }
            } else {
                m.error(this, "Error", "Debes de colocar al menos 1 producto en la subventa");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PVCuSep.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void LlenarTabla() {
        DefaultTableModel dtm = (DefaultTableModel) tabla.getModel();
        SQLVentas sv = new SQLVentas();
        Conexion con = new Conexion();
        Object[] nf = {null,null,null,null};
        try{
            String sql = sv.PlatillosVenta(folio);
            con.Conectar();
            ResultSet res = con.Consulta(sql);
            while(res.next()){
                dtm.addRow(nf);
                tabla.setValueAt(res.getString(3)+"-"+res.getString(1), conta, 0);
                tabla.setValueAt(res.getString(7), conta, 1);
                tabla.setValueAt(res.getString(5), conta, 2);
                subtotal += res.getDouble(4);
                tabla.setValueAt("$ "+String.format("%.2f", res.getDouble(4)), conta, 3);
                conta++;
            }
            con.Cerrar();
            labelTotalSubtotal.setText("$ "+String.format("%.2f", subtotal));
            total += subtotal;
            labelTotalTotal.setText("$ "+String.format("%.2f", total));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error PVM 02 >> "+e.getMessage(), cajero, HEIGHT);
        }
    }
    
    private void LlenarCabecera(){
        Conexion con= new Conexion();
        SQLVentas sv = new SQLVentas();
        ResultSet res = null;
        String p = "", d="";
        Tiempo t = new Tiempo();
        try{
            labelFolio.setText("Folio: "+folio);
            String sql = sv.VentaFolio(folio);
            con.Conectar();
            res = con.Consulta(sql);
            if(res.next()){
                labelMesa.setText("Mesa: " + res.getInt(2));
                mesero = res.getString(3);
                labelIngreso.setText("Ingreso: " + t.TimestampTexto(res.getString(8)));
                if (estado) {
                    labelEgreso.setText("Egreso: " + t.TimestampTexto(res.getString(9)));
                }
                estatus = res.getInt(10);
                p = res.getString(11);
                if (p != null) {
                    propina = Double.parseDouble(p);
                } else {
                    propina = 0.0;
                }
                d = res.getString(6);
                if (d != null) {
                    descuento = Double.parseDouble(d);
                } else {
                    descuento = 0.0;
                }
            }
            con.Cerrar();
            total = propina - descuento;
            sql = sv.NombreEmpleado(mesero);
            con.Conectar();
            res = con.Consulta(sql);
            if (res.next()) {
                labelMesero.setText("Mesero: " + mesero + " > " + res.getString(1));
            }
            con.Cerrar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error PVM 01 >> "+e.getMessage(), cajero, HEIGHT);
        }
    }
    
    private void Cerrar(){
        Mensajes  m = new Mensajes();
        if (persona < 2) {
            this.dispose();
            m.error(this, "Incompelto", "Debes completar la generación de tickets");
        }
        else{
            
        }
    }
    
    public void setDatos(int folio, boolean b, String cajero) {
        this.folio = folio;
        this.estado = b;
        this.cajero = cajero;
        if(!estado){

        }
        LlenarCabecera();
        LlenarTabla();
    }
    
    private void ImagenEscalada() throws FileNotFoundException{
        Tiempo t = new Tiempo();
        DocFlavor flavor = DocFlavor.SERVICE_FORMATTED.PAGEABLE;
        PrintRequestAttributeSet patts = new HashPrintRequestAttributeSet();
        
        FileInputStream fileInputStream = new FileInputStream("C:/xampp/htdocs/elmanjar/imagenes/logoticket.jpg");
        if (fileInputStream != null) {
            try {
                //atributos de la impresora
                PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
                pras.add(OrientationRequested.PORTRAIT);
                pras.add(new MediaPrintableArea(0, 0, 48, 29, MediaPrintableArea.MM));
                //Impresora configurada del sistema
                PrintService[] ps = PrintServiceLookup.lookupPrintServices(flavor, patts);
                if (ps.length == 0) {
                    throw new IllegalStateException("1. No se encontro la impresora");
                }
                PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
                PrintService myService = null;
                for (PrintService printService : printServices) {
                    System.out.println(printService.getName());
                    if (printService.getName().equals("Caja")) {
                        myService = printService;
                        break;
                    }
                }
                if (myService == null) {
                    throw new IllegalStateException("2. Impresora no encontrada");
                }

                DocPrintJob docPrintJob = myService.createPrintJob();
                Doc doc = new SimpleDoc(fileInputStream, DocFlavor.INPUT_STREAM.JPEG, null);
                docPrintJob.print(doc, pras);
                fileInputStream.close();
                //Contenido del Ticket
                ByteArrayOutputStream expected = new ByteArrayOutputStream();
                expected.writeBytes(" Av.Libertad #90. Cabecera mun. \n".getBytes());   //32 caracteres
                expected.writeBytes("Chicoloapan de Juarez. CP.56370 \n".getBytes());
                expected.writeBytes("       Estado de Mexico.        \n\n".getBytes());
                expected.writeBytes((t.HoraAcceso()+"\n").getBytes());
                expected.writeBytes((LimitarTexto(labelFolio.getText())+"-"+persona+"\n").getBytes());
                expected.writeBytes((LimitarTexto(labelMesa.getText())+"\n").getBytes());
                expected.writeBytes((LimitarTexto(labelMesero.getText())+"\n").getBytes());
                expected.writeBytes("--------------------------------\n".getBytes());
                for(int i = 0; i<conta2; i++){
                    expected.writeBytes((LimitarTexto(tabla2.getValueAt(i, 1).toString())+"\n").getBytes());    //Platillo
                    expected.writeBytes(("              "+LimitarTexto(tabla2.getValueAt(i, 3).toString())+"\n").getBytes());    //Precio
                }
                expected.writeBytes("--------------------------------\n".getBytes());
                expected.writeBytes(("        Subtotal: "+labelSubtotal.getText()+"\n").getBytes());
                expected.writeBytes(("        Propina: $ "+propina+"\n").getBytes());
                expected.writeBytes(("        Descuento: $ "+descuento+"\n").getBytes());
                expected.writeBytes("--------------------------------\n".getBytes());
                expected.writeBytes(("TOTAL: "+labelTotal.getText()+"\n").getBytes());
                expected.writeBytes("--------------------------------\n".getBytes());
                expected.writeBytes("  Gracias por tu preferencia.   \n".getBytes());
                expected.writeBytes("         Vuelve pronto          \n".getBytes());
                expected.writeBytes(" \n".getBytes());
                expected.writeBytes(" \n".getBytes());
                expected.writeBytes(" \n".getBytes());
                expected.writeBytes(" \n".getBytes());
                expected.writeBytes(" \n".getBytes());
                
                DocPrintJob job = myService.createPrintJob();
                doc = new SimpleDoc(expected.toByteArray(), DocFlavor.BYTE_ARRAY.AUTOSENSE, null);
                job.print(doc, new HashPrintRequestAttributeSet());

            } catch (PrintException ex) {
                System.out.println(ex);
            } catch (IOException ex) {
                System.out.println(ex);
            } finally {
                try {
                    fileInputStream.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
        }
        }
    }
    
    private String LimitarTexto(String texto){
        int x = texto.length();
        if(x >32){
            return texto.substring(0, 31);
        }else{
            return texto;
        }
    }
}
