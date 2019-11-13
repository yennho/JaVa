

/*Làm việc với số nguyên
1. Viết phương thức int add (int a, int b) trả về tổng của a và b.
2. Viết phương thức int mult (int a, int b) trả về phép nhân của a với b.
3. Viết phương thức int max (int a, int b) trả về giá trị lớn nhất của a và b.
4. Viết phương thức int min (int a, int b, int c) trả về mức tối thiểu của a, b và c.
5. Viết phương thức int gcd (int a, int b) trả về chia chung lớn hơn của a và b.
*/

package songuyen;

import java.util.Scanner;

public class SoNguyen {

    public static void main(String[] args) 
    {
        Scanner nhap = new Scanner(System.in);
        int a, b;
        
        System.out.print("Nhap so a: ");
        a = nhap.nextInt();
        
        System.out.print("Nhap so b: ");
        b = nhap.nextInt();
        
        SoNguyen sn = new SoNguyen();
        System.out.println("Tong = " + sn.Tong(a, b));
        System.out.println("Tich  = " + sn.Tich(a, b));
        System.out.println("Gia tri lon nhat  = " + sn.GTLN(a, b));
        System.out.println("Min  = " + sn.min(a, b));
        System.out.println("Gcd  = " + sn.gcd(a, b));
    }

    public int Tong(int a, int b) 
    {
        return a + b;

    }

    public int Tich(int a, int b) 
    {
        return a * b;
    }

    public int GTLN(int a, int b) 
    {
        if (a > b) 
        {
            return a;
        } else 
        {
            return b;
        }
    }

    public int min(int a, int b)
    {
        if (a < b)
        {
            return a;
        } else
        {
            return b;
        }
    }

    public int gcd (int a, int b)
    {
        if (a == 0 || b == 0)
        {
            return a+b;
        }
        while (a != b)
        {
            if (a > b)a = a - b;
            else b = b - a;
        }
        return a;
    }
}
