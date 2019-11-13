 

/*
 1.Viết phương thức tìm kiếm một giá trị nguyên đã cho trong một mảng số nguyên. 
+ Thực hiện: thực hiện tìm kiếm trên mảng
+ Tức là: lặp qua mảng từ đầu và so sánh từng phần tử với giá trị tìm kiếm.
+ Trả về chỉ số của giá trị nếu nó được tìm thấy, khác trả về -1.
 2.Hiện thực một phương thức tương tự để tìm kiếm một giá trị trong mảng hai chiều.

 */
package timkiemmang;

import java.util.Scanner;

public class TimKiemMang {

    public static void main(String[] args) 
    {
        Scanner nhap = new Scanner(System.in);
        int soPhanTu;

        System.out.print("Nhap so phan tu cua mang: ");
        soPhanTu = nhap.nextInt();

        int[] mang = new int[soPhanTu];
        for (int i = 0; i < soPhanTu; i++) 
        {
            System.out.print("a[" + i + "] = ");
            mang[i] = nhap.nextInt();
        }
        
        TimKiemMang tkm = new TimKiemMang();
        int timso;

        System.out.print("Nhap so can tim: ");
        timso = nhap.nextInt();

        if (timkiem(mang, timso)[0] == -1) 
        {
            System.out.println("Khong tim thay!");
        } 
        else 
        {
            System.out.println("Gia tri can tim nam o vi tri: ");
            for (int i = 0; i < timkiem(mang, timso).length; i++) 
            {
                if (timkiem(mang, timso)[i] == 0 && i != 0) 
                {
                 // continue;
                } 
                else
                System.out.println(timkiem(mang, timso)[i]);
            }
            
        }
    }

public static int[] timkiem(int a[], int value) {
        int mangluu[] = new int[a.length];
        int j = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                mangluu[j] = i;
                j++;

            }
        }
        if (j == 0) {
            mangluu[0] = -1;
        }
        return mangluu;
    }
}
