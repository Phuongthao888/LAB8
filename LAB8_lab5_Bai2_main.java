package LAB5_BAI2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        DanhSach ds = new DanhSach();
        Scanner sc = new Scanner(System.in);
        int menu;
        do{
            System.out.println("Menu");
            System.out.println("1.Nhap");
            System.out.println("2.Xuat");
            System.out.println("3.Sap xep");
            System.out.println("4. Ngau nhien");
            System.out.println("5. Tim");
            System.out.println("6.Xoa");
            System.out.print("Lua chon: ");
            menu = sc.nextInt();
            
            switch(menu){
                case 1:
                    ds.Nhap();
                    break;
                case 2:
                    ds.Xuat();
                    break;
                case 3:
                    ds.SapXep();
                    break;
                case 4:
                    ds.NgauNhien();
                    break;
                case 5:
                    String HoTen = sc.nextLine();
                    System.out.print("Nhap ten can tim: ");
                    HoTen = sc.nextLine();
                    ds.Tim(HoTen);
                    break;
                case 6:
                    HoTen = sc.nextLine();
                    System.out.print("Nhap ten can xoa: ");
                    HoTen = sc.nextLine();
                    ds.Xoa(HoTen);
                    break;
                default:
                    System.out.print("Nhap lai! ");
            }
            
        }while(menu!=0);
    }
}
