package quanlykhachsan.controller;

import quanlykhachsan.Phong;
import quanlykhachsan.service.ServicerPhong;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerPhong {
    Phong p=new Phong();
    ServicerPhong sp=new ServicerPhong();
    Scanner sc=new Scanner(System.in);
    public void reallAll(){
        ArrayList<Phong>list= sp.xem();
        for (int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public void add(){
        sc.nextLine();
        System.out.println("Nhập id khách hàng");
        p.setIdKh(sc.nextLine());
        System.out.println("Nhập số phòng");
        p.setSoPhong(sc.nextLine());
        System.out.println("Loại Phòng");
        p.setLoaiPhong(sc.nextLine());
        System.out.println("Trạng thái");
        p.setTrangThai(sc.nextLine());
        sp.them(p);
    }
    public void update(){
        sc.nextLine();
        System.out.println("Nhập id khách hàng");
        p.setIdKh(sc.nextLine());
        System.out.println("Nhập số phòng");
        p.setSoPhong(sc.nextLine());
        System.out.println("Loại Phòng");
        p.setLoaiPhong(sc.nextLine());
        System.out.println("Trạng thái");
        p.setTrangThai(sc.nextLine());
        sp.sua(p);
    }
    public void delete(){
        System.out.println("Nhập vào số phòng");
        p.setSoPhong(sc.nextLine());
        sp.delete(p);
    }
    public void timPhong(){
        System.out.println("Nhập số phòng");
        String tk= sc.nextLine();
        sp.sreachPhong(tk);
    }
    public void ktPhongTrong(){
        sp.phongControng();
    }
    public void ktPhongdathue(){
        sp.phongDaThue();
    }
}
