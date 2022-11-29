package DTO;

public class UserDTO {
    private int uid;
    private String Username;
    private String Password;
    private String Posisi;
   

    public int getId() {
        return uid;
    }

    public void setId(int uid) {
        this.uid = uid;
    }
    
    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPosisi() {
        return Posisi;
    }

    public void setPosisi(String Posisi) {
        this.Posisi = Posisi;
    }

}
