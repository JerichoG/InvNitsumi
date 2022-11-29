package DAO;

import koneksi.koneksi;
import DTO.ProductDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class ProductDAO {
    Connection con = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs1=null;
    Statement stmt1=null;
    ResultSet rs = null;

    public ProductDAO() {
        try {
            con = new koneksi().connect();
            stmt = con.createStatement();
            stmt1=con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void addProductDAO(ProductDTO productdto) {
         try{
                String query = "SELECT * FROM product WHERE Kode_Barang='"+productdto.getProductCode()+"' AND Nama_Barang='"+productdto.getProductName()+"' AND Harga='"+productdto.getPrice()+"'";
                rs=stmt.executeQuery(query);
                if(rs.next()){
                    JOptionPane.showMessageDialog(null,"Barang yang sama telah dimasukkan!");
                }else{
                    addFunction(productdto);
                }
        }catch(Exception e){
                e.printStackTrace();
        }
            
    }//end of method addUserDTO
    
    public void addFunction(ProductDTO productdto){
        try {
                    String q = "INSERT INTO product VALUES(null,?,?,?)";
                    pstmt = (PreparedStatement) con.prepareStatement(q);
                    pstmt.setString(1, productdto.getProductCode());
                    pstmt.setString(2, productdto.getProductName());
                    pstmt.setDouble(3, productdto.getPrice());
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data Barang berhasil dimasukkan!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
    }

    public void editProductDAO(ProductDTO productdto) {
        try {
                String query = "UPDATE product SET Kode_Barang=?,Nama_Barang=?,Harga=? WHERE ID=?";
                pstmt = (PreparedStatement) con.prepareStatement(query);
                pstmt.setString(1, productdto.getProductCode());
                 pstmt.setString(2, productdto.getProductName());
                pstmt.setDouble(3, productdto.getPrice());
                pstmt.setInt(4, productdto.getProductId());
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Update data barang berhasil");
            } catch (Exception e) {
                e.printStackTrace();
            }  
       
    }//end of method editUserDTO
    
    public void deleteProductDAO(String value){
        try{
            String query="delete from product where Kode_Barang=?";
            pstmt=con.prepareStatement(query);
            pstmt.setString(1,value);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Barang berhasil dihapus");
        }catch(SQLException  e){
            e.printStackTrace();
        }
    }
    
    
    public ResultSet getQueryResultOfStocks() {
        try {
            String query = "SELECT stock.Kode_Barang, product.Nama_Barang, stock.Quantity, product.Harga FROM stock INNER JOIN product ON stock.Kode_Barang=product.Kode_Barang";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet getQueryResult() {
        try {
            String query = "SELECT ID, Kode_Barang, Nama_Barang, Harga FROM product ORDER BY ID";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }//end of method getQueryResult
   
    public ResultSet getSearchStocksQueryResult(String searchTxt) {
        try {
            String query = "SELECT stock.Kode_Barang, product.Nama_Barang, stock.Quantity, product.Harga FROM stock INNER JOIN product ON stock.Kode_Barang=product.Kode_Barang WHERE product.Nama_Barang LIKE '%"+searchTxt+"%' OR stock.Kode_Barang LIKE '%"+searchTxt+"%'";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet getSearchProductsQueryResult(String searchTxt) {
        try {
            String query = "SELECT ID, Kode_Barang, Nama_Barang, Harga FROM product WHERE Nama_Barang LIKE '%"+searchTxt+"%' OR Kode_Barang LIKE '%"+searchTxt+"%'";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
          
        
    //start of method DefaultTableModle
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
    }//end of method DefaultTableModel
}
