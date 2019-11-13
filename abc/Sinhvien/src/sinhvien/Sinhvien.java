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
public class Sinhvien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code appli/cation logic here
        
        Scanner nhap = new Scanner(System.in);

        
        SV sv = new SV();
//        //sv.NhapTT();
//        System.out.println("----------Thong tin sinh vien---------");
//        sv.XuatTT();
         int n;
         System.out.println("Nhap so luong sinh vien: ");
         n= nhap.nextInt();
        
         SV []arrsv = new SV[n];
         SV a = new SV();
     
         a.NhapMang(arrsv);
         System.out.println("-------------------------------");
         a.XuatMang(arrsv);
         System.out.println("-------------------------------");
         a.XuatSV(a.maxdiem(arrsv));
         
         // tim id 
         int x;
         System.out.println("-------------------------------");
         System.out.println("Nhap id can tim: ");
         x = nhap.nextInt();
         if(a.TimID(arrsv, x)==null) System.out.println("Khong tim thay");
         else
         {
         System.out.println("Thong tin sinh vien co Id can tim la: ");
         a.XuatSV(a.TimID(arrsv,x));
        
         }
    }
    
}
