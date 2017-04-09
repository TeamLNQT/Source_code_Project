
package entity;

/**
 *
 * @author Nhan
 */
public class KhachHang extends Nguoi implements java.io.Serializable{
    String IDKH;
    String DoanhNghiep;

    public KhachHang(String maKH, String DNghiep, String ho, String ten, String diaChi) {
        super(ho, ten, diaChi);
        this.IDKH = maKH;
        this.DoanhNghiep = DNghiep;
    }
    
    public KhachHang() {
    }

    public String getDN() {
        return DoanhNghiep;
    }

    public void setDN(String DN) {
        this.DoanhNghiep = DN; 
    }

    public String getMKH() {
        return IDKH;
    }

    public void getMKH(String maKH) {
        this.IDKH = maKH;
    }
    public Object[] toArray(){
        return new Object[]{IDKH,ho,ten,diaChi,DoanhNghiep};
    }
    
}

