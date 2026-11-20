/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.ups.bustosm_uzhcar_cafeteria.views;

import ec.edu.ups.bustosm_uzhcar_cafeteria.controllers.CafeteriaController;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class PrincipalView extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PrincipalView.class.getName());

    private CafeteriaController controller;
    
    /**
     * Creates new form View2
     */
    public PrincipalView() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        
        javax.swing.JButton[] productos = {
            btnCafe, btnEnsalada, btnPizza, btnCrema, btnAzucar, btnSalami,
            btnTomate, btnQueso, btnPepperoni, btnPollo, btnVinagreta
        };
        for (javax.swing.JButton b : productos) {
            b.setBorder(javax.swing.BorderFactory.createEmptyBorder());
            b.setMargin(new java.awt.Insets(0, 0, 0, 0));
            b.setContentAreaFilled(false);
            b.setFocusPainted(false);
        }
        
        configurarTabla();
    }
    
    private void configurarTabla() {
        tlbFactura.setAutoCreateRowSorter(false);
        tlbFactura.setRowSorter(null);

        DefaultTableModel modelo = new DefaultTableModel(
                new Object[]{"Producto", "Adicional", "Valor", "Total"}, 0
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tlbFactura.setModel(modelo);
        tlbFactura.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        
        tlbFactura.setBackground(java.awt.Color.WHITE);
        tlbFactura.setForeground(java.awt.Color.BLACK);
        tlbFactura.setGridColor(new java.awt.Color(220, 243, 240));
        tlbFactura.setSelectionBackground(new java.awt.Color(117, 190, 188));
        tlbFactura.setSelectionForeground(java.awt.Color.BLACK);
        tlbFactura.setRowHeight(28);
        tlbFactura.setFillsViewportHeight(true);

        tlbFactura.getTableHeader().setBackground(new java.awt.Color(220, 243, 240));
        tlbFactura.getTableHeader().setForeground(new java.awt.Color(20, 80, 76));
        tlbFactura.getTableHeader().setReorderingAllowed(false);
    }

    public JButton getBtnAzucar() {
        return btnAzucar;
    }

    public JButton getBtnCafe() {
        return btnCafe;
    }

    public JButton getBtnConfirmar() {
        return btnConfirmar;
    }

    public JButton getBtnCrema() {
        return btnCrema;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public JButton getBtnEnsalada() {
        return btnEnsalada;
    }

    public JButton getBtnPepperoni() {
        return btnPepperoni;
    }

    public JButton getBtnPizza() {
        return btnPizza;
    }

    public JButton getBtnPollo() {
        return btnPollo;
    }

    public JButton getBtnQueso() {
        return btnQueso;
    }

    public JButton getBtnSalami() {
        return btnSalami;
    }

    public JButton getBtnTomate() {
        return btnTomate;
    }

    public JButton getBtnVinagreta() {
        return btnVinagreta;
    }

    public JLabel getLblSubtotal() {
        return lblSubtotal;
    }

    public JTable getTlbFactura() {
        return tlbFactura;
    }

    public JLabel getLblAzucar() {
        return lblAzucar;
    }

    public JLabel getLblAzucarPrecio() {
        return lblAzucarPrecio;
    }

    public JLabel getLblCafe() {
        return lblCafe;
    }

    public JLabel getLblCafePrecio() {
        return lblCafePrecio;
    }

    public JLabel getLblCrema() {
        return lblCrema;
    }

    public JLabel getLblCremaPrecio() {
        return lblCremaPrecio;
    }

    public JLabel getLblEnsalada() {
        return lblEnsalada;
    }

    public JLabel getLblEnsaladaPrecio() {
        return lblEnsaladaPrecio;
    }

    public JLabel getLblPepperoni() {
        return lblPepperoni;
    }

    public JLabel getLblPepperoniPrecio() {
        return lblPepperoniPrecio;
    }

    public JLabel getLblPizza() {
        return lblPizza;
    }

    public JLabel getLblPizzaPrecio() {
        return lblPizzaPrecio;
    }

    public JLabel getLblPollo() {
        return lblPollo;
    }

    public JLabel getLblPolloPrecio() {
        return lblPolloPrecio;
    }

    public JLabel getLblQueso() {
        return lblQueso;
    }

    public JLabel getLblQuesoPrecio() {
        return lblQuesoPrecio;
    }

    public JLabel getLblSalami() {
        return lblSalami;
    }

    public JLabel getLblSalamiPrecio() {
        return lblSalamiPrecio;
    }

    public JLabel getLblTomate() {
        return lblTomate;
    }

    public JLabel getLblTomatePrecio() {
        return lblTomatePrecio;
    }

    public JLabel getLblVinagreta() {
        return lblVinagreta;
    }

    public JLabel getLblVinagretaPrecio() {
        return lblVinagretaPrecio;
    }
    
    public void limpiarFactura() {
        ((DefaultTableModel) tlbFactura.getModel()).setRowCount(0);
    }

    public void agregarFila(Object... fila) {
        ((DefaultTableModel) tlbFactura.getModel()).addRow(fila);
    }

    public int getFilaSeleccionada() {
        return tlbFactura.getSelectedRow();
    }

    public void seleccionarFila(int fila) {
        tlbFactura.setRowSelectionInterval(fila, fila);
    }

    public void setSubtotal(String valor) {
        lblSubtotal.setText("Subtotal:  " + valor);
    }
    
    public boolean confirmar(String pregunta) {
        return javax.swing.JOptionPane.showConfirmDialog(this, pregunta, "Confirmar",
                javax.swing.JOptionPane.YES_NO_OPTION) == javax.swing.JOptionPane.YES_OPTION;
    }

    public void mostrarMensaje(String mensaje) {
        javax.swing.JOptionPane.showMessageDialog(this, mensaje);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tlbFactura = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        lblSubtotal = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btnCafe = new javax.swing.JButton();
        lblCafe = new javax.swing.JLabel();
        lblCafePrecio = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblEnsalada = new javax.swing.JLabel();
        btnEnsalada = new javax.swing.JButton();
        lblEnsaladaPrecio = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lblPizza = new javax.swing.JLabel();
        btnPizza = new javax.swing.JButton();
        lblPizzaPrecio = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lblCrema = new javax.swing.JLabel();
        btnCrema = new javax.swing.JButton();
        lblCremaPrecio = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lblAzucar = new javax.swing.JLabel();
        btnAzucar = new javax.swing.JButton();
        lblAzucarPrecio = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        lblSalami = new javax.swing.JLabel();
        btnSalami = new javax.swing.JButton();
        lblSalamiPrecio = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        lblTomate = new javax.swing.JLabel();
        btnTomate = new javax.swing.JButton();
        lblTomatePrecio = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        lblQueso = new javax.swing.JLabel();
        btnQueso = new javax.swing.JButton();
        lblQuesoPrecio = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        lblPepperoni = new javax.swing.JLabel();
        btnPepperoni = new javax.swing.JButton();
        lblPepperoniPrecio = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        lblPollo = new javax.swing.JLabel();
        btnPollo = new javax.swing.JButton();
        lblPolloPrecio = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        lblVinagreta = new javax.swing.JLabel();
        btnVinagreta = new javax.swing.JButton();
        lblVinagretaPrecio = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(220, 243, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(20, 80, 76));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 200, 20));

        jPanel2.setBackground(new java.awt.Color(220, 243, 240));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(40, 100, 96));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PRINCIPALES");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 170, 20));

        jPanel3.setBackground(new java.awt.Color(220, 243, 240));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(40, 100, 96));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADICIONALES");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 480, 20));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/cafeteria_tarea/imagenes/factura.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(20, 80, 76));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FACTURA / PEDIDO");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tlbFactura.setAutoCreateRowSorter(true);
        tlbFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tlbFactura.setFillsViewportHeight(true);
        tlbFactura.setGridColor(new java.awt.Color(220, 243, 240));
        tlbFactura.setSelectionBackground(new java.awt.Color(117, 190, 188));
        jScrollPane1.setViewportView(tlbFactura);

        jPanel5.setBackground(new java.awt.Color(235, 252, 252));

        lblSubtotal.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblSubtotal.setText("Subtotal:  $");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnEliminar.setBackground(new java.awt.Color(36, 91, 93));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/cafeteria_tarea/imagenes/eliminar.png"))); // NOI18N
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(42, 42, 42)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 400, 530));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        btnCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/cafeteria_tarea/imagenes/Cafe.png"))); // NOI18N
        btnCafe.addActionListener(this::btnCafeActionPerformed);

        lblCafe.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblCafe.setText("Café ");

        lblCafePrecio.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblCafePrecio.setText("$2.20");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCafe, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lblCafe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCafePrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnCafe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCafe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCafePrecio))
                .addGap(65, 65, 65))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 170, 140));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        lblEnsalada.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblEnsalada.setText("Ensalada");

        btnEnsalada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/cafeteria_tarea/imagenes/Ensalada.png"))); // NOI18N
        btnEnsalada.addActionListener(this::btnEnsaladaActionPerformed);

        lblEnsaladaPrecio.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblEnsaladaPrecio.setText("$3.00");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEnsalada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEnsaladaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnEnsalada)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(btnEnsalada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnsalada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEnsaladaPrecio))
                .addGap(65, 65, 65))
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 170, 140));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        lblPizza.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblPizza.setText("Pizza");

        btnPizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/cafeteria_tarea/imagenes/Pizza.png"))); // NOI18N
        btnPizza.addActionListener(this::btnPizzaActionPerformed);

        lblPizzaPrecio.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblPizzaPrecio.setText("$5.00");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPizza, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPizzaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPizzaPrecio))
                .addGap(45, 45, 45))
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 170, 140));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        lblCrema.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblCrema.setText("Crema");

        btnCrema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/cafeteria_tarea/imagenes/Crema.png"))); // NOI18N
        btnCrema.addActionListener(this::btnCremaActionPerformed);

        lblCremaPrecio.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblCremaPrecio.setText("$1.20");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrema, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(lblCrema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCremaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCrema)
                .addGap(5, 5, 5)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCrema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCremaPrecio))
                .addGap(53, 53, 53))
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 140, 140));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        lblAzucar.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblAzucar.setText("Azúcar ");

        btnAzucar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/cafeteria_tarea/imagenes/Azucar.png"))); // NOI18N
        btnAzucar.addActionListener(this::btnAzucarActionPerformed);

        lblAzucarPrecio.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblAzucarPrecio.setText("$0.50");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAzucar, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(lblAzucar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAzucarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAzucar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAzucar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAzucarPrecio))
                .addGap(65, 65, 65))
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 100, 140, 140));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        lblSalami.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblSalami.setText("Salami");

        btnSalami.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/cafeteria_tarea/imagenes/Salami.png"))); // NOI18N
        btnSalami.addActionListener(this::btnSalamiActionPerformed);

        lblSalamiPrecio.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblSalamiPrecio.setText("$3.00");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(btnSalami, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(lblSalami, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSalamiPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalami)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalami, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSalamiPrecio))
                .addGap(65, 65, 65))
        );

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, 140, 140));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        lblTomate.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblTomate.setText("Tomate");

        btnTomate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/cafeteria_tarea/imagenes/Tomate.png"))); // NOI18N
        btnTomate.addActionListener(this::btnTomateActionPerformed);

        lblTomatePrecio.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblTomatePrecio.setText("$1.10");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(btnTomate, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(lblTomate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTomatePrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTomate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTomate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTomatePrecio))
                .addGap(65, 65, 65))
        );

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, 140, 140));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        lblQueso.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblQueso.setText("Queso");

        btnQueso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/cafeteria_tarea/imagenes/Queso.png"))); // NOI18N
        btnQueso.addActionListener(this::btnQuesoActionPerformed);

        lblQuesoPrecio.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblQuesoPrecio.setText("$1.00");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnQueso)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(lblQueso, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblQuesoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(btnQueso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQueso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQuesoPrecio))
                .addGap(65, 65, 65))
        );

        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 260, 140, 140));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        lblPepperoni.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblPepperoni.setText("Pepperoni");

        btnPepperoni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/cafeteria_tarea/imagenes/Pepperoni.png"))); // NOI18N
        btnPepperoni.addActionListener(this::btnPepperoniActionPerformed);

        lblPepperoniPrecio.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblPepperoniPrecio.setText("$1.10");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(lblPepperoni, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPepperoniPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPepperoni))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(btnPepperoni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPepperoni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPepperoniPrecio))
                .addGap(65, 65, 65))
        );

        jPanel1.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 260, 130, 140));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        lblPollo.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblPollo.setText("Pollo");

        btnPollo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/cafeteria_tarea/imagenes/Pollo.png"))); // NOI18N
        btnPollo.addActionListener(this::btnPolloActionPerformed);

        lblPolloPrecio.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblPolloPrecio.setText("$1.50");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(btnPollo)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(lblPollo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPolloPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPollo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPollo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPolloPrecio))
                .addGap(65, 65, 65))
        );

        jPanel1.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 420, 140, 140));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        lblVinagreta.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblVinagreta.setText("Vinagreta");

        btnVinagreta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/cafeteria_tarea/imagenes/Vinagreta.png"))); // NOI18N

        lblVinagretaPrecio.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblVinagretaPrecio.setText("$0.50");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(lblVinagreta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblVinagretaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVinagreta)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVinagreta)
                .addGap(7, 7, 7)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVinagreta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVinagretaPrecio))
                .addGap(65, 65, 65))
        );

        jPanel1.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 420, 130, 140));

        btnConfirmar.setBackground(new java.awt.Color(117, 190, 188));
        btnConfirmar.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(20, 80, 76));
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/cafeteria_tarea/imagenes/confirmacion.png"))); // NOI18N
        btnConfirmar.setText("Confirmar Pedido");
        btnConfirmar.addActionListener(this::btnConfirmarActionPerformed);
        jPanel1.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 590, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCafeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCafeActionPerformed

    private void btnCremaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCremaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCremaActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPizzaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPizzaActionPerformed

    private void btnEnsaladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnsaladaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnsaladaActionPerformed

    private void btnSalamiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalamiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalamiActionPerformed

    private void btnTomateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTomateActionPerformed

    private void btnAzucarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzucarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAzucarActionPerformed

    private void btnQuesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuesoActionPerformed

    private void btnPolloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPolloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPolloActionPerformed

    private void btnPepperoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPepperoniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPepperoniActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {PrincipalView vista = new PrincipalView();
        new CafeteriaController(vista);
        vista.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAzucar;
    private javax.swing.JButton btnCafe;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnCrema;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEnsalada;
    private javax.swing.JButton btnPepperoni;
    private javax.swing.JButton btnPizza;
    private javax.swing.JButton btnPollo;
    private javax.swing.JButton btnQueso;
    private javax.swing.JButton btnSalami;
    private javax.swing.JButton btnTomate;
    private javax.swing.JButton btnVinagreta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAzucar;
    private javax.swing.JLabel lblAzucarPrecio;
    private javax.swing.JLabel lblCafe;
    private javax.swing.JLabel lblCafePrecio;
    private javax.swing.JLabel lblCrema;
    private javax.swing.JLabel lblCremaPrecio;
    private javax.swing.JLabel lblEnsalada;
    private javax.swing.JLabel lblEnsaladaPrecio;
    private javax.swing.JLabel lblPepperoni;
    private javax.swing.JLabel lblPepperoniPrecio;
    private javax.swing.JLabel lblPizza;
    private javax.swing.JLabel lblPizzaPrecio;
    private javax.swing.JLabel lblPollo;
    private javax.swing.JLabel lblPolloPrecio;
    private javax.swing.JLabel lblQueso;
    private javax.swing.JLabel lblQuesoPrecio;
    private javax.swing.JLabel lblSalami;
    private javax.swing.JLabel lblSalamiPrecio;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTomate;
    private javax.swing.JLabel lblTomatePrecio;
    private javax.swing.JLabel lblVinagreta;
    private javax.swing.JLabel lblVinagretaPrecio;
    private javax.swing.JTable tlbFactura;
    // End of variables declaration//GEN-END:variables
}
