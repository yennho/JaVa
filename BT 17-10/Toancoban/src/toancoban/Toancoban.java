

/*
Viết chương trình áp dụng phép toán số học giữa 2 số nguyên được nhập từ phím.
Sử dụng menu (DOS) cơ bản để lựa chọn toán hạng: Cho ví dụ như menu bên dưới, nếu nhập hai số: 2 và 1 sau đó chọn 1:
1. cộng
2. trừ
3. nhân
4. chia
Ví dụ:  chọn 1: Đầu ra: 2 + 1 = 3
 */

package toancoban;

import java.util.Scanner;

public class Toancoban {

    public static void main(String[] args) {

        Scanner nhap = new Scanner(System.in);

        int luaChon, soThuNhat, soThuHai;

        System.out.print("Nhap so thu nhat: ");
        soThuNhat = nhap.nextInt();

        System.out.print("Nhap so thu hai: ");
        soThuHai = nhap.nextInt();
        do {
            System.out.println("************************");
            System.out.println("1. Cong");
            System.out.println("2. Tru");
            System.out.println("3. Nhan");
            System.out.println("4. Chia");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            luaChon = nhap.nextInt();
            System.out.println("************************");
            switch (luaChon) {
                //cong
                case 1: {
                    int kq = soThuNhat + soThuHai;
                    System.out.println(soThuNhat + " + " + soThuHai + " = " + kq);
                }
                break;
                //tru
                case 2: {
                    int kq = soThuNhat - soThuHai;
                    System.out.println(soThuNhat + " - " + soThuHai + " = " + kq);
                }
                break;
                //nhan
                case 3: {
                    int kq = soThuNhat * soThuHai;
                    System.out.println(soThuNhat + " * " + soThuHai + " = " + kq);
                }
                break;
                //chia
                case 4: {
                    float kq = (float)soThuNhat / soThuHai;
                    System.out.println(soThuNhat + " / " + soThuHai + " = " + kq);
                }
                case 0: {
                }
                break;
                default: {
                    System.out.println("Vuot qua chuc nang!!! Vui long nhap lai");
                }
            }
        } while (luaChon != 0);
    }

}
