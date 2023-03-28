package quanlykhachsan;

public class Phong extends KhachHang{
private String soPhong;
private String loaiPhong;
private String trangThai;
public Phong(){

}

    public Phong(String idKh,String soPhong, String loaiPhong, String trangThai) {
        super.setIdKh(idKh);
        this.soPhong = soPhong;
        this.loaiPhong = loaiPhong;
        this.trangThai = trangThai;
    }

    public String getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "Phong{" +
                "id Khách Hàng="+super.getIdKh()+'\''+
                "soPhong='" + soPhong + '\'' +
                ", loaiPhong='" + loaiPhong + '\'' +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }
}
