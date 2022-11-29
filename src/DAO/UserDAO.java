package DAO;

import koneksi.koneksi;
import DTO.UserDTO;
import java.math.BigInteger;
import java.security.MessageDigest;
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
public class UserDAO {
    Connection con = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;

    public UserDAO() {
        try {
            con = new koneksi().connect();
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String encryptPassword(String input){
        String encPass=null;
        if(input==null) return null;
        
        try{
            MessageDigest digest=MessageDigest.getInstance("MD5");
            digest.update(input.getBytes(),0,input.length());
            encPass=new BigInteger(1,digest.digest()).toString(16);
        }catch(Exception e){
            e.printStackTrace();
        }        
        return encPass;
    }
    
    public void addUserDAO(UserDTO userdto) {
        try{
                String query = "SELECT * FROM user WHERE Username='"+userdto.getUsername()+"' AND Posisi='"+userdto.getPosisi()+"'";
                rs=stmt.executeQuery(query);
                if(rs.next()){
                    JOptionPane.showMessageDialog(null,"User yang sama telah dimasukkan");
                }else{
                    addFunction(userdto);
                }
        }catch(Exception e){
                e.printStackTrace();
        }            
    }//end of method addUserDAO
    
    public void addFunction(UserDTO userdto){
                try{
                    String encPass=null;
                    String password = null;
                    password=userdto.getPassword();
                    encPass=encryptPassword(password);
                    String q = "INSERT INTO user VALUES(null,?,?,?)";
                    pstmt = (PreparedStatement) con.prepareStatement(q);
                    pstmt.setString(1, userdto.getUsername());
                    pstmt.setString(2, encPass);
                    pstmt.setString(3, userdto.getPosisi());
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data User berhasil dimasukkan!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
    }
    
    public void editUserDAO(UserDTO userdto) {
            try {
                String encPass=null;
                String password = null;
                password=userdto.getPassword();
                encPass=encryptPassword(password);
                String query = "UPDATE user SET Username=?, Password=?, Posisi=? WHERE ID=?";
                pstmt = (PreparedStatement) con.prepareStatement(query);
                pstmt.setString(1, userdto.getUsername());
                pstmt.setString(2, encPass);
                pstmt.setString(3, userdto.getPosisi());
                pstmt.setInt(4, userdto.getId());
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Update data user berhasil");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Pilih data user terlebih dahulu!");
            }
    }//end of method editCustomerDTO

    public void deleteUserDAO(String value){
        try{
            String query="delete from user where Username=?";
            pstmt=con.prepareStatement(query);
            pstmt.setString(1,value);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data User berhasil dihapus");
        }catch(SQLException  e){
            
        }
    }

    public ResultSet getQueryResult() {
        try {
            String query = "SELECT ID, Username, Password, Posisi FROM user ORDER BY ID";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }//end of method getQueryResult
    
  
    public ResultSet getSearchUsersQueryResult(String searchTxt) {
        try {
            String query = "SELECT ID, Username, Password, Posisi FROM user WHERE Username LIKE '%"+searchTxt+"%' OR Posisi LIKE '%"+searchTxt+"%'";
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
