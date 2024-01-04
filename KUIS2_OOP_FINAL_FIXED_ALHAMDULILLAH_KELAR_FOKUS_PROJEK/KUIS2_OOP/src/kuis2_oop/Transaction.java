/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kuis2_oop;

/**
 *
 * @author USER
 */
import java.awt.GridLayout;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Transaction extends javax.swing.JFrame {

    private static Connection koneksi;
    private DefaultTableModel model;
    private DefaultTableModel model2;
    private DefaultTableModel model3;
    private boolean isNotConfirm = true;
    private int transactionID;
//    private int transactionDetailsID = 1;

    /**
     * Creates new form Transaction
     */
    public Transaction() {
        initComponents();
        transactionID = getLastTransactionID();

        model = new DefaultTableModel();
        this.tabelProduk.setModel(model);
        model.addColumn("Product ID");
        model.addColumn("Product Name");
        model.addColumn("Stock");
        model.addColumn("Price");
        model.addColumn("Exp date");
        ambil_data_tabel_product();

        model2 = new DefaultTableModel();
        this.tabelTransaksi.setModel(model2);
        model2.addColumn("Transaction ID");
        model2.addColumn("Product Name");
        model2.addColumn("Qty");
        model2.addColumn("Total");
        ambil_data_detail_transaksi();

        model3 = new DefaultTableModel();
        this.tabelTotal.setModel(model3);
        model3.addColumn("Total");
        ambil_data_transaksi();

        System.out.println(transactionID);
    }

    private int getLastTransactionID() {
        int lastTransactionID = 0;
        try {
            buka_koneksi();
            Statement s = koneksi.createStatement();
            String sql = "SELECT MAX(trans_id) AS last_id FROM transaction";
            ResultSet r = s.executeQuery(sql);
            if (r.next()) {
                lastTransactionID = r.getInt("last_id");
            }
            r.close();
            s.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error fetching last transaction ID: " + e.getMessage());
        }
        return lastTransactionID;
    }

    private static void buka_koneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/minimarket";
                String user = "root";
                String password = "";
                koneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException t) {
                System.out.println("Error membuat koneksi");
            }
        }
    }

    private void ambil_data_tabel_product() {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {
            buka_koneksi();
            Statement s = koneksi.createStatement();
            String sql = "SELECT * FROM product WHERE archived = 0";
            ResultSet r = s.executeQuery(sql);
            while (r.next()) {
                Object[] o = new Object[5];
                o[0] = r.getString("product_id");
                o[1] = r.getString("product_name");
                o[2] = r.getString("stock");
                o[3] = r.getString("price");
                o[4] = r.getString("exp_date");

                model.addRow(o);
            }
            r.close();
            s.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error fetching product data: " + e.getMessage());
        }
    }

    private void ambil_data_detail_transaksi() {
        model2.getDataVector().removeAllElements();
        model2.fireTableDataChanged();
//        proses_transaksi();
        try {
            buka_koneksi();
            Statement s = koneksi.createStatement();
            String dataTransDetails = "SELECT * FROM transaction_details INNER JOIN product ON transaction_details.product_id = product.product_id where trans_id = " + transactionID + ";";
            ResultSet r = s.executeQuery(dataTransDetails);
            while (r.next()) {
                Object[] o = new Object[4];
                o[0] = r.getString("trans_id");
                o[1] = r.getString("product_name");
                o[2] = r.getString("qty");
                o[3] = r.getString("item_price");
//                System.out.println(o[1]);
                model2.addRow(o);
            }
            r.close();
            s.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan " + e.getMessage());
        }
    }

    private void ambil_data_transaksi() {
        model3.getDataVector().removeAllElements();
        model3.fireTableDataChanged();
        try {
            buka_koneksi();
            Statement s = koneksi.createStatement();
            String sql = "SELECT SUM(item_price) as total FROM transaction_details where trans_id = " + transactionID + ";";
            ResultSet r = s.executeQuery(sql);
            while (r.next()) {
                Object[] o = new Object[4];
                o[0] = r.getString("total");
                model3.addRow(o);
            }
            r.close();
            s.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan " + e.getMessage());
        }
    }

    private void proses_transaksi() {
        try {
            System.out.println(transactionID);
            String query = "UPDATE transaction t SET total = (SELECT SUM(td.item_price) FROM transaction_details td WHERE td.trans_id =" + transactionID + ") WHERE t.trans_id =" + transactionID + ";";
//            String query = "UPDATE transaction t SET total = (SELECT SUM(td.item_price) FROM transaction_details td WHERE td.trans_id =2) WHERE t.trans_id =2;";
            PreparedStatement m = koneksi.prepareStatement(query);
            m.executeUpdate();
            m.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TFQty = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelProduk = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelTotal = new javax.swing.JTable();
        editProduk = new javax.swing.JButton();
        report = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Transaction");

        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Transaction", "Id Product", "Qty", "Price", "Total"
            }
        ));
        jScrollPane1.setViewportView(tabelTransaksi);

        jLabel2.setText("Transaction Data");

        jLabel5.setText("Qty");

        tabelProduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, ""},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product Id", "Product Name", "Price", "Exp Date", "Stock"
            }
        ));
        tabelProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelProdukMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelProduk);

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        tabelTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Total"
            }
        ));
        jScrollPane3.setViewportView(tabelTotal);

        editProduk.setText("Edit Product");
        editProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProdukActionPerformed(evt);
            }
        });

        report.setText("Monthly Report");
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(297, 297, 297))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(confirmButton)))
                        .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(75, 75, 75)
                                .addComponent(TFQty, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editProduk)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(675, 675, 675))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editProduk)
                            .addComponent(jLabel5)
                            .addComponent(TFQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBtn))
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(confirmButton)
                                .addComponent(editBtn)
                                .addComponent(deleteBtn)))
                        .addGap(18, 18, 18)
                        .addComponent(report)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        buka_koneksi();

