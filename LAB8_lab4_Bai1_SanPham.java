package com.mycompany.lab8;

import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giaGiam;
    
    public SanPham(){
        
    }
    
    public SanPham(String tenSp, double donGia, double giaGiam){
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giaGiam = giaGiam;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiaGiam() {
        return giaGiam;
    }

    public void setGiaGiam(double giaGiam) {
        this.giaGiam = giaGiam;
    }

    @Override
    public String toString() {
        return "tenSp=" + tenSp + ", donGia=" + donGia + ", giaGiam=" + giaGiam;
    }
    
    public double ThueNhapKhau(){
        return this.donGia*0.1;
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        String tenSp;
        double donGia;
        double giaGiam;
        
        System.out.println("Nhap Ten san pham: ");
        this.setTenSp(sc.nextLine());
        
        System.out.println("Nhap don gia: ");
        this.setDonGia(sc.nextDouble());
        
        System.out.println("Nhap gia giam: ");
        this.setGiaGiam(sc.nextDouble());

    }
    
    public void Xuat(){
        System.out.println("Xuat: " +toString());
    }
    
}
