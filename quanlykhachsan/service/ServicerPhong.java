package quanlykhachsan.service;

import quanlykhachsan.Phong;

import java.util.ArrayList;

public class ServicerPhong {
    ArrayList<Phong> list1 = new ArrayList<>();

    public ArrayList<Phong> xem() {
        if (list1 == null) {
            Phong p = new Phong("1", "101", "Đơn", "thuê");
            Phong p1 = new Phong("2", "102", "đôi", "thuê");
            Phong p2 = new Phong("3", "103", "Đơn", "thuê");
            Phong p3 = new Phong("4", "104", "đôi", "thuê");
            Phong p4 = new Phong("5", "105", "Đơn", "thuê");
            Phong p5 = new Phong("6", "106", "Đơn", "thuê");
            Phong p6 = new Phong("7", "107", "Đơn", "thuê");
            Phong p7 = new Phong(null, "109", "Đơn", "trống");
            list1.add(p);
            list1.add(p1);
            list1.add(p2);
            list1.add(p3);
            list1.add(p4);
            list1.add(p5);
            list1.add(p6);
            list1.add(p7);
        }
        return list1;
    }

    public void them(Phong phong) {
        list1.add(phong);
    }

    public void sua(Phong phong) {
        xem();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != null && list1.get(i).equals(phong.getSoPhong())) {
                list1.add(phong);
            }
        }
    }

    public void delete(Phong phong) {
        xem();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != null && list1.get(i).equals(phong.getSoPhong())) {
                list1.remove(phong);
            }
        }
    }

    public void sreachPhong(String tk) {
      xem();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).getSoPhong().equals(tk)) {
                System.out.println(list1.get(i).toString());
            }
        }

    }
    public void phongControng(){
        xem();
        for (int i=0;i<list1.size();i++){
            if (list1.get(i)!=null && list1.get(i).getTrangThai().equals("trống")){
                System.out.println(list1.get(i));
            }
        }
    }
    public void phongDaThue(){
        xem();
        for (int i=0;i<list1.size();i++){
            if (list1.get(i)!=null && list1.get(i).getTrangThai().equals("thuê")){
                System.out.println(list1.get(i));
            }
        }
    }
}