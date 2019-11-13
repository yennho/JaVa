/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhi;
import java.util.Scanner;

/**
 *
 * @author Nho
 */
public class Nhi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner nhap = new Scanner(System.in);
         test t = new test();
         
//         t.NhapTT(t);
        // System.out.println("-----------THONG TIN ACCOUT-------------");
        // t.XuatTT(t);
        
        
        System.out.println("Nhap so luong phan tu: ");
        int sophantu;
        sophantu = nhap.nextInt();
        test []arrayacc = new test [sophantu];
        
        for(int i =0;i<arrayacc.length;i++)
        {
            arrayacc[i] = new test();
            arrayacc[i].NhapTT(arrayacc[i]);
        }
          System.out.println("-----------THONG TIN ACCOUNT-------------");
           for(int i=0;i<arrayacc.length;i++)
           {
               arrayacc[i].XuatTT(arrayacc[i]);
           }
           
       // rut tien
            System.out.println("Nhap id can rut tien:");
            int idCanruttien = nhap.nextInt();
            for(int i =0;i< arrayacc.length;i++)
                if(arrayacc[i].getAccountBalance()== idCanruttien)
                {
                    System.out.println("Nhap so tien can rut: ");
                    int sotiencanrut = nhap.nextInt();
                    arrayacc[i].Ruttien(arrayacc[i], sotiencanrut);
                }
            
            //tim id
             int x;
            System.out.println("Nhap id can tim");
            int idCantim = nhap.nextInt();
               for(int i =0;i< arrayacc.length;i++) 
            if (t.TimId(arrayacc, x) != null){
                        System.out.println("-->Thông tin account có ID = " + x + " la: ");
                    t.XuatTT(t.TimId(arrayacc, x));
                    } else{
                        System.out.println("không tìm thấy account có ID " + x);
                    }  
               
               
               //
               int kq =0;
               System.out.print("Nhập id tài khoản người chuyển: ");
                    int nguoi1 = nhap.nextInt();
                    System.out.print("Nhập id tài khoản người nhận: ");
                    int nguoi2 = nhap.nextInt();
                    for (int i = 0; i < arrayacc.length; i++) {
                        for (int j = 0; j < arrayacc.length; j++) {
                            if (arrayacc[i].getAccountID() == nguoi1 && arrayacc[j].getAccountID()== nguoi2 ) {
                           kq = t.TranferAtoB(arrayacc[i], arrayacc[j]);
                                break;
                            }
                        }
                    }
                    if (kq == 1) System.out.println("Chuyển tiền thành công");
                    else System.out.println("Chuyển tiền thất bại");

                
    }
}
