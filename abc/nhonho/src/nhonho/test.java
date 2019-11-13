/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhonho;

import java.util.Scanner;


/**
 *
 * @author Nho
 */
public class test {
//    public int Tong(int a,int b){
//        return a+b;
//        
//    }
//    public int max(int a,int b){
//        int max;
//        if (a>b) max = a;
//        else
//        max = b;
//        return max;  
//    }
    
    
    Scanner nhap = new Scanner(System.in);
    //nhap mang
    public void NhapMang(int a[])
    {
        for(int i =0;i<a.length;i++)
        {
            System.out.print("a[" + i + "]= ");
            a[i] = nhap.nextInt();          
        }              
    } 
    //xuat mang
    public void XuatMang(int [] a){
    
        for(int i =0;i<a.length;i++)
        {
          
            System.out.println("a["+ i+ "]= "+a[i]);
        }
    }
    // gtnn
    public int min(int a[]){
       int min = a[0];
       for(int i = 0;i<a.length;i++)
       {
           if (a[i]< min )
            min = a[i];   
       }  return min;
    }
    //tim so 
    public int find(int []mang,int value)
    {
        for(int i =0;i<mang.length;i++)
        {
            if (mang[i] == value)
                return i;
        }
         return -1;
    }
    // tong 
    public int sumArray(int mang[]){
        int tong =0;
        for(int i = 0;i<mang.length;i++)
        {
            
            tong += mang[i];
        } return tong;
    } 
    // dao so
    public int [] resverseArray(int [] a){
        int [] b = new int[a.length];
        int tmp = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            b[tmp] = a[i];
            tmp--;
        }
        return b;
    }
    // nhap mang hai chieu
    
    public void nhapMang2D(int [][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("a[" +i+"][" +j+"] = ");
                a[i][j] = nhap.nextInt();
            }
        }
    }
    
}
