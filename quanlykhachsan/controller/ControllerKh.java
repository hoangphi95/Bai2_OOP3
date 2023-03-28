package quanlykhachsan.controller;

import quanlykhachsan.KhachHang;
import quanlykhachsan.service.ServicerKh;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerKh {
    ServicerKh servicerKh=new ServicerKh();
    KhachHang kh=new KhachHang();
    Scanner sc=new Scanner(System.in);
    public void realAll(){
        ArrayList<KhachHang>list=servicerKh.xem();
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public void add(){
        sc.nextLine();
        System.out.println("Nhập id khách hàng");
        kh.setIdKh(sc.nextLine());
        System.out.println(" Nhập vào tên khách hàng");
        kh.setTenKh(sc.nextLine());
        System.out.println(" Nhập vào giới tính");
        kh.setGioiTinh(sc.nextLine());
        System.out.println(" Nhập vào sđt");
        kh.setSdt(sc.nextLine());
        servicerKh.them(kh);
    }
    public void update(){
        sc.nextLine();
        System.out.println("Nhập id khách hàng");
        kh.setIdKh(sc.nextLine());
        System.out.println(" Nhập vào tên khách hàng");
        kh.setTenKh(sc.nextLine());
        System.out.println(" Nhập vào giới tính");
        kh.setGioiTinh(sc.nextLine());
        System.out.println(" Nhập vào sđt");
        kh.setSdt(sc.nextLine());
        servicerKh.sua(kh);

    }
    public void delete(){
        System.out.println("Nhập tên khách Hàng");
        kh.setTenKh(sc.nextLine());
        servicerKh.delete(kh);
    }
    public void timKh(){
        System.out.println("Nhập từ tìm kiếm");
        String tk= sc.nextLine();
        servicerKh.sreachKH(tk);
    }
}
