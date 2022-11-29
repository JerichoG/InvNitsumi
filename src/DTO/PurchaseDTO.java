package DTO;


public class PurchaseDTO {
    
    public int getPurchaseId() {
        return ID;
    }

    public void setPurchaseId(int ID) {
        this.ID = ID;
    }
    
    
    public String getProductCode() {
        return Kode_Barang;
    }

    public void setProductCode(String Kode_Barang) {
        this.Kode_Barang = Kode_Barang;
    }
    
     public String getSupplierCode() {
        return Kode_Supplier;
    }

    public void setSupplierCode(String Kode_Supplier) {
        this.Kode_Supplier = Kode_Supplier;
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
    
    
    private String Kode_Supplier;
    private String Kode_Barang;
    private int ID;
    private int Quantity;
    private int Harga;
    private int Total_Harga;
    private String Tanggal;
}
