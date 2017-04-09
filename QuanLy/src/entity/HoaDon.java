package entity;

import java.io.Serializable;

/**
 *
 * @author Nhan
 */
public class HoaDon implements Serializable{
    private int soLuong;
    private KhachHang khachHang;
    private MatHang mh;

    public HoaDon() {
    }

    public int getDiem() {
        return soLuong;
    }

    public void setDiem(int diem) {
        this.soLuong = diem;
    }

    public MatHang getMh() {
        return mh;
    }

    public void setMh(MatHang mh) {
        this.mh = mh;
    }

    public KhachHang getKH() {
        return khachHang;
    }

    public void setKH(KhachHang sv) {
        this.khachHang = sv;
    }

    public HoaDon(int diem, KhachHang sv, MatHang mh) {
        this.soLuong = diem;
        this.khachHang = sv;
        this.mh = mh;
    }

    
}
