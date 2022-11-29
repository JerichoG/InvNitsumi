package DTO;

public class ProductDTO {
    public int getProductId() {
        return pid;
    }

    public void setProductId(int pid) {
        this.pid = pid;
    }

    public String getProductCode() {
        return Kode_Barang;
    }

    public void setProductCode(String Kode_Barang) {
        this.Kode_Barang = Kode_Barang;
    }

    public String getProductName() {
        return Nama_Barang;
    }

    public void setProductName(String Nama_Barang) {
        this.Nama_Barang = Nama_Barang;
    }

    public int getPrice() {
        return Harga;
    }

    public void setPrice(int Harga) {
        this.Harga = Harga;
    }
    
    private int pid;
    private String Kode_Barang;
    private String Nama_Barang;
    private int Harga;
}
