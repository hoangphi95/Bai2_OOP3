package quanlykhachsan;

public class KhachHang {
    private String idKh;
    private String tenKh;
    private String gioiTinh;
    private String sdt;
    public KhachHang(){

    }

    public KhachHang(String idKh, String tenKh, String gioiTinh, String sdt) {
        this.idKh = idKh;
        this.tenKh = tenKh;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
    }

    public String getIdKh() {
        return idKh;
    }

    public void setIdKh(String idKh) {
        this.idKh = idKh;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "idKh='" + idKh + '\'' +
                ", tenKh='" + tenKh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", sdt='" + sdt + '\'' +
                '}';
    }
}
