package LAB5_BAI1;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSoThuc {
    private ArrayList<Double> danhsachsothuc;
    Double d;
    Scanner sc  = new Scanner(System.in);
    
    public DanhSachSoThuc(){
        super();
        danhsachsothuc = new ArrayList<Double>();
    }
    
    public void Nhap(){
        int n;
        System.out.print("So luong can nhap: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Nhap so thuc vao danh sach: ");
            float x = sc.nextFloat();
            d = new Double(x);
            danhsachsothuc.add(d);
        }
    }
    
    public void Xuat(){
        for (Double d : danhsachsothuc)
        {
            System.out.print(d.toString());
        }
    }
}
