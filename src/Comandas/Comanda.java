package Comandas;

import Advertencias.Mensajes;
import BaseDatos.Conexion;
import BaseDatos.SQLComandas;
import elmanjarcompleto.Tiempo;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Sides;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Comanda extends javax.swing.JDialog {
    
    private int mesa, conta = 0, venta, cierre = -1;
    private String mesero;
    private int[] tipo = new int[20];
    private JPanel[] panel = new JPanel[25];
    private JLabel[] label = new JLabel[25];
    ArrayList<String> edicion = new ArrayList<>();
    ArrayList<Integer> idproducto = new ArrayList<>();

    public Comanda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        labelEmpleado = new javax.swing.JLabel();
        labelMesa = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaEdicion = new javax.swing.JTextArea();
        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        nombre1 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        nombre2 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        nombre3 = new javax.swing.JLabel();
        panel4 = new javax.swing.JPanel();
        nombre4 = new javax.swing.JLabel();
        panel5 = new javax.swing.JPanel();
        nombre5 = new javax.swing.JLabel();
        panel6 = new javax.swing.JPanel();
        nombre6 = new javax.swing.JLabel();
        panel7 = new javax.swing.JPanel();
        nombre7 = new javax.swing.JLabel();
        panel8 = new javax.swing.JPanel();
        nombre8 = new javax.swing.JLabel();
        panel9 = new javax.swing.JPanel();
        nombre9 = new javax.swing.JLabel();
        panel10 = new javax.swing.JPanel();
        nombre10 = new javax.swing.JLabel();
        panel11 = new javax.swing.JPanel();
        nombre11 = new javax.swing.JLabel();
        panel12 = new javax.swing.JPanel();
        nombre12 = new javax.swing.JLabel();
        panel13 = new javax.swing.JPanel();
        nombre13 = new javax.swing.JLabel();
        panel14 = new javax.swing.JPanel();
        nombre14 = new javax.swing.JLabel();
        panel15 = new javax.swing.JPanel();
        nombre15 = new javax.swing.JLabel();
        panel16 = new javax.swing.JPanel();
        nombre16 = new javax.swing.JLabel();
        panel17 = new javax.swing.JPanel();
        nombre17 = new javax.swing.JLabel();
        panel18 = new javax.swing.JPanel();
        nombre18 = new javax.swing.JLabel();
        panel19 = new javax.swing.JPanel();
        nombre19 = new javax.swing.JLabel();
        panel20 = new javax.swing.JPanel();
        nombre20 = new javax.swing.JLabel();
        panel21 = new javax.swing.JPanel();
        nombre21 = new javax.swing.JLabel();
        panel22 = new javax.swing.JPanel();
        nombre22 = new javax.swing.JLabel();
        panel23 = new javax.swing.JPanel();
        nombre23 = new javax.swing.JLabel();
        panel24 = new javax.swing.JPanel();
        nombre24 = new javax.swing.JLabel();
        panel25 = new javax.swing.JPanel();
        nombre25 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Comandas");
        setMaximumSize(new java.awt.Dimension(1387, 685));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1387, 685));
        setResizable(false);
        setSize(new java.awt.Dimension(1387, 685));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        tabla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Nombre", "Estatus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setRowHeight(35);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                comboTipoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(40);
        }

        labelEmpleado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        labelEmpleado.setText("Nombre");

        labelMesa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMesa.setForeground(new java.awt.Color(255, 255, 255));
        labelMesa.setText("Nombre");

        jToggleButton1.setBackground(new java.awt.Color(153, 0, 204));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/remove.png"))); // NOI18N
        jToggleButton1.setText("Quitar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jToggleButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                comboTipoKeyTyped(evt);
            }
        });

        jScrollPane2.setMinimumSize(new java.awt.Dimension(20, 10));

        areaEdicion.setEditable(false);
        areaEdicion.setBackground(new java.awt.Color(0, 0, 0));
        areaEdicion.setColumns(20);
        areaEdicion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        areaEdicion.setForeground(new java.awt.Color(255, 255, 255));
        areaEdicion.setLineWrap(true);
        areaEdicion.setRows(2);
        jScrollPane2.setViewportView(areaEdicion);

        jToggleButton2.setBackground(new java.awt.Color(153, 0, 204));
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jToggleButton2.setText("Editar");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jToggleButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jToggleButton2comboTipoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jButton3.setBackground(new java.awt.Color(255, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recibe.png"))); // NOI18N
        jButton3.setText("Enviar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3comboTipoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                comboTipoKeyTyped(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 153, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarmesa.png"))); // NOI18N
        jButton4.setText("Cerrar mesa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4comboTipoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                comboTipoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        panel1.setBackground(new java.awt.Color(51, 51, 51));
        panel1.setPreferredSize(new java.awt.Dimension(130, 130));
        panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel1MousePressed(evt);
            }
        });

        nombre1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre1.setForeground(new java.awt.Color(255, 255, 255));
        nombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panel2.setBackground(new java.awt.Color(51, 51, 51));
        panel2.setPreferredSize(new java.awt.Dimension(130, 130));
        panel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel2MousePressed(evt);
            }
        });

        nombre2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre2.setForeground(new java.awt.Color(255, 255, 255));
        nombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel3.setBackground(new java.awt.Color(51, 51, 51));
        panel3.setPreferredSize(new java.awt.Dimension(130, 130));
        panel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel3MousePressed(evt);
            }
        });

        nombre3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre3.setForeground(new java.awt.Color(255, 255, 255));
        nombre3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre3, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addComponent(nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel4.setBackground(new java.awt.Color(51, 51, 51));
        panel4.setPreferredSize(new java.awt.Dimension(130, 130));
        panel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel4MousePressed(evt);
            }
        });

        nombre4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre4.setForeground(new java.awt.Color(255, 255, 255));
        nombre4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel5.setBackground(new java.awt.Color(51, 51, 51));
        panel5.setPreferredSize(new java.awt.Dimension(130, 130));
        panel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel5MousePressed(evt);
            }
        });

        nombre5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre5.setForeground(new java.awt.Color(255, 255, 255));
        nombre5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre5, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel6.setBackground(new java.awt.Color(51, 51, 51));
        panel6.setPreferredSize(new java.awt.Dimension(130, 130));
        panel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel6MousePressed(evt);
            }
        });

        nombre6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre6.setForeground(new java.awt.Color(255, 255, 255));
        nombre6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre6, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        panel7.setBackground(new java.awt.Color(51, 51, 51));
        panel7.setPreferredSize(new java.awt.Dimension(130, 130));
        panel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel7MousePressed(evt);
            }
        });

        nombre7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre7.setForeground(new java.awt.Color(255, 255, 255));
        nombre7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre7, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        panel8.setBackground(new java.awt.Color(51, 51, 51));
        panel8.setPreferredSize(new java.awt.Dimension(130, 130));
        panel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel8MousePressed(evt);
            }
        });

        nombre8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre8.setForeground(new java.awt.Color(255, 255, 255));
        nombre8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre8, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        panel9.setBackground(new java.awt.Color(51, 51, 51));
        panel9.setPreferredSize(new java.awt.Dimension(130, 130));
        panel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel9MousePressed(evt);
            }
        });

        nombre9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre9.setForeground(new java.awt.Color(255, 255, 255));
        nombre9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre9, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        panel10.setBackground(new java.awt.Color(51, 51, 51));
        panel10.setPreferredSize(new java.awt.Dimension(130, 130));
        panel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel10MousePressed(evt);
            }
        });

        nombre10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre10.setForeground(new java.awt.Color(255, 255, 255));
        nombre10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel10Layout = new javax.swing.GroupLayout(panel10);
        panel10.setLayout(panel10Layout);
        panel10Layout.setHorizontalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre10, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel10Layout.setVerticalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        panel11.setBackground(new java.awt.Color(51, 51, 51));
        panel11.setPreferredSize(new java.awt.Dimension(130, 130));
        panel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel11MousePressed(evt);
            }
        });

        nombre11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre11.setForeground(new java.awt.Color(255, 255, 255));
        nombre11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel11Layout = new javax.swing.GroupLayout(panel11);
        panel11.setLayout(panel11Layout);
        panel11Layout.setHorizontalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre11, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel11Layout.setVerticalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel12.setBackground(new java.awt.Color(51, 51, 51));
        panel12.setPreferredSize(new java.awt.Dimension(130, 130));
        panel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel12MousePressed(evt);
            }
        });

        nombre12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre12.setForeground(new java.awt.Color(255, 255, 255));
        nombre12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel12Layout = new javax.swing.GroupLayout(panel12);
        panel12.setLayout(panel12Layout);
        panel12Layout.setHorizontalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre12, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel12Layout.setVerticalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel13.setBackground(new java.awt.Color(51, 51, 51));
        panel13.setPreferredSize(new java.awt.Dimension(130, 130));
        panel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel13MousePressed(evt);
            }
        });

        nombre13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre13.setForeground(new java.awt.Color(255, 255, 255));
        nombre13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel13Layout = new javax.swing.GroupLayout(panel13);
        panel13.setLayout(panel13Layout);
        panel13Layout.setHorizontalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre13, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel13Layout.setVerticalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel14.setBackground(new java.awt.Color(51, 51, 51));
        panel14.setPreferredSize(new java.awt.Dimension(130, 130));
        panel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel14MousePressed(evt);
            }
        });

        nombre14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre14.setForeground(new java.awt.Color(255, 255, 255));
        nombre14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel14Layout = new javax.swing.GroupLayout(panel14);
        panel14.setLayout(panel14Layout);
        panel14Layout.setHorizontalGroup(
            panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre14, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel14Layout.setVerticalGroup(
            panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel15.setBackground(new java.awt.Color(51, 51, 51));
        panel15.setPreferredSize(new java.awt.Dimension(130, 130));
        panel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel15MousePressed(evt);
            }
        });

        nombre15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre15.setForeground(new java.awt.Color(255, 255, 255));
        nombre15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel15Layout = new javax.swing.GroupLayout(panel15);
        panel15.setLayout(panel15Layout);
        panel15Layout.setHorizontalGroup(
            panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre15, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel15Layout.setVerticalGroup(
            panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        panel16.setBackground(new java.awt.Color(51, 51, 51));
        panel16.setPreferredSize(new java.awt.Dimension(130, 130));
        panel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel16MousePressed(evt);
            }
        });

        nombre16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre16.setForeground(new java.awt.Color(255, 255, 255));
        nombre16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel16Layout = new javax.swing.GroupLayout(panel16);
        panel16.setLayout(panel16Layout);
        panel16Layout.setHorizontalGroup(
            panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre16, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel16Layout.setVerticalGroup(
            panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        panel17.setBackground(new java.awt.Color(51, 51, 51));
        panel17.setPreferredSize(new java.awt.Dimension(130, 130));
        panel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel17MousePressed(evt);
            }
        });

        nombre17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre17.setForeground(new java.awt.Color(255, 255, 255));
        nombre17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel17Layout = new javax.swing.GroupLayout(panel17);
        panel17.setLayout(panel17Layout);
        panel17Layout.setHorizontalGroup(
            panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre17, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel17Layout.setVerticalGroup(
            panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panel18.setBackground(new java.awt.Color(51, 51, 51));
        panel18.setPreferredSize(new java.awt.Dimension(130, 130));
        panel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel18MousePressed(evt);
            }
        });

        nombre18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre18.setForeground(new java.awt.Color(255, 255, 255));
        nombre18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel18Layout = new javax.swing.GroupLayout(panel18);
        panel18.setLayout(panel18Layout);
        panel18Layout.setHorizontalGroup(
            panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre18, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel18Layout.setVerticalGroup(
            panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre18, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        panel19.setBackground(new java.awt.Color(51, 51, 51));
        panel19.setPreferredSize(new java.awt.Dimension(130, 130));
        panel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel19MousePressed(evt);
            }
        });

        nombre19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre19.setForeground(new java.awt.Color(255, 255, 255));
        nombre19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel19Layout = new javax.swing.GroupLayout(panel19);
        panel19.setLayout(panel19Layout);
        panel19Layout.setHorizontalGroup(
            panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre19, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel19Layout.setVerticalGroup(
            panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panel20.setBackground(new java.awt.Color(51, 51, 51));
        panel20.setPreferredSize(new java.awt.Dimension(130, 130));
        panel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel20MousePressed(evt);
            }
        });

        nombre20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre20.setForeground(new java.awt.Color(255, 255, 255));
        nombre20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel20Layout = new javax.swing.GroupLayout(panel20);
        panel20.setLayout(panel20Layout);
        panel20Layout.setHorizontalGroup(
            panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre20, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel20Layout.setVerticalGroup(
            panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel20Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nombre20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel21.setBackground(new java.awt.Color(51, 51, 51));
        panel21.setPreferredSize(new java.awt.Dimension(130, 130));
        panel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel21MousePressed(evt);
            }
        });

        nombre21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre21.setForeground(new java.awt.Color(255, 255, 255));
        nombre21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel21Layout = new javax.swing.GroupLayout(panel21);
        panel21.setLayout(panel21Layout);
        panel21Layout.setHorizontalGroup(
            panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre21, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel21Layout.setVerticalGroup(
            panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panel22.setBackground(new java.awt.Color(51, 51, 51));
        panel22.setPreferredSize(new java.awt.Dimension(130, 130));
        panel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel22MousePressed(evt);
            }
        });

        nombre22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre22.setForeground(new java.awt.Color(255, 255, 255));
        nombre22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel22Layout = new javax.swing.GroupLayout(panel22);
        panel22.setLayout(panel22Layout);
        panel22Layout.setHorizontalGroup(
            panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre22, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel22Layout.setVerticalGroup(
            panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panel23.setBackground(new java.awt.Color(51, 51, 51));
        panel23.setPreferredSize(new java.awt.Dimension(130, 130));
        panel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel23MousePressed(evt);
            }
        });

        nombre23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre23.setForeground(new java.awt.Color(255, 255, 255));
        nombre23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel23Layout = new javax.swing.GroupLayout(panel23);
        panel23.setLayout(panel23Layout);
        panel23Layout.setHorizontalGroup(
            panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre23, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel23Layout.setVerticalGroup(
            panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panel24.setBackground(new java.awt.Color(51, 51, 51));
        panel24.setPreferredSize(new java.awt.Dimension(130, 130));
        panel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel24MousePressed(evt);
            }
        });

        nombre24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre24.setForeground(new java.awt.Color(255, 255, 255));
        nombre24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel24Layout = new javax.swing.GroupLayout(panel24);
        panel24.setLayout(panel24Layout);
        panel24Layout.setHorizontalGroup(
            panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre24, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel24Layout.setVerticalGroup(
            panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panel25.setBackground(new java.awt.Color(51, 51, 51));
        panel25.setPreferredSize(new java.awt.Dimension(130, 130));
        panel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel26MousePressed(evt);
            }
        });

        nombre25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre25.setForeground(new java.awt.Color(255, 255, 255));
        nombre25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel25Layout = new javax.swing.GroupLayout(panel25);
        panel25.setLayout(panel25Layout);
        panel25Layout.setHorizontalGroup(
            panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre25, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel25Layout.setVerticalGroup(
            panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        comboTipo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        comboTipo.setMaximumRowCount(13);
        comboTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTipoItemStateChanged(evt);
            }
        });
        comboTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                comboTipoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(panel11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel14, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel15, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(panel16, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel17, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(panel21, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel22, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(panel18, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel19, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel20, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(panel23, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel24, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel25, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(panel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(panel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(panel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(panel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(panel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(panel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(panel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        EnviarPlatillos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3comboTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3comboTipoKeyPressed

    }//GEN-LAST:event_jButton3comboTipoKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CerrarMesa();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4comboTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4comboTipoKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_jButton4comboTipoKeyPressed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        SuprimirPlatillo();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void comboTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboTipoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoKeyTyped

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        EditarPlatillo();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton2comboTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jToggleButton2comboTipoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2comboTipoKeyTyped

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
        CargarDatos();
    }//GEN-LAST:event_tablaMousePressed

    private void panel22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel22MousePressed
        AgregarPlatillo(22);
    }//GEN-LAST:event_panel22MousePressed

    private void panel21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel21MousePressed
        AgregarPlatillo(21);
    }//GEN-LAST:event_panel21MousePressed

    private void comboTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTipoItemStateChanged
        MostrarPlatillos();
    }//GEN-LAST:event_comboTipoItemStateChanged

    private void panel20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel20MousePressed
        AgregarPlatillo(20);
    }//GEN-LAST:event_panel20MousePressed

    private void panel19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel19MousePressed
        AgregarPlatillo(19);
    }//GEN-LAST:event_panel19MousePressed

    private void panel18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel18MousePressed
        AgregarPlatillo(18);
    }//GEN-LAST:event_panel18MousePressed

    private void panel17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel17MousePressed
        AgregarPlatillo(17);
    }//GEN-LAST:event_panel17MousePressed

    private void panel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel16MousePressed
        AgregarPlatillo(16);
    }//GEN-LAST:event_panel16MousePressed

    private void panel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel15MousePressed
        AgregarPlatillo(15);
    }//GEN-LAST:event_panel15MousePressed

    private void panel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel14MousePressed
        AgregarPlatillo(14);
    }//GEN-LAST:event_panel14MousePressed

    private void panel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel13MousePressed
        AgregarPlatillo(13);
    }//GEN-LAST:event_panel13MousePressed

    private void panel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel12MousePressed
        AgregarPlatillo(12);
    }//GEN-LAST:event_panel12MousePressed

    private void panel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel11MousePressed
        AgregarPlatillo(11);
    }//GEN-LAST:event_panel11MousePressed

    private void panel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel10MousePressed
        AgregarPlatillo(10);
    }//GEN-LAST:event_panel10MousePressed

    private void panel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel9MousePressed
        AgregarPlatillo(9);
    }//GEN-LAST:event_panel9MousePressed

    private void panel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel8MousePressed
        AgregarPlatillo(8);
    }//GEN-LAST:event_panel8MousePressed

    private void panel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel7MousePressed
        AgregarPlatillo(7);
    }//GEN-LAST:event_panel7MousePressed

    private void panel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel6MousePressed
        AgregarPlatillo(6);
    }//GEN-LAST:event_panel6MousePressed

    private void panel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel5MousePressed
        AgregarPlatillo(5);
    }//GEN-LAST:event_panel5MousePressed

    private void panel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel4MousePressed
        AgregarPlatillo(4);
    }//GEN-LAST:event_panel4MousePressed

    private void panel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel3MousePressed
        AgregarPlatillo(3);
    }//GEN-LAST:event_panel3MousePressed

    private void panel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel2MousePressed
        AgregarPlatillo(2);
    }//GEN-LAST:event_panel2MousePressed

    private void panel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MousePressed
        AgregarPlatillo(1);
    }//GEN-LAST:event_panel1MousePressed

    private void panel23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel23MousePressed
        AgregarPlatillo(23);
    }//GEN-LAST:event_panel23MousePressed

    private void panel24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel24MousePressed
        AgregarPlatillo(24);
    }//GEN-LAST:event_panel24MousePressed

    private void panel26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel26MousePressed
        AgregarPlatillo(25);
    }//GEN-LAST:event_panel26MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaEdicion;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel labelEmpleado;
    private javax.swing.JLabel labelMesa;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombre10;
    private javax.swing.JLabel nombre11;
    private javax.swing.JLabel nombre12;
    private javax.swing.JLabel nombre13;
    private javax.swing.JLabel nombre14;
    private javax.swing.JLabel nombre15;
    private javax.swing.JLabel nombre16;
    private javax.swing.JLabel nombre17;
    private javax.swing.JLabel nombre18;
    private javax.swing.JLabel nombre19;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel nombre20;
    private javax.swing.JLabel nombre21;
    private javax.swing.JLabel nombre22;
    private javax.swing.JLabel nombre23;
    private javax.swing.JLabel nombre24;
    private javax.swing.JLabel nombre25;
    private javax.swing.JLabel nombre3;
    private javax.swing.JLabel nombre4;
    private javax.swing.JLabel nombre5;
    private javax.swing.JLabel nombre6;
    private javax.swing.JLabel nombre7;
    private javax.swing.JLabel nombre8;
    private javax.swing.JLabel nombre9;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel10;
    private javax.swing.JPanel panel11;
    private javax.swing.JPanel panel12;
    private javax.swing.JPanel panel13;
    private javax.swing.JPanel panel14;
    private javax.swing.JPanel panel15;
    private javax.swing.JPanel panel16;
    private javax.swing.JPanel panel17;
    private javax.swing.JPanel panel18;
    private javax.swing.JPanel panel19;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel20;
    private javax.swing.JPanel panel21;
    private javax.swing.JPanel panel22;
    private javax.swing.JPanel panel23;
    private javax.swing.JPanel panel24;
    private javax.swing.JPanel panel25;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel6;
    private javax.swing.JPanel panel7;
    private javax.swing.JPanel panel8;
    private javax.swing.JPanel panel9;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    public int getCierre(){
        return cierre;
    }
    
    private void CargarDatos(){
        int fila = tabla.getSelectedRow();
        if(fila >= 0){
            areaEdicion.setText(null);
            areaEdicion.append(edicion.get(fila));
        }
    }
    
    private void EditarPlatillo(){
        Mensajes m = new Mensajes();
        int fila = tabla.getSelectedRow();
        if(fila >= 0){
            String est = tabla.getValueAt(fila, 2).toString();
            if (est.equals("N")) {
                String cad = m.IngresarString(this, "Editar el platillo", "Ingresa las modificaciones para este platillo");
                edicion.add(fila, cad);
            }
        }else{
            m.alerta(this, "Selecciona", "Debes seleccionar un platillo de la tabla");
        }        
    }
    
    private void CerrarMesa(){
        Conexion con = new Conexion();
        SQLComandas sc = new SQLComandas();
        Mensajes m = new Mensajes();
        Tiempo t = new Tiempo();
        boolean es = m.confirmar(this, "Cerra mesa", "¿Estás segur@ de cerrar la mesa?");
        if (es) {
            try {
                String fin = t.HoraAcceso();
                String sql = sc.CerrarMesa(venta, fin);
                con.Conectar();
                con.Modificar(sql);
                con.Cerrar();
                m.alerta(this, "Mesa cerrada", "La mesa se ha cerrado satisfactoriamente");
                Cerrar();
                cierre = mesa;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error CO06 >> " + e.getMessage());
            }
        }
    }
    
    private void SuprimirPlatillo(){
        DefaultTableModel dtm = (DefaultTableModel) tabla.getModel();
        int fila = tabla.getSelectedRow();
        if (fila >= 0) {  //Se selecciono una fila
            String p = tabla.getValueAt(fila, 0).toString();
            int platillo = Integer.parseInt(p); //Id platillo
            String est = tabla.getValueAt(fila, 2).toString();
            if (est.equals("N")) {   //El platillo no esta almacenado
                dtm.removeRow(fila);
                edicion.remove(fila);
                conta--;
            }
            else{   //El platillo ya se ha enviado y almacenado
                Permiso per = new Permiso(this, true);
                per.setDatos(venta, platillo, idproducto.get(fila));
                per.setLocationRelativeTo(null);
                per.setVisible(true);

                if (per.getEstado()) {
                    dtm.removeRow(fila);
                    edicion.remove(fila);
                    conta--;
                }
            }
        }else{
            Mensajes m = new Mensajes();
            m.alerta(this, "Selecciona", "Debes seleccionar un platillo de la tabla");
        }
        
    }
    
    private void AgregarPlatillo(int platillo){ //Tabla
            DefaultTableModel dtm = (DefaultTableModel) tabla.getModel();
            Object[] nf = {null, null, null};
            String a = label[platillo - 1].getText();
            int fin = a.indexOf(">")+1;
            int b = a.indexOf(".");
            int c = Integer.parseInt(a.substring(fin, b)); // id platillo
            String d = a.substring(b + 1).replaceAll("<br>"," "); //Nombre platillo
            System.out.println("Platillo >> " + c);
            dtm.addRow(nf); 
            tabla.setValueAt(c, conta, 0);  //Id
            tabla.setValueAt(d, conta, 1);  //Nombre
            tabla.setValueAt("N",conta, 2); 
            edicion.add(" ");
            conta++;
    }
        
    private void MostrarPlatillos() {
        int combo = comboTipo.getSelectedIndex();
        if (combo == 0) {
            LimpiarPaneles();
        } else {
            LimpiarPaneles();
            try {
                ResultSet res;
                Conexion con = new Conexion();
                SQLComandas sc = new SQLComandas();
                int pos = 0;
                String sql = sc.TiposPlatillosComanda(combo);
                con.Conectar();
                res = con.Consulta(sql);
                while (res.next()) {
                    String t = res.getString(1) + "." + res.getString(2);
                    CargarDatos(pos,t);
                    pos++;
                }
                con.Cerrar();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error CO02 >> "+e.getMessage());
            }
        }
    }

    private void CargarDatos(int pos, String plato){
        try {
            panel[pos].setEnabled(false);
            label[pos].setText("<html>" + plato.replaceAll(" ", "<br>"));
        } catch (Exception ex) {
            Logger.getLogger(Comanda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void LlenarCombo(){
        ResultSet res;
        String sql;
        int i = 0;
        try{
            comboTipo.addItem("Tipo de platillo");
            Conexion con = new Conexion();
            SQLComandas sa = new SQLComandas();
            sql = sa.TodoTipoPlatillo();
            con.Conectar();
            res = con.Consulta(sql);
            while(res.next()){
                comboTipo.addItem(res.getString(2));
                tipo[i] = res.getInt(1);
                i++;
            }
            con.Cerrar();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Error CO 01 >> "+e.getMessage());
        }
    }
    
    private void Cerrar(){
        this.dispose();
    }
    
    private void LimpiarPaneles(){
        for(int i = 0; i<25; i++){
            label[i].setText("");
        }
    }
    
    public void setDatos(int mesa, String empleado) {
        this.mesa = mesa;
        this.mesero = empleado;
        labelEmpleado.setText(mesero);
        labelMesa.setText("Mesa: "+mesa);
        try{
            Conexion con = new Conexion();
            SQLComandas sa = new SQLComandas();
            ResultSet res;
            String sql = sa.ObtenerVenta(mesa);
            con.Conectar();
            res = con.Consulta(sql);
            if(res.next()){
               venta = res.getInt(1);
            }
            con.Cerrar();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Error CO04 >> "+e.getMessage());
        }
        LlenarArreglos();
        LlenarTabla();
    }
    
    public void setDatos(int mesa, String mesero, int venta) {
        this.venta = venta;
        this.mesa = mesa;
        this.mesero = mesero;
        labelEmpleado.setText(mesero);
        labelMesa.setText("Mesa: "+mesa);
        LlenarArreglos();
        LlenarTabla();
    }
    
    private void LlenarTabla(){
        edicion.clear();
        idproducto.clear();
        DefaultTableModel dtm = (DefaultTableModel) tabla.getModel();
        for(int b = (conta -1); b>= 0; b--){
            dtm.removeRow(b);
        }
        conta = 0;
        Conexion con = new Conexion();
        SQLComandas sc = new SQLComandas();
        ResultSet res;
        Object[] nf = {null, null, null};
        try {
            String sql = sc.ObtenerPlatillos(venta);
            con.Conectar();
            res = con.Consulta(sql);
            while (res.next()) {
                dtm.addRow(nf);
                tabla.setValueAt(res.getString(1), conta, 0);
                tabla.setValueAt(res.getString(2), conta, 1);
                String ob = res.getString(3);
                idproducto.add(res.getInt(4));
                if(ob.isEmpty()){
                    edicion.add(" ");
                }else{
                    edicion.add(ob);
                }
                tabla.setValueAt("C", conta, 2);
                conta ++;
            }
            con.Cerrar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error CO05 >> " + e.getMessage());
        }
    }
    
    private void LlenarArreglos(){        
        panel[0]= panel1;
        panel[1]= panel2;
        panel[2]= panel3;
        panel[3]= panel4;
        panel[4]= panel5;
        panel[5]= panel6;
        panel[6]= panel7;
        panel[7]= panel8;
        panel[8]= panel9;
        panel[9]= panel10;
        panel[10]= panel11;
        panel[11]= panel12;
        panel[12]= panel13;
        panel[13]= panel14;
        panel[14]= panel15;
        panel[15]= panel16;
        panel[16]= panel17;
        panel[17]= panel18;
        panel[18]= panel19;
        panel[19]= panel20;
        panel[20]= panel21;
        panel[21]= panel22;
        panel[22]= panel23;
        panel[23]= panel24;
        panel[24]= panel25;
        
        /*imagen[0]= imagen1;
        imagen[0]= null;
        imagen[1]= imagen2;
        imagen[2]= imagen3;
        imagen[3]= imagen4;
        imagen[4]= imagen5;
        imagen[5]= imagen6;
        imagen[6]= imagen7;
        imagen[7]= imagen8;
        imagen[8]= imagen9;
        imagen[9]= imagen10;
        imagen[10]= imagen11;
        imagen[11]= imagen12;
        imagen[12]= imagen13;
        imagen[13]= imagen14;
        imagen[14]= imagen15;
        imagen[15]= imagen16;
        imagen[16]= imagen17;
        imagen[17]= imagen18;
        imagen[18]= imagen19;
        imagen[19]= imagen20;*/
        
        label[0]= nombre1;
        label[1]= nombre2;
        label[2]= nombre3;
        label[3]= nombre4;
        label[4]= nombre5;
        label[5]= nombre6;
        label[6]= nombre7;
        label[7]= nombre8;
        label[8]= nombre9;
        label[9]= nombre10;
        label[10]= nombre11;
        label[11]= nombre12;
        label[12]= nombre13;
        label[13]= nombre14;
        label[14]= nombre15;
        label[15]= nombre16;
        label[16]= nombre17;
        label[17]= nombre18;
        label[18]= nombre19;
        label[19]= nombre20;
        label[20]= nombre25;
        label[21]= nombre24;
        label[22]= nombre23;
        label[23]= nombre22;
        label[24]= nombre21;
        
        LlenarCombo();
    }

    private void Eventos(KeyEvent evt){
        if(evt.getKeyCode() == KeyEvent.VK_F1){
            EnviarPlatillos();
        }
        if(evt.getKeyCode() == KeyEvent.VK_F2){
           CerrarMesa();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            Cerrar();
        }
    }

    private void EnviarPlatillos() {
        Conexion con = new Conexion();
        SQLComandas sc = new SQLComandas();
        double precio = 0.0;
        boolean cerrar = false;
        try {
            for (int b = (conta - 1); b >= 0; b--) {
                String est = tabla.getValueAt(b, 2).toString();
                if (est.equals("N")) {
                    cerrar = true;
                    String pl = tabla.getValueAt(b, 0).toString();
                    int platillo = Integer.parseInt(pl);
                    String sql = sc.PrecioPlatillo(platillo);
                    con.Conectar();
                    ResultSet res = con.Consulta(sql);
                    if(res.next()){
                        precio = res.getDouble(1);
                    }
                    con.Cerrar();
                    sql = sc.AgregarPlatilloVenta(venta, platillo, precio, edicion.get(b));
                    con.Conectar();
                    con.Modificar(sql);
                    con.Cerrar();
                } else {
                    b = -1;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error CO07 >> "+e.getMessage());
        } 
        if (cerrar) {
            /*DocFlavor flavor = DocFlavor.SERVICE_FORMATTED.PAGEABLE;
            PrintRequestAttributeSet patts = new HashPrintRequestAttributeSet();
            patts.add(Sides.DUPLEX);

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

            ByteArrayOutputStream expected = new ByteArrayOutputStream();
            String me = "MESA: " + mesa + " \n";
            expected.writeBytes(me.getBytes());
            me = "MESERO: " + mesero + " \n\n";
            expected.writeBytes(me.getBytes());
            try {
                for (int b = (conta - 1); b >= 0; b--) {
                    String est = tabla.getValueAt(b, 2).toString();
                    if (est.equals("N")) {
                        String ticket = "";
                        ticket = tabla.getValueAt(b, 1).toString() + "\n\n";
                        String ed = edicion.get(b);
                        if (!ed.equals(" ")) {
                            ticket += " ** " + ed + "\n\n";
                        }
                        expected.writeBytes(ticket.getBytes());
                    }
                }

                expected.writeBytes(".\n\n\n\n\n\n".getBytes());
            } catch (Exception e) {
                System.out.println("Error COTi >> " + e.getMessage());
            }

            DocPrintJob job = myService.createPrintJob();
            Doc doc = new SimpleDoc(expected.toByteArray(), DocFlavor.BYTE_ARRAY.AUTOSENSE, null);
            try {
                job.print(doc, new HashPrintRequestAttributeSet());
            } catch (Exception e) {
                System.out.println("Error>> " + e.getMessage());
            }*/
        }
        Cerrar();
    }
}
