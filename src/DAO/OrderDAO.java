package DAO;

import koneksi.koneksi;
import DTO.OrderDTO;
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

public class OrderDAO {
    Connection con = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs1=null;
    Statement stmt1=null;
    ResultSet rs = null;

    public OrderDAO() {
        try {
            con = new koneksi().connect();
            stmt = con.createStatement();
            stmt1=con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void addOrderDAO(OrderDTO orderdto){
        try {
                    String q = "INSERT INTO orders VALUES(null,?,?,?,?,?)";
                    pstmt = (PreparedStatement) con.prepareStatement(q);
                    pstmt.setString(1, orderdto.getProductCode());
                    pstmt.setInt(2, orderdto.getQuantity());
                    pstmt.setInt(3, orderdto.getPrice());
                    pstmt.setInt(4, orderdto.getTotal());
                    pstmt.setString(5, orderdto.getDate());
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data berhasil dimasukkan");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        
        String productCode=orderdto.getProductCode();
            if(checkStock(productCode)==true){
                try {
                    String q = "UPDATE stock SET Quantity=Quantity-? WHERE Kode_Barang=?";
                    pstmt = (PreparedStatement) con.prepareStatement(q);
                    pstmt.setDouble(1, orderdto.getQuantity());
                    pstmt.setString(2, orderdto.getProductCode());

                    pstmt.executeUpdate();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else if(checkStock(productCode)==false){
                try{
                    String q = "INSERT INTO stock VALUES(null,?,?)";
                    pstmt = (PreparedStatement) con.prepareStatement(q);

                    pstmt.setString(1, orderdto.getProductCode());
                    pstmt.setInt(2, orderdto.getQuantity());
                    pstmt.executeUpdate();
                }catch(Exception e){
                     e.printStackTrace();   
                }
            }
    }
    
    public void editOrderDAO(OrderDTO orderdto) {
        try {
                String query = "UPDATE orders SET Kode_Barang=?, Quantity=?, Harga=?, Total_Harga=?, Tanggal=? WHERE ID=?";
                pstmt = (PreparedStatement) con.prepareStatement(query);
               pstmt.setString(1, orderdto.getProductCode());
               pstmt.setInt(2, orderdto.getQuantity());
               pstmt.setInt(3, orderdto.getPrice());
               pstmt.setInt(4, orderdto.getTotal());
               pstmt.setString(5, orderdto.getDate());
               pstmt.setInt(6, orderdto.getOrderId());
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Update data berhasil");
            } catch (Exception e) {
                e.printStackTrace();
            }   
    }
    
    public void deleteOrderDAO(String value){
        try{
            String query="delete from orders where ID=?";
            pstmt=con.prepareStatement(query);
            pstmt.setString(1,value);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        }catch(SQLException  e){
            e.printStackTrace();
        }
    }
    
    public void editstock(OrderDTO orderdto){
        try{
            String query1="UPDATE stock SET Quantity=Quantity+? WHERE Kode_Barang=?";
            pstmt=con.prepareStatement(query1);
            pstmt.setInt(1,orderdto.getQuantity());
            pstmt.setString(2, orderdto.getProductCode());
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
    
    public ResultSet getProductCode(){
        try {
            String query = "SELECT Kode_Barang FROM product";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    
    public ResultSet MaxStock(OrderDTO orderdto){
        String pdcode = orderdto.getProductCode();
        int stock=getStock(pdcode);
        final JPanel panel = new JPanel();
        try{
             if(orderdto.getQuantity()>stock){
                JOptionPane.showMessageDialog(panel,"Jumlah barang melebihi stock", "Warning" ,JOptionPane.WARNING_MESSAGE);
            }else if(orderdto.getQuantity()<=0){
                JOptionPane.showMessageDialog(panel,"Jumlah tidak bisa minus", "Warning" ,JOptionPane.WARNING_MESSAGE);
             
            }else{
                return rs;
            }
           
        }catch(Exception e){
                e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet getProductName(String pcode){
        try {
            String query = "SELECT Nama_Barang FROM product WHERE Kode_Barang='"+pcode+"'";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public Integer getProductCostPrice(String productCodeTxt){
        Integer costPrice = null;
        try{
            String query="SELECT Harga FROM product WHERE Kode_Barang='"+productCodeTxt+"'";
            rs=stmt.executeQuery(query);
            if(rs.next()){
                costPrice=rs.getInt("Harga");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return costPrice;
    }
    
    public Integer getStock(String productCodeTxt){
        Integer Stock = null;
        try{
            String query="SELECT * FROM stock WHERE Kode_Barang='"+productCodeTxt+"'";
            rs=stmt.executeQuery(query);
            if(rs.next()){
                Stock=rs.getInt("Quantity");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return Stock;
    }
    
    public ResultSet getQueryResultNow() {
        try {
            String query = "SELECT ID, Kode_Barang, Quantity, Harga, Total_Harga, Tanggal FROM orders WHERE Tanggal='"+java.time.LocalDate.now()+"'";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet getQueryResult() {
        try {
            String query = "SELECT ID, Kode_Barang, Quantity, Harga, Total_Harga, Tanggal FROM orders ORDER by Tanggal";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet getSearchOrdersQueryResult(String searchTxt) {
        try {
            String query = "Select ID, Kode_Barang, Quantity, Harga, Total_Harga, Tanggal FROM orders WHERE Kode_Barang LIKE '%"+searchTxt+"%' OR Quantity LIKE '%"+searchTxt+"%' OR Harga LIKE '%"+searchTxt+"%' OR Total_Harga LIKE '%"+searchTxt+"%' OR Tanggal LIKE '%"+searchTxt+ "%'";
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
