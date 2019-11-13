/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taikhoan;

import java.util.Scanner;


public class TaiKhoan {

    
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int luaChon, kq = 0;
        // mang 
        // chu y 
        Account[] arrAcc = null;
        Account acc = new Account();

        do {
            System.out.println("------------------------------------");
            System.out.println("1. Nhập thông tin");
            System.out.println("2. Xuất thông tin");
            System.out.println("3. Tìm kiếm");
            System.out.println("4. Rút tiền");
            System.out.println("5. Chuyển tiền");
            System.out.println("6.Thoát");
            System.out.print("Nhập lựa chọn: ");
            luaChon = inp.nextInt();
            System.out.println("------------------------------------");

            switch (luaChon) {
                case 1: {
                    int n;
                    System.out.print("Nhập số lượng account: ");
                    n = inp.nextInt();

                    arrAcc = new Account[n];

                    for (int i = 1; i < arrAcc.length; i++) {
                        System.out.println("-->Nhập account thứ " + i);
                        arrAcc[i] = new Account();
                        arrAcc[i].nhap(arrAcc[i]);
                        System.out.println("");
                    }
                }
                break;
                case 2: {
                    for (int i = 0; i < arrAcc.length; i++) {
                        System.out.println("-->Thông tin account thứ " + i);
                        arrAcc[i].xuat(arrAcc[i]);
                        System.out.println("");
                    }
                }
                break;
                case 3: {
                    System.out.print("Nhập ID cần tìm: ");
                    int X = inp.nextInt();
                    if (acc.timKiem(arrAcc, X) != null){
                        System.out.println("-->Thông tin account có ID = " + X + " la: ");
                    acc.xuat(acc.timKiem(arrAcc, X));
                    } else{
                        System.out.println("không tìm thấy account có ID " + X);
                    }                   
                }
                break;
                case 4: {
                    System.out.print("Nhập id tài khoản cần rút tiền: ");
                    int id = inp.nextInt();
                    for (int i = 0; i < arrAcc.length; i++) {
                        if (arrAcc[i].getAccountID() == id) {
                            System.out.print("Nhập số tiền cần rút: ");
                            int soTienCanRut = inp.nextInt();
                            arrAcc[i].rutTien(arrAcc[i], soTienCanRut);
                        }
                    }
                }break;
                case 5: {
                    System.out.print("Nhập id tài khoản người chuyển: ");
                    int nguoi1 = inp.nextInt();
                    System.out.print("Nhập id tài khoản người nhận: ");
                    int nguoi2 = inp.nextInt();
                    for (int i = 0; i < arrAcc.length; i++) {
                        for (int j = 0; j < arrAcc.length; j++) {
                            if (arrAcc[i].getAccountID() == nguoi1 && arrAcc[j].getAccountID()== nguoi2 ) {
                                kq = acc.tranferAtoB(arrAcc[i], arrAcc[j]);
                                break;
                            }
                        }
                    }
                    if (kq == 1) System.out.println("Chuyển tiền thành công");
                    else System.out.println("Chuyển tiền thất bại");

                }
                break;
                case 6: {
                    //thoát
                }
                break;
                default: {
                    System.out.println("Sai chức năng => Vui lòng nhập lại");
                }
                break;
            }
        } while (luaChon != 6);

    }
}
