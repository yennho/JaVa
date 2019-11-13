/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhonho;

import java.util.*;

/**
 *
 * @author Nho
 */
public class Nhonho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap = new Scanner(System.in);
//        int a,b;
//        System.out.println("nhap a: ");
//        a = nhap.nextInt();
//        System.out.println("nhap b:");
//        b = nhap.nextInt();
//        test nc = new test();
//        System.out.println("Tong 2 so:"+nc.Tong(a, b));
//        
//       
//        System.out.println("so lon nhat la: "+nc.max(a, b));
//        

//         t.NhapMang(a);
//         
//         System.out.println("Mang vua nhap: ");
//         t.XuatMang(a);
//         
//         System.out.println("so nho nhat la:"+t.min(a));  
//         System.out.println("nhap so can tim: ");
//         int x;
//         x= nhap.nextInt();
//         if(t.find(a, x)== -1) System.out.println("khong tim thay");
//         else
//         System.out.println("so can tim nam o vi tri: "+t.find(a, x));
//         
//         System.out.println("tong la: "+t.sumArray(a));
//         
//         System.out.println("mang sau khi dao la: ");
//         t.XuatMang(t.resverseArray(a));
        test t = new test();
        int[] a = null;
        int Luachon;

        do {

            System.out.println("1.Nhap mang");
            System.out.println("2.Xuat mang");
            System.out.println("3.Nhap mang 2 chieu");
            System.out.println("4.Thoat");
            System.out.print("Nhap lua chon: ");

            Luachon = nhap.nextInt();
            switch (Luachon) {

                case 1: {
                    //xu ly
                    int n;
                    System.out.println("Nhap n so phan tu: ");
                    n = nhap.nextInt();
                    a = new int[n];

                    t.NhapMang(a);

                }
                break;

                case 2: {
                    t.XuatMang(a);
                }
                break;

                case 3: {
                    System.out.println("nhap so dong: ");
                    int dong = nhap.nextInt();
                    System.out.println("nhap so cot ");
                    int cot = nhap.nextInt();
                    int [][] b = new int[dong][cot];
                    t.nhapMang2D(b);
                }
                break;

                case 4: {
                }
                break;
                default: {
                    System.out.println("sai chuc nang");
                }
                break;

            }
        } while (Luachon != 4);
    }

}
