package quanlykhachsan.service;

import quanlykhachsan.KhachHang;

import java.util.ArrayList;

public class ServicerKh {
    ArrayList<KhachHang> list = new ArrayList<>();

    public ArrayList<KhachHang> xem() {
        if (list == null) {
            KhachHang kh = new KhachHang("1", "Chiến", "Nam", "094265841");
            KhachHang kh1 = new KhachHang("2", "Nam", "Nam", "094265841");
            KhachHang kh2 = new KhachHang("3", "xuân", "nữ", "0942645825");
            KhachHang kh3 = new KhachHang("4", "Chinh", "nữ", "098657203");
            KhachHang kh4 = new KhachHang("5", "Minh", "nữ", "036682058");
            KhachHang kh5 = new KhachHang("6", "Minh", "Nam", "058456883");
            KhachHang kh6 = new KhachHang("7", "Nam", "Nam", "0365899222");
            list.add(kh);
            list.add(kh1);
            list.add(kh2);
            list.add(kh3);
            list.add(kh4);
            list.add(kh5);
            list.add(kh6);
        }
        return list;

    }

    public void them(KhachHang khachHang) {
        list.add(khachHang);
    }

    public void sua(KhachHang khachHang) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null && list.get(i).equals(khachHang.getTenKh())) {
                list.add(khachHang);
            }
        }
    }

    public void delete(KhachHang khachHang) {
        xem();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null && list.get(i).equals(khachHang.getTenKh())) {
                list.remove(khachHang);
            }
        }
    }

    public void sreachKH(String tk) {
        xem();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null && list.get(i).getTenKh().equals(tk)) {
                System.out.println(list.get(i));
            }
        }
    }
}