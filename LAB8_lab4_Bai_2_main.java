package LAB4_BAI2;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
       
        System.out.println("SP1");
        sp1.Nhap();
        System.out.println("\nSP2");
        sp2.Nhap();
        
        sp1.Xuat();
        sp2.Xuat();
    }
}
