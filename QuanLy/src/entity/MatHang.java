package entity;

/**
 *
 * @author  Nhan
 */
public class MatHang implements java.io.Serializable {
	String IDMatHang;
	String TenMatHang;
	int SoLương;

	public MatHang(String IDMH, String name, int DVT) {
		this.IDMatHang = IDMH;
		this.TenMatHang = name;
		this.SoLương = DVT;
	}

	public MatHang() {
	}

	public String getIDMH() {
		return IDMatHang;
	}

	public void setIDMH(String maMon) {
		this.IDMatHang = maMon;
	}

	public int getSoDonviht() {
		return SoLương;
	}

	public void setSoDonviht(int soDonviht) {
		this.SoLương = soDonviht;
	}

	public String getMH() {
		return TenMatHang;
	}

	public void setTenMon(String tenMon) {
		this.TenMatHang = tenMon;
	}

	public Object[] toArray() {
		return new Object[] { IDMatHang, TenMatHang, SoLương };
	}
}
