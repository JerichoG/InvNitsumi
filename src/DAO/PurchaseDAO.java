package DAO;

import koneksi.koneksi;
import DTO.PurchaseDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class PurchaseDAO {
    Connection con = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs1=null;
    Statement stmt1=null;
    ResultSet rs = null;

    public PurchaseDAO() {
        try {
            con = new koneksi().connect();
            stmt = con.createStatement();
            stmt1=con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void addPurchaseDAO(PurchaseDTO purchasedto){
        try {
                    String q = "INSERT INTO purchase VALUES(null,?,?,?,?,?,?)";
                    pstmt = (PreparedStatement) con.prepareStatement(q);
                    pstmt.setString(1, purchasedto.getProductCode());
                    pstmt.setString(2, purchasedto.getSupplierCode());
                    pstmt.setInt(3, purchasedto.getQuantity());
                    pstmt.setInt(4, purchasedto.getPrice());
                    pstmt.setInt(5, purchasedto.getTotal());
                    pstmt.setString(6, purchasedto.getDate());
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data berhasil dimasukkan");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        
        String productCode=purchasedto.getProductCode();
            if(checkStock(productCode)==true){
                try {
                    String q = "UPDATE stock SET Quantity=Quantity+? WHERE Kode_Barang=?";
                    pstmt = (PreparedStatement) con.prepareStatement(q);
                    pstmt.setDouble(1, purchasedto.getQuantity());
                    pstmt.setString(2, purchasedto.getProductCode());

                    pstmt.executeUpdate();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else if(checkStock(productCode)==false){
                try{
                    String q = "INSERT INTO stock VALUES(null,?,?)";
                    pstmt = (PreparedStatement) con.prepareStatement(q);

                    pstmt.setString(1, purchasedto.getProductCode());
                    pstmt.setInt(2, purchasedto.getQuantity());
                    pstmt.executeUpdate();
                }catch(Exception e){
                     e.printStackTrace();   
                }
            }
    }
    
    public void editPurchaseDAO(PurchaseDTO purchasedto) {
        try {
                String query = "UPDATE purchase SET Kode_Supplier=?, Kode_Barang=?, Quantity=?, Harga=?, Total_Harga=?, Tanggal=? WHERE ID=?";
                pstmt = (PreparedStatement) con.prepareStatement(query);
               pstmt.setString(1, purchasedto.getProductCode());
               pstmt.setString(2, purchasedto.getSupplierCode());
               pstmt.setInt(3, purchasedto.getQuantity());
               pstmt.setInt(4, purchasedto.getPrice());
               pstmt.setInt(5, purchasedto.getTotal());
               pstmt.setString(6, purchasedto.getDate());
               pstmt.setInt(7, purchasedto.getPurchaseId());
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Update data berhasil");
            } catch (Exception e) {
                e.printStackTrace();
            }   
    }
    
    public void deletePurchaseDAO(String value){
        try{
            String query="delete from purchase where ID=?";
            pstmt=con.prepareStatement(query);
            pstmt.setString(1,value);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        }catch(SQLException  e){
            e.printStackTrace();
        }
    }
    
    public void editstock(PurchaseDTO purchasedto){
        try{
            String query1="UPDATE stock SET Quantity=Quantity-? WHERE Kode_Barang=?";
            pstmt=con.prepareStatement(query1);
            pstmt.setInt(1,purchasedto.getQuantity());
            pstmt.setString(2, purchasedto.getProductCode());
            pstmt.executeUpdate();
        }catch(SQLException  e){
            e.printStackTrace();
        }
    }
    
    boolean flag=false;
    public boolean checkStock(String productcode){
        try{
            String query="SELECT * FROM stock where Kode_Barang='"+productcode+"'";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                flag=true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    
    public ResultSet MaxStock(PurchaseDTO purchasedto){
        final JPanel panel = new JPanel();
        try{
             if(purchasedto.getQuantity()<=0){
                JOptionPane.showMessageDialog(panel,"Jumlah tidak bisa minus", "Warning" ,JOptionPane.WARNING_MESSAGE);
            }else{
                 return rs;
             }
           
        }catch(Exception e){
                e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet getProductCode(){
        try {
            String query = "SELECT Kode_Barang FROM product";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet getSupplierCode(){
        try {
            String query = "SELECT Kode_Supplier FROM supplier";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet getQueryResult() {
        try {
            String query = "SELECT ID, Kode_Supplier, Kode_Barang, Quantity, Harga, Total_Harga, Tanggal FROM purchase ORDER by Tanggal";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet getSearchPurchasesQueryResult(String searchTxt) {
        try {
            String query = "Select ID, Kode_Supplier, Kode_Barang, Quantity, Harga, Total_Harga, Tanggal FROM purchase WHERE Kode_Barang LIKE '%"+searchTxt+"%' OR Kode_Supplier LIKE '%"+searchTxt+"%' OR Quantity LIKE '%"+searchTxt+"%' OR Harga LIKE '%"+searchTxt+"%' OR Total_Harga LIKE '%"+searchTxt+"%' OR Tanggal LIKE '%"+searchTxt+ "%'";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData(); //resultset ko metadata
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();

        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }
        return new DefaultTableModel(data, columnNames);
    }
}
