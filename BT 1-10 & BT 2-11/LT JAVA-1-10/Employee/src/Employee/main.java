  



package Employee;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
           /* Employee ep = new Employee();
            Employee ep2 = new Employee(065, "Duong Quoc Tuan", 3500, "110117065", "0766829011");

            System.out.print("Nhap ho so nhan vien 1: ");
            ep.NhapThongTin();

            ep.XuatTT(ep);
            System.out.print("Tong luong: " + ep.Sum_of_Sale(50));

            System.out.println("\n**************************");

            ep2.XuatTT(ep2);
            System.out.print("Tong luong: " + ep2.Sum_of_Sale(50));
       */
           
          
         //  se.Nhap();
         
           Service se = new Service();
           
           se.Nhapmang();
           //se.XuatMang();
           
           System.out.println("************************");
           System.out.println("Nhap id can tim: ");
           Scanner nhap = new Scanner(System.in);
           int n = nhap.nextInt();
           
          // se.Timkiem(se.getArray(), 0);
          if(se.Timkiem(se.getArray(), n)==null)
              System.out.println("Khong tim thay!");
          else
          {
              se.XuatTTTimKiem(se.Timkiem(se.getArray(), n));
          }                 
    }
    
}
