/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhvien;
import java.util.Scanner;


/**
 *
 * @author Nho
 */

public class SV {
    private int MSSV;
    private String TenSV;
    private float Diem;
    
    Scanner nhap = new Scanner(System.in);
    // get set

    public int getMSSV() {
        return MSSV;
    }

    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public float getDiem() {
        return Diem;
    }

    public void setDiem(float Diem) {
        this.Diem = Diem;
    }
    
    // constructor
    
    public SV(){
    }
    public SV(int MSSV,String TenSV,float Diem)
    {
        this.MSSV = MSSV;
        this.TenSV = TenSV;
        this.Diem = Diem;  
    }
    
    public void NhapTT(){
        System.out.println("Nhap ma so sinh vien: ");
        this.MSSV = Integer.parseInt(nhap.nextLine());
        
        System.out.println("Nhap ten sinh vien: ");
        this.TenSV =(nhap.nextLine());
        
        System.out.println("Nhap diem: ");
        this.Diem = (nhap.nextFloat());
    }
    
    public void XuatTT(){
    
        System.out.println("Ma so sinh vien:"+this.MSSV);
        System.out.println("Ten sinh vien: "+this.TenSV);
        System.out.println("Diem sinh vien: "+this.Diem);
    }
    
    public void NhapMang(SV[]a){
        
             for(int i =0;i<a.length;i++)
             {
                 System.out.println("Nhap sinh vien thu "+i);
                 a[i] = new SV ();
                 a[i].NhapTT();
             }
    }
    
    public void XuatMang(SV[]a){
        
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Thong tin sinh vien thu "+i);
            a[i].XuatTT();
            
        }
    }
     public SV maxdiem(SV[]mang){
         int flag = -1;
         float max = mang[0].Diem;
        for(int i = 0;i<mang.length;i++)
        {
            if (mang[i].Diem > max){
                  max = mang[i].Diem;
                  flag = i;
            }
        }return mang[flag] ;
     }
     
    public void XuatSV(SV a){
        
       
        System.out.println("Ma so sinh vien:"+a.MSSV);
        System.out.println("Ten sinh vien: "+a.TenSV);
        System.out.println("Diem sinh vien lon nhat: "+a.Diem);
    }
    
    public SV TimID(SV []mang,int x){
        for(int i = 0;i<mang.length;i++)
        {
            if (mang[i].MSSV == x)
      
            return mang[i];
            
        }return null;
 
    }
   
}
