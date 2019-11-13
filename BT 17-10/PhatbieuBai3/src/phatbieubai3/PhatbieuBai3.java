
/*
Viết phương thức yêu cầu người dùng nhập 2 số nguyên và trả về:
 a. Tổng a và b nếu cả hai số nguyên là số chẵn.
 b. Phép nhân của a với b nếu cả hai số nguyên là số lẻ. 
 c. Khác, bình phương của mỗi số nguyên.
 */
package phatbieubai3;

import java.util.Scanner;

public class PhatbieuBai3 {

    public static void main(String[] args) {

        Scanner nhap = new Scanner(System.in);
        int a, b;

        System.out.print("Nhap so a: ");
        a = nhap.nextInt();

        System.out.print("Nhap so b: ");
        b = nhap.nextInt();
        
        System.out.println("***************");
        System.out.println("Ket qua la: "+bai3(a, b));

    }

    public static int bai3(int a, int b) {
         //tong(chan)
        if (a % 2 == 0 && b % 2 == 0) 
        {
            return a + b;
        }
                
        //nhan(le)
        else if (a % 2 != 0 && b % 2 != 0) 
        {
            return a * b;
        }
        //binh phuong
        else return(a*a + b*b);
    }
}