//        String productIdInput = TFproduct_id.getText().trim();
        String qtyInput = TFQty.getText().trim();
//        System.out.println("ProductIdInput: " + productIdInput);
        System.out.println("QtyInput: " + qtyInput);

        if (qtyInput.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a quantity.");
            return;
        }

        if (transactionID <= 0) {
            JOptionPane.showMessageDialog(this, "Please confirm the transaction first.");
            return;
        }

        int selectedRowIndex = tabelProduk.getSelectedRow();

        if (selectedRowIndex != -1) {
            int productId;
            productId = Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());

            int maxQty = Integer.parseInt(model.getValueAt(selectedRowIndex, 2).toString());
            int Qty = Integer.parseInt(qtyInput);
            boolean validQty = Qty <= maxQty;

            if (validQty) {
                try {
                    int price = Integer.parseInt(model.getValueAt(selectedRowIndex, 3).toString());
                    int itemPrice = price * Qty;

                    try {
                        Statement s2 = koneksi.createStatement();
                        String cekProduk = "Select product_id as product from transaction_details where product_id = " + productId + " AND trans_id = " + transactionID + ";";
                        ResultSet r2 = s2.executeQuery(cekProduk);
                        r2.next();

                        if (r2.getRow() == 0) { // JIKA PRODUK BELUM ADA
                            System.out.println(productId);
                            String insertNewDetail = "INSERT INTO transaction_details(trans_id,product_id,qty,item_price) VALUES (" + transactionID + "," + productId + "," + Qty + "," + itemPrice + ");";
                            String updateStock = "UPDATE product SET stock= stock-" + Qty + " WHERE product_id =" + productId + ";";
                            try {
                                PreparedStatement newDetail = koneksi.prepareStatement(insertNewDetail);
                                newDetail.executeUpdate(insertNewDetail);
                                newDetail.close();
                                PreparedStatement Stock = koneksi.prepareStatement(updateStock);
                                Stock.executeUpdate();
                                Stock.close();
                            } catch (SQLException e) {
                                System.out.println(insertNewDetail);
                                JOptionPane.showMessageDialog(this, "Terjadi kesalahan haha " + e.getMessage());
                            }
                            proses_transaksi();
                            ambil_data_detail_transaksi();
                        } else { // PRODUK SUDAH ADA
                            String sql = "UPDATE transaction_details SET qty = qty+" + Qty + ", item_price= qty*" + price + " WHERE product_id =" + productId + ";";
                            String updateStock = "UPDATE product SET stock= stock-" + Qty + " WHERE product_id =" + productId + ";";
                            PreparedStatement mStatement = koneksi.prepareStatement(sql);
                            mStatement.executeUpdate();
                            mStatement.close();
                            PreparedStatement Stock = koneksi.prepareStatement(updateStock);
                            Stock.executeUpdate();
                            Stock.close();
                            proses_transaksi();
                            ambil_data_detail_transaksi();
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(this, "Terjadi kesalahan  asuuu " + e.getMessage());
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
                }

                ambil_data_tabel_product();
                ambil_data_transaksi();
            } else {
                JOptionPane.showMessageDialog(null, "Pembelian melebihi stok");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a product from the table or enter a valid product ID.");
        }
    }//GEN-LAST:event_addBtnActionPerformed


    private void tabelProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelProdukMouseClicked
//        int selectedRowIndex = tabelProduk.getSelectedRow();
//        TFproduct_id.setText(model.getValueAt(selectedRowIndex, 0).toString());
    }//GEN-LAST:event_tabelProdukMouseClicked

    private String generateReceipt() {
        StringBuilder receipt = new StringBuilder();
        receipt.append("<html><head><style>");
        receipt.append("table { border-collapse: collapse; width: 100%; }");
        receipt.append("th, td { border: 1px solid black; padding: 8px; text-align: center; }");
        receipt.append("</style></head><body>");
        receipt.append("<h3 style='text-align: center;'>Transaction ID: ").append(transactionID).append("</h3>");
        receipt.append("<br>");
        receipt.append("<table>");
        receipt.append("<tr><th>Product</th><th>Qty</th><th>Total</th></tr>");

        try {
            buka_koneksi();
            Statement s = koneksi.createStatement();
            String sql = "SELECT product.product_name, transaction_details.qty, transaction_details.item_price "
                    + "FROM transaction_details INNER JOIN product ON transaction_details.product_id = product.product_id "
                    + "WHERE transaction_details.trans_id = " + transactionID;
            ResultSet r = s.executeQuery(sql);

            while (r.next()) {
                receipt.append("<tr>");
                receipt.append("<td>").append(r.getString("product_name")).append("</td>");
                receipt.append("<td>").append(r.getInt("qty")).append("</td>");
                receipt.append("<td>").append(r.getInt("item_price")).append("</td>");
                receipt.append("</tr>");
            }

            r.close();
            s.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error generating receipt: " + e.getMessage());
        }

        receipt.append("</table>");
        receipt.append("</body></html>");

        return receipt.toString();
    }


    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        String receipt = generateReceipt();
        JOptionPane.showMessageDialog(this, receipt, "Transaction Receipt", JOptionPane.PLAIN_MESSAGE);
        transactionID += 1;
        String query = "INSERT INTO transaction VALUES (" + transactionID + ",curdate(),0,1);";
        try {
            PreparedStatement mStatement2 = koneksi.prepareStatement(query);
            mStatement2.executeUpdate();
            mStatement2.close();
        } catch (SQLException e) {
//                    System.out.println(query);
//                    JOptionPane.showMessageDialog(this, "Terjadi kesalahan " + e.getMessage());
        }
        ambil_data_detail_transaksi();
        proses_transaksi();
        ambil_data_transaksi();
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        int selectedRowIndex = tabelTransaksi.getSelectedRow();
        if (selectedRowIndex != -1) {

            int transID = Integer.parseInt(model2.getValueAt(selectedRowIndex, 0).toString());
            String productName = model2.getValueAt(selectedRowIndex, 1).toString();
            int qty = Integer.parseInt(model2.getValueAt(selectedRowIndex, 2).toString());
            int price = Integer.parseInt(model2.getValueAt(selectedRowIndex, 3).toString());

            String qtyInput = JOptionPane.showInputDialog(this, "Edit Quantity for Product: " + productName, qty);
            if (qtyInput != null && !qtyInput.isEmpty()) {
                try {
                    int newQty = Integer.parseInt(qtyInput);

                    String updateQtyQuery = "UPDATE transaction_details SET qty = " + newQty + ",item_price = " + newQty * (price / qty) + " WHERE trans_id = " + transID + " AND product_id = (SELECT product_id FROM product WHERE product_name = '" + productName + "')";
                    PreparedStatement updateQtyStatement = koneksi.prepareStatement(updateQtyQuery);
                    updateQtyStatement.executeUpdate();
                    updateQtyStatement.close();

                    String updateStockQuery = "UPDATE product SET stock = stock + " + (qty - newQty) + " WHERE product_name = '" + productName + "'";
                    PreparedStatement updateStockStatement = koneksi.prepareStatement(updateStockQuery);
                    updateStockStatement.executeUpdate();
                    updateStockStatement.close();

                    ambil_data_detail_transaksi();
                    ambil_data_tabel_product();
                    ambil_data_transaksi();
                    proses_transaksi();
                } catch (NumberFormatException | SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error editing product: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a product from the transaction table to edit.");
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void editProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProdukActionPerformed
        String[] options = {"Add", "Delete", "Edit", "Archive", "Unarchive"};
        int choice = JOptionPane.showOptionDialog(this, "Choose an action:", "Edit Product",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        switch (choice) {
            case 0:
                addNewProduct();
                break;
            case 1:
                deleteExistingProduct();
                break;
            case 2:
                editExistingProduct();
                break;
            case 3:
                archiveProduct();
                break;
            case 4:
                unarchiveProduct();
                break;
            default:
                break;
        }

        ambil_data_tabel_product();
    }

    private void archiveProduct() {
        int selectedRowIndex = tabelProduk.getSelectedRow();
        if (selectedRowIndex != -1) {
            int productId = Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());
            try {
                buka_koneksi();
                String archiveQuery = "UPDATE product SET archived = 1 WHERE product_id = ?";
                PreparedStatement preparedStatement = koneksi.prepareStatement(archiveQuery);
                preparedStatement.setInt(1, productId);
                preparedStatement.executeUpdate();
                preparedStatement.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error archiving product: " + e.getMessage());
            }
        }
    }

    private void unarchiveProduct() {
        try {
            buka_koneksi();
            String selectQuery = "SELECT product_id, product_name FROM product WHERE archived = 1";
            Statement statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);

            List<String> archivedProducts = new ArrayList<>();

            while (resultSet.next()) {
                int productId = resultSet.getInt("product_id");
                String productName = resultSet.getString("product_name");
                archivedProducts.add(productId + ": " + productName);
            }

            resultSet.close();
            statement.close();

            Object[] options = archivedProducts.toArray();
            String selectedProduct = (String) JOptionPane.showInputDialog(
                    this,
                    "Select a product to unarchive:",
                    "Unarchive Product",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options.length > 0 ? options[0] : null
            );

            if (selectedProduct != null) {
                int productId = Integer.parseInt(selectedProduct.split(":")[0].trim());

                String updateQuery = "UPDATE product SET archived = 0 WHERE product_id = ?";
                PreparedStatement preparedStatement = koneksi.prepareStatement(updateQuery);
                preparedStatement.setInt(1, productId);
                preparedStatement.executeUpdate();
                preparedStatement.close();

                JOptionPane.showMessageDialog(this, "Product with ID " + productId + " has been unarchived.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error retrieving archived products: " + e.getMessage());
        }
    }

    private void addNewProduct() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JTextField productNameField = new JTextField();
        JTextField stockField = new JTextField();
        JTextField priceField = new JTextField();
        JTextField expDateField = new JTextField();

        String[] categories = {"Makanan", "Minuman"};
        JComboBox<String> categoryDropdown = new JComboBox<>(categories);

        panel.add(new JLabel("Product Name:"));
        panel.add(productNameField);
        panel.add(new JLabel("Stock:"));
        panel.add(stockField);
        panel.add(new JLabel("Price:"));
        panel.add(priceField);
        panel.add(new JLabel("Expiration Date (YYYY-MM-DD):"));
        panel.add(expDateField);
        panel.add(new JLabel("Category:"));
        panel.add(categoryDropdown);

        int result = JOptionPane.showConfirmDialog(
                this,
                panel,
                "Enter Product Information",
                JOptionPane.OK_CANCEL_OPTION
        );

        if (result == JOptionPane.OK_OPTION) {
            String productName = productNameField.getText();
            String stockStr = stockField.getText();
            String priceStr = priceField.getText();
            String expDateStr = expDateField.getText();
            String selectedCategory = (String) categoryDropdown.getSelectedItem();

            try {
                int stock = Integer.parseInt(stockStr);
                int price = Integer.parseInt(priceStr);
                java.sql.Date expDate = java.sql.Date.valueOf(expDateStr);

                int categoryId = (selectedCategory.equals("Makanan")) ? 1 : 2;

                buka_koneksi();
                String insertQuery = "INSERT INTO product (product_name, stock, price, exp_date, category_id) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = koneksi.prepareStatement(insertQuery);
                preparedStatement.setString(1, productName);
                preparedStatement.setInt(2, stock);
                preparedStatement.setInt(3, price);
                preparedStatement.setDate(4, expDate);
                preparedStatement.setInt(5, categoryId);

                preparedStatement.executeUpdate();
                preparedStatement.close();
                ambil_data_tabel_product();
            } catch (NumberFormatException | SQLException e) {
                JOptionPane.showMessageDialog(this, "Error adding new product: " + e.getMessage());
            }
        }
    }

    private void deleteExistingProduct() {
        int selectedRowIndex = tabelProduk.getSelectedRow();
        if (selectedRowIndex != -1) {
            int productId = Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());
            try {
                buka_koneksi();
                String deleteQuery = "DELETE FROM product WHERE product_id = ?";
                PreparedStatement preparedStatement = koneksi.prepareStatement(deleteQuery);
                preparedStatement.setInt(1, productId);

                preparedStatement.executeUpdate();
                preparedStatement.close();
                ambil_data_tabel_product();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error deleting product: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a product to delete.");
        }
    }

    private void editExistingProduct() {
        int selectedRowIndex = tabelProduk.getSelectedRow();
        if (selectedRowIndex != -1) {
            int productId = Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());

            String newProductName = JOptionPane.showInputDialog(this, "Enter New Product Name:", model.getValueAt(selectedRowIndex, 1).toString());
            String newStock = JOptionPane.showInputDialog(this, "Enter New Stock:", model.getValueAt(selectedRowIndex, 2).toString());
            String newPrice = JOptionPane.showInputDialog(this, "Enter New Price:", model.getValueAt(selectedRowIndex, 3).toString());
            String newExpDate = JOptionPane.showInputDialog(this, "Enter New Expiry Date:", model.getValueAt(selectedRowIndex, 4).toString());

            if (newProductName == null || newProductName.isEmpty()
                    || newPrice == null || newPrice.isEmpty()
                    || newExpDate == null || newExpDate.isEmpty()
                    || newStock == null || newStock.isEmpty()) {
                return;
            }

            try {
                buka_koneksi();
                String updateQuery = "UPDATE product SET product_name = ?, price = ?, exp_date = ?, stock = ? WHERE product_id = ?";
                PreparedStatement preparedStatement = koneksi.prepareStatement(updateQuery);
                preparedStatement.setString(1, newProductName);
                preparedStatement.setInt(4, Integer.parseInt(newStock));
                preparedStatement.setInt(2, Integer.parseInt(newPrice));
                preparedStatement.setString(3, newExpDate);
                preparedStatement.setInt(5, productId);

                preparedStatement.executeUpdate();
                preparedStatement.close();
                ambil_data_tabel_product();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error editing product: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a product to edit.");
        }
    }//GEN-LAST:event_editProdukActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRowIndex = tabelTransaksi.getSelectedRow();

        if (selectedRowIndex != -1) {
            int transID = Integer.parseInt(model2.getValueAt(selectedRowIndex, 0).toString());
            String productName = model2.getValueAt(selectedRowIndex, 1).toString();
            int qty = Integer.parseInt(model2.getValueAt(selectedRowIndex, 2).toString());

            int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the product: " + productName + "?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                try {
                    String deleteQuery = "DELETE FROM transaction_details WHERE trans_id = " + transID + " AND product_id = (SELECT product_id FROM product WHERE product_name = '" + productName + "')";
                    PreparedStatement deleteStatement = koneksi.prepareStatement(deleteQuery);
                    deleteStatement.executeUpdate();
                    deleteStatement.close();

                    String updateStockQuery = "UPDATE product SET stock = stock + " + qty + " WHERE product_name = '" + productName + "'";
                    PreparedStatement updateStockStatement = koneksi.prepareStatement(updateStockQuery);
                    updateStockStatement.executeUpdate();
                    updateStockStatement.close();

                    ambil_data_detail_transaksi();
                    ambil_data_tabel_product();
                    ambil_data_transaksi();
                    proses_transaksi();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error deleting product: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a product from the transaction table to delete.");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
        try {
            LocalDate currentDate = LocalDate.now();
            LocalDate firstDayOfCurrentMonth = currentDate.withDayOfMonth(1);
            LocalDate lastDayOfCurrentMonth = currentDate.withDayOfMonth(currentDate.lengthOfMonth());

            String startDate = firstDayOfCurrentMonth.toString();
            String endDate = lastDayOfCurrentMonth.toString();

            System.out.println("startDate: " + startDate);
            System.out.println("endDate: " + endDate);

            String sql = "SELECT COALESCE(SUM(total), 0) AS total_sales FROM transaction WHERE date BETWEEN ? AND ?";
            PreparedStatement preparedStatement = koneksi.prepareStatement(sql);
            preparedStatement.setString(1, startDate);
            preparedStatement.setString(2, endDate);

            System.out.println("SQL Query: " + preparedStatement.toString());

            ResultSet resultSet = preparedStatement.executeQuery();
            
            String latestPurchaseQuery = "SELECT td.product_id, MAX(t.date) AS latest_purchase_date, p.product_name " +
                                        "FROM transaction_details td " +
                                        "JOIN transaction t ON td.trans_id = t.trans_id " +
                                        "JOIN product p ON td.product_id = p.product_id " +
                                        "WHERE t.date BETWEEN ? AND ? " +
                                        "GROUP BY td.product_id, p.product_name " +
                                        "ORDER BY latest_purchase_date DESC " +
                                        "LIMIT 1 ";
            
            PreparedStatement latestPurchaseStatement = koneksi.prepareStatement(latestPurchaseQuery);
            latestPurchaseStatement.setString(1, startDate);
            latestPurchaseStatement.setString(2, endDate);
            
            ResultSet latestPurchaseResult = latestPurchaseStatement.executeQuery();

            String frequentItemQuery = "SELECT td.product_id, p.product_name, SUM(td.qty) AS total_quantity " +
                                    "FROM transaction_details td " +
                                    "JOIN product p ON td.product_id = p.product_id " +
                                    "JOIN transaction t ON td.trans_id = t.trans_id " +
                                    "WHERE t.date BETWEEN ? and ? " +
                                    "GROUP BY td.product_id, p.product_name " +
                                    "ORDER BY total_quantity DESC LIMIT 1";
            
            PreparedStatement frequentItemStatement = koneksi.prepareStatement(frequentItemQuery);
            frequentItemStatement.setString(1, startDate);
            frequentItemStatement.setString(2, endDate);
            ResultSet frequentItemResult = frequentItemStatement.executeQuery();
            
            if (resultSet.next() && frequentItemResult.next() && latestPurchaseResult.next()) {
            double totalSales = resultSet.getDouble("total_sales");
            String frequentProductName = frequentItemResult.getString("p.product_name");
            double totalQuantity = frequentItemResult.getDouble("total_quantity");
            String LatestPurchasedName = latestPurchaseResult.getString("product_name");
            String latestPurchasedDate = latestPurchaseResult.getString("latest_purchase_date");
                
            JOptionPane.showMessageDialog(this,
                                          "<html><b>Monthly Sales Report (Last Month)</b>:<br>" +
                                          "Total Sales: Rp. " + totalSales + "<br><br>" +
                                          "<b>Produk yang sering dibeli:</b><br>" +
                                          "Nama Produk: " + frequentProductName + "<br>" +
                                          "Jumlah Pembelian: " + totalQuantity + "<br><br>" +
                                          "<b>Pembelian Terakhir:</b><br>" +
                                          "Nama Produk: " + LatestPurchasedName + "<br>" +
                                          "Tanggal: " + latestPurchasedDate + "</html>");
                
            } else {
                JOptionPane.showMessageDialog(this, "No sales data for the last month.");
            }
            
            String report = "SELECT t.trans_id, t.product_id, p.product_name, t.qty, t.item_price, tr.date " +
                          "FROM transaction_details t " +
                          "JOIN product p ON t.product_id = p.product_id " +
                          "JOIN transaction tr ON t.trans_id = tr.trans_id " +
                          "ORDER BY tr.date DESC";
            
            PreparedStatement preparedStatements = koneksi.prepareStatement(report);
            ResultSet resultSets = preparedStatements.executeQuery();
            
            if (resultSets.next()) {
                StringBuilder htmlString = new StringBuilder("<html><head><style>" +
                        "table { width: 100%; border-collapse: collapse; }" +
                        "th, td { border: 1px solid #dddddd; text-align: left; padding: 8px; }" +
                        "th { background-color: #f2f2f2; }" +
                        "tr:nth-child(even) { background-color: #f9f9f9; }" +
                        "</style></head><body><table>");

                ResultSetMetaData metaData = resultSets.getMetaData();
                int columnCount = metaData.getColumnCount();

                // Menambahkan header tabel
                htmlString.append("<tr>");
                for (int column = 1; column <= columnCount; column++) {
                    htmlString.append("<th>").append(metaData.getColumnName(column)).append("</th>");
                }
                htmlString.append("</tr>");

                // Menambahkan data ke dalam tabel
                while (resultSets.next()) {
                    htmlString.append("<tr>");
                    for (int i = 1; i <= columnCount; i++) {
                        htmlString.append("<td>").append(resultSets.getString(i)).append("</td>");
                    }
                    htmlString.append("</tr>");
                }
                htmlString.append("</table></body></html>");

                // Menampilkan dalam JEditorPane
                JEditorPane editorPane = new JEditorPane("text/html", htmlString.toString());
                editorPane.setEditable(false);
                JScrollPane scrollPane = new JScrollPane(editorPane);
                JOptionPane.showMessageDialog(null, scrollPane);
            }
            
            resultSet.close();
            preparedStatement.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error generating monthly report: " + e.getMessage());
        }
    }//GEN-LAST:event_reportActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaction().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFQty;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton editProduk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton report;
    private javax.swing.JTable tabelProduk;
    private javax.swing.JTable tabelTotal;
    private javax.swing.JTable tabelTransaksi;
    // End of variables declaration//GEN-END:variables
}
