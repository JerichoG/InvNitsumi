package DTO;


public class OrderDTO {
   
     public int getOrderId() {
        return ID;
    }

    public void setOrderId(int ID) {
        this.ID = ID;
    }
    
    public String getProductCode() {
        return Kode_Barang;
    }

    public void setProductCode(String Kode_Barang) {
        this.Kode_Barang = Kode_Barang;
    }
    
    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    
    public int getPrice() {
        return Harga;
    }

    public void setPrice(int Harga) {
        this.Harga = Harga;
    }
    
    public int getTotal() {
        return Total_Harga;
    }

    public void setTotal(int Total_Harga) {
        this.Total_Harga = Total_Harga;
    }
    
    public String getDate() {
        return Tanggal;
    }

    public void setDate(String Tanggal) {
        this.Tanggal = Tanggal;
    }
    
    private int ID;
    private String Kode_Barang;
    private int Quantity;
    private int Harga;
    private int Total_Harga;
    private String Tanggal;
}
