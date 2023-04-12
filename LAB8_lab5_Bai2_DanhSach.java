package LAB5_BAI2;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSach {
    private ArrayList<TEN> danhsach;
    TEN t;
    Scanner sc = new Scanner(System.in);
    
    public DanhSach(){
        super();
        danhsach = new ArrayList<TEN>();
    }
    
    public void Nhap(){
        int n;
        System.out.print("So luong can nhap: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            String HoTen = sc.nextLine();
            System.out.print("Nhap ho va ten: ");
            HoTen = sc.nextLine();
            
            t = new TEN(HoTen);
            danhsach.add(t);
        }
    }
    
    public void Xuat(){
        for (TEN ten : danhsach) {
            System.out.println(ten.toString());
        }
    }
    
    public void Tim(String ten){
         for(TEN t : danhsach)
            if(t.getHoTen().indexOf(ten)>=0)
            {
                System.out.print("thong tin dien thoai duoc tim theo ten: ");
                System.out.println(t);
            }
    }
    
    public void Xoa(String ten){
        for(TEN t : danhsach)
            if(t.getHoTen().indexOf(ten)>=0)
            {
               this.danhsach.remove(t);
                    break;
            }
    }
}
