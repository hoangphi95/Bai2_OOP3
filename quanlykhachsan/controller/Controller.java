package quanlykhachsan.controller;

import quanlykhachsan.service.Servicer;

import java.util.Scanner;

public class Controller {
    Scanner sc=new Scanner(System.in);
    ControllerKh ckh = new ControllerKh();
    ControllerPhong cp = new ControllerPhong();
    Servicer sv = new Servicer();
    public void choThue(){
        String kt=sc.nextLine();
        sv.choThuePhong(kt);
        ckh.add();
        cp.update();
    }
    public void traPhong(){
        String kt=sc.nextLine();
        sv.choThuePhong(kt);
        ckh.delete();
        cp.update();
    }

}
