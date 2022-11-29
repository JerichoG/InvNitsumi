package DTO;

public class SupplierDTO {
    public int getSupplierId() {
        return sid;
    }

    public void setSupplierId(int sid) {
        this.sid = sid;
    }
    public String getSupplierCode() {
        return Kode_Supplier;
    }

    public void setSupplierCode(String Kode_Supplier) {
        this.Kode_Supplier = Kode_Supplier;
    }

    public String getNamaSupplier() {
        return Nama_Toko;
    }

    public void setNamaSupplier(String Nama_Toko) {
        this.Nama_Toko = Nama_Toko;
    }
    
    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getNoHP() {
        return No_HP;
    }

    public void setNoHP(String No_HP) {
        this.No_HP = No_HP;
    }

 
    private int sid;
    private String Kode_Supplier;
    private String Nama_Toko;
    private String Alamat;
    private String No_HP;
    
}
