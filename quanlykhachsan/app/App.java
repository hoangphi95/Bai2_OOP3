package quanlykhachsan.app;

import quanlykhachsan.controller.Controller;
import quanlykhachsan.controller.ControllerKh;
import quanlykhachsan.controller.ControllerPhong;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ControllerKh ckh=new ControllerKh();
        Controller c=new Controller();
        ControllerPhong cp=new ControllerPhong();
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("1: Để tìm phòng");
            System.out.println("2: Để tìm tên khách hàng");
            System.out.println("3. Để kiểm tra phòng trống");
            System.out.println("4. Để kiểm tra phòng đã thuê");
            System.out.println("5. Để cho thuê");
            System.out.println("6.Trả phòng");
            int chon= sc.nextInt();
            switch (chon){
                case 1:
                    cp.timPhong();
                    break;
                case 2:
                    ckh.timKh();
                    break;
                case 3:
                    cp.ktPhongTrong();
                    break;
                case 4:
                    cp.ktPhongdathue();
                    break;
                case 5:
                    c.choThue();
                    break;
                case 6:
                    c.traPhong();
                    break;
            }
        }while (true);
    }
}
