/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import koneksi.koneksi;
import DTO.SupplierDTO;
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
public class SupplierDAO {
    Connection con = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;

    public SupplierDAO() {
        try {
            con = new koneksi().connect();
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void addSupplierDAO(SupplierDTO supplierdto) {
        try{
                String query = "SELECT * FROM supplier WHERE Kode_Supplier='" + supplierdto.getSupplierCode()+ "'AND Nama_Toko='"+supplierdto.getNamaSupplier()+"'AND Alamat='"+supplierdto.getAlamat()+"' AND No_HP='"+supplierdto.getNoHP()+"'";
                rs=stmt.executeQuery(query);
                if(rs.next()){
                    JOptionPane.showMessageDialog(null,"Supplier yang sama telah dimasukkan");
                }else{
                    addFunction(supplierdto);
                }
        }catch(Exception e){
                e.printStackTrace();
        }            
    }//end of method addSupplierDAO
    
    public void addFunction(SupplierDTO supplierdto){
                try{
                    
                    String q = "INSERT INTO supplier VALUES(null,?,?,?,?)";
                    pstmt = (PreparedStatement) con.prepareStatement(q);
                    pstmt.setString(1, supplierdto.getSupplierCode());
                    pstmt.setString(2, supplierdto.getNamaSupplier());
                    pstmt.setString(3, supplierdto.getAlamat());
                    pstmt.setString(4, supplierdto.getNoHP());
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data Supplier berhasil dimasukkan!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
    }
    
    public void editSupplierDAO(SupplierDTO supplierdto) {
            try {
                String query = "UPDATE supplier SET Kode_Supplier=?, Nama_Toko=?, Alamat=?, No_HP=? WHERE ID=?";
                pstmt = (PreparedStatement) con.prepareStatement(query);
                pstmt.setString(1, supplierdto.getSupplierCode());
                pstmt.setString(2, supplierdto.getNamaSupplier());
                pstmt.setString(3, supplierdto.getAlamat());
                pstmt.setString(4, supplierdto.getNoHP());
                pstmt.setInt(5, supplierdto.getSupplierId());
                
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Update data supplier berhasil");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Pilih data supplier terlebih dahulu!");
            }
    }//end of method editCustomerDTO

    public void deleteSupplierDAO(String value){
        try{
            String query="delete from supplier where Kode_Supplier=?";
            pstmt=con.prepareStatement(query);
            pstmt.setString(1,value);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Supplier berhasil dihapus");
        }catch(SQLException  e){
            
        }
    }

    public ResultSet getQueryResult() {
        try {
            String query = "SELECT ID, Kode_Supplier , Nama_Toko, Alamat, No_HP FROM supplier";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }//end of method getQueryResult
    
  
    public ResultSet getSearchSuppliersQueryResult(String searchTxt) {
        try {
            String query = "SELECT ID, Kode_Supplier, Nama_Toko, Alamat, No_HP FROM supplier WHERE Nama_Toko LIKE '%"+searchTxt+"%' OR Alamat LIKE '%"+searchTxt+"%' OR Kode_Supplier LIKE '%"+searchTxt+"%' OR No_HP LIKE '%"+searchTxt+"%'";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    //start of method DefaultTableModel
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
