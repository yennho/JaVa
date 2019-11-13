/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taikhoan;

import java.util.Scanner;


public class Account {

    // TODO code application logic here
    
    private int accountID;
    private String accountName;
    private long accountBalance;

    Scanner inp = new Scanner(System.in);

    //get set
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getAccountID() {
        return accountID;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }
     // constructor
    
    public Account() {
    }

    public Account(int accountID, String accountName, long accountBalance) {
        this.accountID = accountID;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }
     // nhap thong tin 
    public Account nhap(Account acc) {
        System.out.print("Nhập account id: ");
        acc.accountID = Integer.parseInt(inp.nextLine());

        System.out.print("Nhập account name: ");
        acc.accountName = inp.nextLine();

        System.out.print("Nhập account balannce: ");
        acc.accountBalance = inp.nextInt();

        return acc;
    }
      // xuất thôg tin 
    public void xuat(Account acc) {
        System.out.println("Account ID: " + acc.accountID);
        System.out.println("Account Name: " + acc.accountName);
        System.out.println("Account Balance: " + acc.accountBalance);
    }
// tim kiem ma id 
    
    public Account timKiem(Account[] acc, int X) {
        for (int i = 0; i < acc.length; i++) {
            if (acc[i].accountID == X) {
                return acc[i];
            }
        }
        return null;
    }
    // rut tien

    public void rutTien(Account acc, int soTienCanRut) {
        if (soTienCanRut < accountBalance) {
            acc.accountBalance -= soTienCanRut;
            System.out.println("Rút tiền thành công, số tiền còn lại là: " + acc.accountBalance);
        } else {
            System.out.println("Rút không thành công, số tiền vượt quá");
        }
    }

    public int tranferAtoB(Account a, Account b) {
        System.out.print("Nhập số tiền cần chuyển: ");
        long soTienChuyen = inp.nextInt();
        if(soTienChuyen < a.accountBalance){
            a.accountBalance -= soTienChuyen;
        } else {
            System.out.println("Số tiền trong tài khoản không đủ");
            return 0;
        }
        b.accountBalance += soTienChuyen;
        return 1;
    }
}
