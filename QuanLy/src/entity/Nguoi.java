package entity;

/**
 *
 * @author 
 */
public class Nguoi implements java.io.Serializable{
    String ho;
    String ten;
    String diaChi;

    public Nguoi() {
    }

    public Nguoi(String ho, String ten, String diaChi) {
        this.ho = ho;
        this.ten = ten;
        this.diaChi = diaChi;
    }

   
    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

}
