/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.DaoCategorias;
import controlador.DaoClientes;
import controlador.DaoEntradas;
import controlador.DaoProductos;
import controlador.DaoProveedor;
import controlador.DaoSalida;
import controlador.DaoUsuario;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.clientes;
import modelo.productos;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author HELIO
 */
public class Home extends javax.swing.JPanel {

DaoCategorias daoC=new DaoCategorias();
DaoClientes daoCl=new DaoClientes();
DaoEntradas daoE=new DaoEntradas();
DaoProveedor daoP=new DaoProveedor();
DaoSalida daoS=new DaoSalida();
DaoUsuario daoU=new DaoUsuario();
DaoProductos daoPr=new DaoProductos();

DefaultTableModel modeloClientesF=new DefaultTableModel();
DefaultTableModel modeloProdF=new DefaultTableModel();
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
        txtCantCat.setText(daoC.cantCategorias()+"");
        txtcantClientes.setText(daoCl.cantClientes()+"");
        txtcantEntradas.setText(daoE.cantEntradas()+"");
        txtcantproveedores.setText(daoP.cantProveedores()+"");
        txtcantSalidas.setText(daoS.cantSalidas()+"");
        txtcantUsuarios.setText(daoU.cantUsuarios()+"");

        listarClientesFrecuentes();
        listarProdFrecuentes();

