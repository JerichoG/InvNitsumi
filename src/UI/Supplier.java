package UI;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import DAO.SupplierDAO;
import DTO.SupplierDTO;
import java.awt.Toolkit;

/**
 *
 * @author ASUS
 */
public class Supplier extends javax.swing.JFrame {

    
    public Supplier() {
        initComponents();
        TextSupplierId.setVisible(false);
        loadDatas();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Logo.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AtasPanel = new javax.swing.JPanel();
        NamaToko = new javax.swing.JLabel();
        IconHome = new javax.swing.JLabel();
        BawahPanel = new javax.swing.JPanel();
        MenuPanel = new javax.swing.JPanel();
        PanelSup = new javax.swing.JPanel();
        Supplier = new javax.swing.JLabel();
        PanelPro = new javax.swing.JPanel();
        Product = new javax.swing.JLabel();
        PanelStock = new javax.swing.JPanel();
        Stock = new javax.swing.JLabel();
        PanelPurchase = new javax.swing.JPanel();
        Purchase = new javax.swing.JLabel();
        PanelOrder = new javax.swing.JPanel();
        Order = new javax.swing.JLabel();
        PanelUser = new javax.swing.JPanel();
        User = new javax.swing.JLabel();
        PanelLogout = new javax.swing.JPanel();
        Logout = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelSupplier = new javax.swing.JTable();
        ButtonTambah = new javax.swing.JButton();
        ButtonEdit = new javax.swing.JButton();
        ButtonHapus = new javax.swing.JButton();
        LabelSearch = new javax.swing.JLabel();
        TextSearch = new javax.swing.JTextField();
        LabelToko = new javax.swing.JLabel();
        LabelAlamat = new javax.swing.JLabel();
        TextAlamat = new javax.swing.JTextField();
        TextNamaToko = new javax.swing.JTextField();
        TextSupplierCode = new javax.swing.JTextField();
        LabelHP = new javax.swing.JLabel();
        TextNoHp = new javax.swing.JTextField();
        BtnClear = new javax.swing.JButton();
        LabelIDSupplier = new javax.swing.JLabel();
        TextSupplierId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        AtasPanel.setBackground(new java.awt.Color(255, 153, 51));

        NamaToko.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        NamaToko.setForeground(new java.awt.Color(255, 255, 255));
        NamaToko.setText("INVENTORY NITSUMI");

        IconHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICON/1home.png"))); // NOI18N
        IconHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconHomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AtasPanelLayout = new javax.swing.GroupLayout(AtasPanel);
        AtasPanel.setLayout(AtasPanelLayout);
        AtasPanelLayout.setHorizontalGroup(
            AtasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AtasPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(NamaToko)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IconHome)
                .addGap(27, 27, 27))
        );
        AtasPanelLayout.setVerticalGroup(
            AtasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AtasPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(AtasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NamaToko)
                    .addComponent(IconHome))
                .addContainerGap())
        );

        BawahPanel.setBackground(new java.awt.Color(255, 153, 51));

        javax.swing.GroupLayout BawahPanelLayout = new javax.swing.GroupLayout(BawahPanel);
        BawahPanel.setLayout(BawahPanelLayout);
        BawahPanelLayout.setHorizontalGroup(
            BawahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        BawahPanelLayout.setVerticalGroup(
            BawahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        MenuPanel.setBackground(new java.awt.Color(255, 153, 51));
        MenuPanel.setForeground(new java.awt.Color(255, 255, 255));

        PanelSup.setBackground(new java.awt.Color(255, 153, 51));
        PanelSup.setPreferredSize(new java.awt.Dimension(209, 60));
        PanelSup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelSupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelSupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelSupMouseExited(evt);
            }
        });

        Supplier.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Supplier.setForeground(new java.awt.Color(255, 255, 255));
        Supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICON/4Sup.png"))); // NOI18N
        Supplier.setText("   Supplier");
        Supplier.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SupplierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SupplierMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelSupLayout = new javax.swing.GroupLayout(PanelSup);
        PanelSup.setLayout(PanelSupLayout);
        PanelSupLayout.setHorizontalGroup(
            PanelSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSupLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelSupLayout.setVerticalGroup(
            PanelSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        PanelPro.setBackground(new java.awt.Color(255, 153, 51));
        PanelPro.setPreferredSize(new java.awt.Dimension(209, 60));

        Product.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Product.setForeground(new java.awt.Color(255, 255, 255));
        Product.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICON/product2.png"))); // NOI18N
        Product.setText("   Product");
        Product.setMaximumSize(new java.awt.Dimension(154, 29));
        Product.setMinimumSize(new java.awt.Dimension(154, 29));
        Product.setPreferredSize(new java.awt.Dimension(154, 29));
        Product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProductMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProductMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelProLayout = new javax.swing.GroupLayout(PanelPro);
        PanelPro.setLayout(PanelProLayout);
        PanelProLayout.setHorizontalGroup(
            PanelProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelProLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(Product, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelProLayout.setVerticalGroup(
            PanelProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        PanelStock.setBackground(new java.awt.Color(255, 153, 51));
        PanelStock.setPreferredSize(new java.awt.Dimension(209, 60));
        PanelStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelStockMouseClicked(evt);
            }
        });

        Stock.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Stock.setForeground(new java.awt.Color(255, 255, 255));
        Stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICON/1stack.png"))); // NOI18N
        Stock.setText("   Stock");
        Stock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StockMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelStockLayout = new javax.swing.GroupLayout(PanelStock);
        PanelStock.setLayout(PanelStockLayout);
        PanelStockLayout.setHorizontalGroup(
            PanelStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelStockLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelStockLayout.setVerticalGroup(
            PanelStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelStockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Stock)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        PanelPurchase.setBackground(new java.awt.Color(255, 153, 51));
        PanelPurchase.setPreferredSize(new java.awt.Dimension(209, 60));

        Purchase.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Purchase.setForeground(new java.awt.Color(255, 255, 255));
        Purchase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICON/1purchase.png"))); // NOI18N
        Purchase.setText("   Purchase");
        Purchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PurchaseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PurchaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PurchaseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelPurchaseLayout = new javax.swing.GroupLayout(PanelPurchase);
        PanelPurchase.setLayout(PanelPurchaseLayout);
        PanelPurchaseLayout.setHorizontalGroup(
            PanelPurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPurchaseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelPurchaseLayout.setVerticalGroup(
            PanelPurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPurchaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Purchase)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        PanelOrder.setBackground(new java.awt.Color(255, 153, 51));
        PanelOrder.setPreferredSize(new java.awt.Dimension(209, 60));

        Order.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Order.setForeground(new java.awt.Color(255, 255, 255));
        Order.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICON/1shopping-cart.png"))); // NOI18N
        Order.setText("   Order");
        Order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OrderMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelOrderLayout = new javax.swing.GroupLayout(PanelOrder);
        PanelOrder.setLayout(PanelOrderLayout);
        PanelOrderLayout.setHorizontalGroup(
            PanelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOrderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Order, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelOrderLayout.setVerticalGroup(
            PanelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Order)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        PanelUser.setBackground(new java.awt.Color(255, 153, 51));
        PanelUser.setPreferredSize(new java.awt.Dimension(209, 60));

        User.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        User.setForeground(new java.awt.Color(255, 255, 255));
        User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICON/1user.png"))); // NOI18N
        User.setText("   User");
        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelUserLayout = new javax.swing.GroupLayout(PanelUser);
        PanelUser.setLayout(PanelUserLayout);
        PanelUserLayout.setHorizontalGroup(
            PanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelUserLayout.setVerticalGroup(
            PanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(User)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        PanelLogout.setBackground(new java.awt.Color(255, 153, 51));
        PanelLogout.setPreferredSize(new java.awt.Dimension(209, 60));

        Logout.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICON/1power-off.png"))); // NOI18N
        Logout.setText("   Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelLogoutLayout = new javax.swing.GroupLayout(PanelLogout);
        PanelLogout.setLayout(PanelLogoutLayout);
        PanelLogoutLayout.setHorizontalGroup(
            PanelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLogoutLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelLogoutLayout.setVerticalGroup(
            PanelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logout)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPro, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
            .addComponent(PanelStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
            .addComponent(PanelPurchase, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
            .addComponent(PanelOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
            .addComponent(PanelUser, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
            .addComponent(PanelLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
            .addComponent(PanelSup, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanelLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(PanelSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        MainPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("SUPPLIER");

        TabelSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        TabelSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelSupplierMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelSupplier);
        if (TabelSupplier.getColumnModel().getColumnCount() > 0) {
            TabelSupplier.getColumnModel().getColumn(0).setPreferredWidth(15);
        }

        ButtonTambah.setBackground(new java.awt.Color(255, 153, 51));
        ButtonTambah.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        ButtonTambah.setForeground(new java.awt.Color(255, 255, 255));
        ButtonTambah.setText("Add");
        ButtonTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonTambahMouseClicked(evt);
            }
        });
        ButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTambahActionPerformed(evt);
            }
        });

        ButtonEdit.setBackground(new java.awt.Color(255, 153, 51));
        ButtonEdit.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        ButtonEdit.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEdit.setText("Update");
        ButtonEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonEditMouseClicked(evt);
            }
        });
        ButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditActionPerformed(evt);
            }
        });

        ButtonHapus.setBackground(new java.awt.Color(255, 153, 51));
        ButtonHapus.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        ButtonHapus.setForeground(new java.awt.Color(255, 255, 255));
        ButtonHapus.setText("Delete");
        ButtonHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonHapusMouseClicked(evt);
            }
        });
        ButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHapusActionPerformed(evt);
            }
        });

        LabelSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelSearch.setText("Search");

        TextSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSearchActionPerformed(evt);
            }
        });
        TextSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextSearchKeyReleased(evt);
            }
        });

        LabelToko.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelToko.setText("Nama Toko");

        LabelAlamat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelAlamat.setText("Alamat");

        TextAlamat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextAlamatActionPerformed(evt);
            }
        });

        TextNamaToko.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextNamaToko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNamaTokoActionPerformed(evt);
            }
        });

        TextSupplierCode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextSupplierCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSupplierCodeActionPerformed(evt);
            }
        });

        LabelHP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelHP.setText("No. HP");

        TextNoHp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextNoHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNoHpActionPerformed(evt);
            }
        });

        BtnClear.setBackground(new java.awt.Color(255, 153, 51));
        BtnClear.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        BtnClear.setForeground(new java.awt.Color(255, 255, 255));
        BtnClear.setText("Clear");
        BtnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnClearMouseClicked(evt);
            }
        });
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });

        LabelIDSupplier.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelIDSupplier.setText("Kode Supplier");

        TextSupplierId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextSupplierId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSupplierIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabelToko, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelHP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelIDSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextNamaToko, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(TextAlamat)
                                    .addComponent(TextNoHp)
                                    .addComponent(TextSupplierCode)))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(ButtonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TextSupplierId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextSupplierCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelIDSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelToko, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextNamaToko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(LabelAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelHP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(TextAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextSupplierId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BawahPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AtasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(AtasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BawahPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void setColor(JPanel p)
    {
	p.setBackground(new Color(255,102,0));
    }
    public void resetColor(JPanel p)
    {
	p.setBackground(new Color(255,153,51));
    }

    private void SupplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierMouseEntered
        setColor(PanelSup);
    }//GEN-LAST:event_SupplierMouseEntered

    private void SupplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierMouseExited
        resetColor(PanelSup);
    }//GEN-LAST:event_SupplierMouseExited

    private void ProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductMouseEntered
        setColor(PanelPro);
    }//GEN-LAST:event_ProductMouseEntered

    private void ProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductMouseExited
        resetColor(PanelPro);
    }//GEN-LAST:event_ProductMouseExited

    private void StockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StockMouseEntered
        setColor(PanelStock);
    }//GEN-LAST:event_StockMouseEntered

    private void StockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StockMouseExited
        resetColor(PanelStock);
    }//GEN-LAST:event_StockMouseExited

    private void PurchaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PurchaseMouseEntered
        setColor(PanelPurchase);
    }//GEN-LAST:event_PurchaseMouseEntered

    private void PurchaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PurchaseMouseExited
        resetColor(PanelPurchase);
    }//GEN-LAST:event_PurchaseMouseExited

    private void OrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderMouseEntered
        setColor(PanelOrder);
    }//GEN-LAST:event_OrderMouseEntered

    private void OrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderMouseExited
        resetColor(PanelOrder);
    }//GEN-LAST:event_OrderMouseExited

    private void UserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseEntered
        setColor(PanelUser);
    }//GEN-LAST:event_UserMouseEntered

    private void UserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseExited
        resetColor(PanelUser);
    }//GEN-LAST:event_UserMouseExited

    private void LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseEntered
        setColor(PanelLogout);
    }//GEN-LAST:event_LogoutMouseEntered

    private void LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseExited
        resetColor(PanelLogout);
    }//GEN-LAST:event_LogoutMouseExited

    private void ButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonEditActionPerformed

    private void ButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonHapusActionPerformed

    private void ButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTambahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonTambahActionPerformed

    private void TextSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSearchActionPerformed

    private void TextAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextAlamatActionPerformed

    private void TextNamaTokoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNamaTokoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNamaTokoActionPerformed

    private void TextNoHpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNoHpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNoHpActionPerformed

    private void PanelSupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSupMouseClicked
        Supplier sup = new Supplier();
        sup.setExtendedState(JFrame.MAXIMIZED_BOTH);
        sup.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PanelSupMouseClicked

    private void PanelSupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSupMouseEntered
        setColor(PanelSup);
    }//GEN-LAST:event_PanelSupMouseEntered

    private void PanelSupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSupMouseExited
         resetColor(PanelSup);
    }//GEN-LAST:event_PanelSupMouseExited

    private void ProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductMouseClicked
        Product pro = new Product();
        pro.setExtendedState(JFrame.MAXIMIZED_BOTH);
        pro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProductMouseClicked

    private void PanelStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelStockMouseClicked
        Stock st = new Stock();
        st.setExtendedState(JFrame.MAXIMIZED_BOTH);
        st.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PanelStockMouseClicked

    private void PurchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PurchaseMouseClicked
        Purchase prc = new Purchase();
        prc.setExtendedState(JFrame.MAXIMIZED_BOTH);
        prc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PurchaseMouseClicked

    private void OrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderMouseClicked
        Order or = new Order();
        or.setExtendedState(JFrame.MAXIMIZED_BOTH);
        or.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_OrderMouseClicked

    private void UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseClicked
        User usr = new User();
        usr.setExtendedState(JFrame.MAXIMIZED_BOTH);
        usr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UserMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        Login lg = new Login();
        lg.setExtendedState(JFrame.MAXIMIZED_BOTH);
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutMouseClicked

    private void IconHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconHomeMouseClicked
       Dashboard mn = new Dashboard();
       mn.setExtendedState(JFrame.MAXIMIZED_BOTH);
       mn.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_IconHomeMouseClicked

    private void TabelSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelSupplierMouseClicked
        int row = TabelSupplier.getSelectedRow();
        int column = TabelSupplier.getColumnCount();
        Object[] val = new Object[column];
        for(int i = 0; i < column; i++) {
            val[i]=TabelSupplier.getValueAt(row, i);
        }
        TextSupplierId.setText(val[0].toString());
        TextSupplierCode.setText((String) val[1]);
        TextNamaToko.setText((String) val[2]);
        TextAlamat.setText((String) val[3]);
        TextNoHp.setText((String) val[4]);
    }//GEN-LAST:event_TabelSupplierMouseClicked

    private void ButtonTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonTambahMouseClicked
         if(TextNamaToko.getText().equals("") || TextAlamat.getText().equals("") || TextNoHp.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Tolong isi semua data!");
        }else{
            SupplierDTO supplierdto = new SupplierDTO();
            supplierdto.setSupplierCode(TextSupplierCode.getText());
            supplierdto.setNamaSupplier(TextNamaToko.getText());
            supplierdto.setAlamat(TextAlamat.getText());
            supplierdto.setNoHP(TextNoHp.getText());
            new SupplierDAO().addSupplierDAO(supplierdto);
            loadDatas();
    }//GEN-LAST:event_ButtonTambahMouseClicked
    }
    private void ButtonEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonEditMouseClicked
        if(TabelSupplier.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null,"Pilih data pada tabel terlebih dahulu!");
        }else{
            if(TextSupplierCode.getText().equals("") ||TextNamaToko.getText().equals("") || TextAlamat.getText().equals("") || TextNoHp.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Tolong isi semua data!");
            }else{

            SupplierDTO supplierdto = new SupplierDTO();
            supplierdto.setSupplierId(Integer.parseInt(TextSupplierId.getText()));
            supplierdto.setSupplierCode(TextSupplierCode.getText());
            supplierdto.setNamaSupplier(TextNamaToko.getText());
            supplierdto.setAlamat(TextAlamat.getText());
            supplierdto.setNoHP(TextNoHp.getText());
            new SupplierDAO().editSupplierDAO(supplierdto);
            loadDatas();
                //table.getColumn("sid").setMaxWidth(0);
            }
        }
    }//GEN-LAST:event_ButtonEditMouseClicked

    private void ButtonHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonHapusMouseClicked
        if(TabelSupplier.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null,"Pilih data pada tabel terlebih dahulu!");
        }else{
            new SupplierDAO().deleteSupplierDAO(TabelSupplier.getValueAt(TabelSupplier.getSelectedRow(),1).toString());
            loadDatas();
        }
    }//GEN-LAST:event_ButtonHapusMouseClicked

    private void BtnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClearMouseClicked
        TextSupplierId.setText("");
        TextSupplierCode.setText("");
        TextNamaToko.setText("");
        TextAlamat.setText("");
        TextNoHp.setText("");
    }//GEN-LAST:event_BtnClearMouseClicked

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnClearActionPerformed

    private void TextSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextSearchKeyReleased
        String text=TextSearch.getText();
        loadSearchSuppliersDatas(text);
    }//GEN-LAST:event_TextSearchKeyReleased

    private void TextSupplierCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSupplierCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSupplierCodeActionPerformed

    private void TextSupplierIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSupplierIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSupplierIdActionPerformed

    private void StockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StockMouseClicked
       Stock st = new Stock();
       st.setExtendedState(JFrame.MAXIMIZED_BOTH);
       st.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_StockMouseClicked

    public void loadDatas(){
            try{
                SupplierDAO supplierDAO=new SupplierDAO();
                TabelSupplier.setModel(supplierDAO.buildTableModel(supplierDAO.getQueryResult()));
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    public void loadSearchSuppliersDatas(String text){
            try{
                SupplierDAO supplierDAO=new SupplierDAO();
                TabelSupplier.setModel(supplierDAO.buildTableModel(supplierDAO.getSearchSuppliersQueryResult(text)));
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    
    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AtasPanel;
    private javax.swing.JPanel BawahPanel;
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton ButtonEdit;
    private javax.swing.JButton ButtonHapus;
    private javax.swing.JButton ButtonTambah;
    private javax.swing.JLabel IconHome;
    private javax.swing.JLabel LabelAlamat;
    private javax.swing.JLabel LabelHP;
    private javax.swing.JLabel LabelIDSupplier;
    private javax.swing.JLabel LabelSearch;
    private javax.swing.JLabel LabelToko;
    private javax.swing.JLabel Logout;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JLabel NamaToko;
    private javax.swing.JLabel Order;
    private javax.swing.JPanel PanelLogout;
    private javax.swing.JPanel PanelOrder;
    private javax.swing.JPanel PanelPro;
    private javax.swing.JPanel PanelPurchase;
    private javax.swing.JPanel PanelStock;
    private javax.swing.JPanel PanelSup;
    private javax.swing.JPanel PanelUser;
    private javax.swing.JLabel Product;
    private javax.swing.JLabel Purchase;
    private javax.swing.JLabel Stock;
    private javax.swing.JLabel Supplier;
    private javax.swing.JTable TabelSupplier;
    private javax.swing.JTextField TextAlamat;
    private javax.swing.JTextField TextNamaToko;
    private javax.swing.JTextField TextNoHp;
    private javax.swing.JTextField TextSearch;
    private javax.swing.JTextField TextSupplierCode;
    private javax.swing.JTextField TextSupplierId;
    private javax.swing.JLabel User;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
