

package mangsonguyen;

import java.util.Scanner;

//1. Viết một phương thức int min (int [] mảng) trả về giá trị nhỏ nhất được lưu trữ trong mảng
//2. Viết phương thức int find (int [] mảng, int value) trả về vị trí xuất hiện đầu tiên của giá trị trong mảng. Nếu không tìm thấy giá trị, phương thức trả về -1.
//3. Viết một phương thức int sumArray (int [] mảng) trả về tổng của tất cả các phần tử trong mảng.
//4. Viết một phương thức void printArray (int [] mảng) in các giá trị được lưu trong mảng.
//5. Viết một phương thức int [] ReverseArray (int [] mảng) trả về một mảng mới lưu trữ các phần tử của mảng được đưa ra làm đối số.
//6. Viết một phương thức chính để kiểm tra các phương pháp trên.
public class Mangsonguyen {

    public static void main(String[] args) {

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

        Mangsonguyen msn = new Mangsonguyen();

        //Tim gia tri nho nhat
        System.out.println("Gia tri nho nhat trong mang la: " + msn.min(mang));

        //Tim so
        int timSo;
        System.out.print("Nhap so can tim: ");
        timSo = nhap.nextInt();

        if (msn.find(mang, timSo) == -1)
        {
            System.out.println("Khong tim thay!");
        } else
        {
            System.out.println("Gia tri can tim nam o vi tri: " + msn.find(mang, timSo));
        }

        //Tinh tong
        System.out.println("Tong cac phan tu trong mang la: " + msn.sumArray(mang));

        //In mang
        System.out.print("Cac phan tu co trong mang la: ");
        msn.printArray(mang);

        //Dao mang
        System.out.print("\nMang sau khi dao la: ");
        for (int i = 0; i < msn.ReverseArray(mang).length; i++) 
        {
            System.out.print(msn.ReverseArray(mang)[i] + " ");
        }
    }
//ham tim gia tri nho nhat

    public int min(int[] a) 
    {
        int min = a[0];
        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] < min)
            {
                a[i] = min;
            }
        }
        return min;
    }
//ham tim x
    public int find(int[] a, int value)
    {
        int tam = -1;
        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] == value)
            {
                tam = i;
                break;
            }
        }
        return tam;
    }
//ham tinh tong

    public int sumArray(int[] a) {
        int tong = 0;
        for (int i = 0; i < a.length; i++)
        {
            tong = tong + a[i];
        }
        return tong;
    }
// ham in mang

    public void printArray(int[] a) {
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
//ham dao so

    public int[] ReverseArray(int[] a)
    {
        int[] mangMoi = new int[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) 
        {
            mangMoi[j] = a[i];
            j++;
        }
        return mangMoi;
    }
}