        txttotalSalidas.setText(daoS.TotalSalidas(selectmes.getMonth()+1,selectAño.getYear())+" S/.");
       txttotalEntradas.setText(daoE.TotalEntradas(selectmes.getMonth()+1,selectAño.getYear())+" S/.");
    }

    private void listarClientesFrecuentes(){
        List<clientes> lista=daoCl.clientesFrecuentes();
        modeloClientesF=(DefaultTableModel) tablaClienteF.getModel();
        Object[] ob=new Object[3];
        for(int i=0;i<lista.size();i++){
            ob[0]=lista.get(i).getCantSalidas();
            ob[1]=lista.get(i).getNombre();
            ob[2]=lista.get(i).getDocumento();
            modeloClientesF.addRow(ob);
        }
       tablaClienteF.setModel(modeloClientesF);

        graficarClientesF();
    }

    private void listarProdFrecuentes(){
        List<productos> lista=daoPr.ProdFrecuentes();
        modeloProdF=(DefaultTableModel) tablaProductoF.getModel();
        Object[] ob=new Object[2];
        for(int i=0;i<lista.size();i++){
            ob[0]=lista.get(i).getCantF();
            ob[1]=lista.get(i).getNomProd();
            modeloProdF.addRow(ob);
        }
       tablaProductoF.setModel(modeloProdF);

        graficarProdF();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelRound7 = new modelo.JpanelRound();
        jpanelRound6 = new modelo.JpanelRound();
        jLabel11 = new javax.swing.JLabel();
        txtcantUsuarios = new javax.swing.JLabel();
        jpanelRound1 = new modelo.JpanelRound();
        jLabel1 = new javax.swing.JLabel();
        txtCantCat = new javax.swing.JLabel();
        jpanelRound2 = new modelo.JpanelRound();
        jLabel3 = new javax.swing.JLabel();
        txtcantClientes = new javax.swing.JLabel();
        jpanelRound3 = new modelo.JpanelRound();
        jLabel5 = new javax.swing.JLabel();
        txtcantEntradas = new javax.swing.JLabel();
        jpanelRound4 = new modelo.JpanelRound();
        jLabel7 = new javax.swing.JLabel();
        txtcantproveedores = new javax.swing.JLabel();
        jpanelRound5 = new modelo.JpanelRound();
        jLabel9 = new javax.swing.JLabel();
        txtcantSalidas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClienteF = new javax.swing.JTable();
        panelClientesF = new modelo.JpanelRound();
        panelProdF = new modelo.JpanelRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductoF = new javax.swing.JTable();
        txttotalEntradas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txttotalSalidas = new javax.swing.JLabel();
        selectAño = new com.toedter.calendar.JYearChooser();
        selectmes = new com.toedter.calendar.JMonthChooser();
        btnProcesaar = new RSMaterialComponent.RSButtonMaterialIconDos();

        setBackground(new java.awt.Color(238, 238, 238));
        setPreferredSize(new java.awt.Dimension(1007, 775));

        jpanelRound7.setBackground(new java.awt.Color(238, 238, 238));
        jpanelRound7.setRoundBottomLeft(25);
        jpanelRound7.setRoundBottomRight(25);
        jpanelRound7.setRoundTopLeft(25);
        jpanelRound7.setRoundTopRight(25);

        jpanelRound6.setBackground(new java.awt.Color(134, 217, 223));
        jpanelRound6.setRoundBottomLeft(25);
        jpanelRound6.setRoundBottomRight(25);
        jpanelRound6.setRoundTopLeft(25);
        jpanelRound6.setRoundTopRight(25);

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel11.setText("Usuarios");

        txtcantUsuarios.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtcantUsuarios.setText("10");

        javax.swing.GroupLayout jpanelRound6Layout = new javax.swing.GroupLayout(jpanelRound6);
        jpanelRound6.setLayout(jpanelRound6Layout);
        jpanelRound6Layout.setHorizontalGroup(
            jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound6Layout.createSequentialGroup()
                .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound6Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel11))
                    .addGroup(jpanelRound6Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(txtcantUsuarios)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jpanelRound6Layout.setVerticalGroup(
            jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcantUsuarios)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jpanelRound1.setBackground(new java.awt.Color(134, 184, 223));
        jpanelRound1.setRoundBottomLeft(25);
        jpanelRound1.setRoundBottomRight(25);
        jpanelRound1.setRoundTopLeft(25);
        jpanelRound1.setRoundTopRight(25);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Categorias");

        txtCantCat.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtCantCat.setText("3");

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1))
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(txtCantCat)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantCat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanelRound2.setBackground(new java.awt.Color(233, 82, 106));
        jpanelRound2.setRoundBottomLeft(25);
        jpanelRound2.setRoundBottomRight(25);
        jpanelRound2.setRoundTopLeft(25);
        jpanelRound2.setRoundTopRight(25);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setText("Clientes");

        txtcantClientes.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtcantClientes.setText("15");

        javax.swing.GroupLayout jpanelRound2Layout = new javax.swing.GroupLayout(jpanelRound2);
        jpanelRound2.setLayout(jpanelRound2Layout);
        jpanelRound2Layout.setHorizontalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3))
                    .addGroup(jpanelRound2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(txtcantClientes)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jpanelRound2Layout.setVerticalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcantClientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanelRound3.setBackground(new java.awt.Color(50, 181, 77));
        jpanelRound3.setRoundBottomLeft(25);
        jpanelRound3.setRoundBottomRight(25);
        jpanelRound3.setRoundTopLeft(25);
        jpanelRound3.setRoundTopRight(25);

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setText("Entradas");

        txtcantEntradas.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtcantEntradas.setText("20");

        javax.swing.GroupLayout jpanelRound3Layout = new javax.swing.GroupLayout(jpanelRound3);
        jpanelRound3.setLayout(jpanelRound3Layout);
        jpanelRound3Layout.setHorizontalGroup(
            jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound3Layout.createSequentialGroup()
                .addGroup(jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5))
                    .addGroup(jpanelRound3Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(txtcantEntradas)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jpanelRound3Layout.setVerticalGroup(
            jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcantEntradas)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpanelRound4.setBackground(new java.awt.Color(240, 195, 117));
        jpanelRound4.setRoundBottomLeft(25);
        jpanelRound4.setRoundBottomRight(25);
        jpanelRound4.setRoundTopLeft(25);
        jpanelRound4.setRoundTopRight(25);

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setText("Proveedores");

        txtcantproveedores.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtcantproveedores.setText("5");

        javax.swing.GroupLayout jpanelRound4Layout = new javax.swing.GroupLayout(jpanelRound4);
        jpanelRound4.setLayout(jpanelRound4Layout);
        jpanelRound4Layout.setHorizontalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound4Layout.createSequentialGroup()
                .addGroup(jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel7))
                    .addGroup(jpanelRound4Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(txtcantproveedores)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jpanelRound4Layout.setVerticalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcantproveedores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanelRound5.setBackground(new java.awt.Color(141, 134, 223));
        jpanelRound5.setRoundBottomLeft(25);
        jpanelRound5.setRoundBottomRight(25);
        jpanelRound5.setRoundTopLeft(25);
        jpanelRound5.setRoundTopRight(25);

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel9.setText("Salidas");

        txtcantSalidas.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtcantSalidas.setText("5");

        javax.swing.GroupLayout jpanelRound5Layout = new javax.swing.GroupLayout(jpanelRound5);
        jpanelRound5.setLayout(jpanelRound5Layout);
        jpanelRound5Layout.setHorizontalGroup(
            jpanelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound5Layout.createSequentialGroup()
                .addGroup(jpanelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound5Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel9))
                    .addGroup(jpanelRound5Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(txtcantSalidas)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jpanelRound5Layout.setVerticalGroup(
            jpanelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcantSalidas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaClienteF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Cant.", "Documento"
            }
        ));
        jScrollPane1.setViewportView(tablaClienteF);

        panelClientesF.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelClientesFLayout = new javax.swing.GroupLayout(panelClientesF);
        panelClientesF.setLayout(panelClientesFLayout);
        panelClientesFLayout.setHorizontalGroup(
            panelClientesFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );
        panelClientesFLayout.setVerticalGroup(
            panelClientesFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        panelProdF.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelProdFLayout = new javax.swing.GroupLayout(panelProdF);
        panelProdF.setLayout(panelProdFLayout);
        panelProdFLayout.setHorizontalGroup(
            panelProdFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );
        panelProdFLayout.setVerticalGroup(
            panelProdFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        tablaProductoF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prodcuto", "Cant."
            }
        ));
        jScrollPane2.setViewportView(tablaProductoF);

        txttotalEntradas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txttotalEntradas.setForeground(new java.awt.Color(255, 0, 51));
        txttotalEntradas.setText("100 S/.");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Entradas");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Salidas");

        txttotalSalidas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txttotalSalidas.setForeground(new java.awt.Color(0, 153, 51));
        txttotalSalidas.setText("100 S/.");

        btnProcesaar.setBackground(new java.awt.Color(14, 76, 117));
        btnProcesaar.setText("Calcular");
        btnProcesaar.setBackgroundHover(new java.awt.Color(50, 130, 181));
        btnProcesaar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnProcesaar.setRound(25);
        btnProcesaar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesaarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound7Layout = new javax.swing.GroupLayout(jpanelRound7);
        jpanelRound7.setLayout(jpanelRound7Layout);
        jpanelRound7Layout.setHorizontalGroup(
            jpanelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound7Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(jpanelRound7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panelClientesF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(panelProdF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jpanelRound7Layout.createSequentialGroup()
                .addGroup(jpanelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound7Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpanelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelRound7Layout.createSequentialGroup()
                                .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jpanelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanelRound7Layout.createSequentialGroup()
                                .addComponent(jpanelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jpanelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpanelRound7Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txttotalEntradas)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txttotalSalidas)
                        .addGap(114, 114, 114)
                        .addComponent(selectAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(selectmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnProcesaar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelRound7Layout.setVerticalGroup(
            jpanelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jpanelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanelRound6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jpanelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound7Layout.createSequentialGroup()
                        .addGroup(jpanelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txttotalEntradas)
                                .addComponent(jLabel4)
                                .addComponent(txttotalSalidas)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(selectAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(selectmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(jpanelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelProdF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelClientesF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnProcesaar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelRound7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelRound7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesaarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesaarActionPerformed
        // TODO add your handling code here:
       txttotalSalidas.setText(daoS.TotalSalidas(selectmes.getMonth()+1,selectAño.getYear())+" S/.");
        txttotalEntradas.setText(daoE.TotalEntradas(selectmes.getMonth()+1,selectAño.getYear())+" S/.");
    }//GEN-LAST:event_btnProcesaarActionPerformed


    void graficarClientesF(){
      DefaultCategoryDataset dtsc = new DefaultCategoryDataset();
      for(int i=0;i<tablaClienteF.getRowCount();i++){
        dtsc.setValue(Double.parseDouble(tablaClienteF.getValueAt(i, 0).toString()),tablaClienteF.getValueAt(i, 0).toString(),tablaClienteF.getValueAt(i, 1).toString());
      }
      JFreeChart ch = ChartFactory.createBarChart("3 clientes Frecuentes", "Clientes", "Salidas", dtsc,PlotOrientation.VERTICAL,true,true,true);
      ChartPanel cp=new ChartPanel(ch);
      panelClientesF.add(cp);
      cp.setBounds(0,0,460, 270);
    }

    void graficarProdF(){
      DefaultCategoryDataset dtsc = new DefaultCategoryDataset();
      for(int i=0;i<tablaProductoF.getRowCount();i++){
        dtsc.setValue(Double.parseDouble(tablaProductoF.getValueAt(i, 0).toString()),tablaProductoF.getValueAt(i, 0).toString(),tablaProductoF.getValueAt(i, 1).toString());
      }
      JFreeChart ch = ChartFactory.createBarChart("3 Productos Frecuentes", "Productos", "Salidas", dtsc,PlotOrientation.VERTICAL,true,true,true);
      ChartPanel cp=new ChartPanel(ch);
      panelProdF.add(cp);
      cp.setBounds(0,0,453, 270);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnProcesaar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private modelo.JpanelRound jpanelRound1;
    private modelo.JpanelRound jpanelRound2;
    private modelo.JpanelRound jpanelRound3;
    private modelo.JpanelRound jpanelRound4;
    private modelo.JpanelRound jpanelRound5;
    private modelo.JpanelRound jpanelRound6;
    private modelo.JpanelRound jpanelRound7;
    private modelo.JpanelRound panelClientesF;
    private modelo.JpanelRound panelProdF;
    private com.toedter.calendar.JYearChooser selectAño;
    private com.toedter.calendar.JMonthChooser selectmes;
    private javax.swing.JTable tablaClienteF;
    private javax.swing.JTable tablaProductoF;
    private javax.swing.JLabel txtCantCat;
    private javax.swing.JLabel txtcantClientes;
    private javax.swing.JLabel txtcantEntradas;
    private javax.swing.JLabel txtcantSalidas;
    private javax.swing.JLabel txtcantUsuarios;
    private javax.swing.JLabel txtcantproveedores;
    private javax.swing.JLabel txttotalEntradas;
    private javax.swing.JLabel txttotalSalidas;
    // End of variables declaration//GEN-END:variables
}
