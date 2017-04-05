package entity;

import java.io.Serializable;

/**
 *
 * @author
 */
public class HoaDon implements Serializable{
    private int diem;
    private KhachHang sv;
    private MatHang mh;

    public HoaDon() {
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public MatHang getMh() {
        return mh;
    }

    public void setMh(MatHang mh) {
        this.mh = mh;
    }

    public KhachHang getSv() {
        return sv;
    }

    public void setSv(KhachHang sv) {
        this.sv = sv;
    }

    public HoaDon(int diem, KhachHang sv, MatHang mh) {
        this.diem = diem;
        this.sv = sv;
        this.mh = mh;
    }

//    public Object[] toArray()
//    {
//        return new Object[]{sv.getMaSV(),sv.getHo()+" "+sv.getTen(),mh.getTenMon()
//            ,diem};
//    }
    
}
