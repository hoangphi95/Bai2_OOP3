package quanlykhachsan.service;

import quanlykhachsan.KhachHang;
import quanlykhachsan.Phong;

import java.util.ArrayList;

public class Servicer {
    ServicerKh skh=new ServicerKh();
    ServicerPhong sp=new ServicerPhong();
    public void choThuePhong(String tk){
        ArrayList<KhachHang>list=skh.xem();
        ArrayList<Phong>list1=sp.xem();
        for (int i=0;i<list1.size();i++){
            if (list1.get(i).getSoPhong().equals(tk)){
                System.out.println(true);
            }
        }
    }
    public void TraPhong(String tk) {
        ArrayList<KhachHang> list = skh.xem();
        ArrayList<Phong> list1 = sp.xem();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).getSoPhong().equals(tk)) {
                System.out.println(true);
            }
        }
    }
}
