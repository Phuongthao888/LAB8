package LAB4_BAI3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String tenSp = null;
        Scanner sc = new Scanner(System.in);
        SanPham sp1 = new SanPham(tenSp, 0);
        SanPham sp2 = new SanPham(tenSp, 0, 0);
        
        System.out.println("SP1");
        sp1.Nhap();
        System.out.println("SP2");
        sp2.Nhap();
        
        sp1.Xuat();
        sp2.Xuat();
        
    }
}
