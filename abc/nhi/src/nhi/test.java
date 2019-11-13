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
public class test {

    private int accountID;
    private String accountName;
    private long accountBalance;

    // get set
    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
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
    public test() {
    }

    public test(int accountID, String accountName, long accountBalance) {
        this.accountID = accountID;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    // nhap thong tin
    public test NhapTT(test acc) {
        Scanner nhap = new Scanner(System.in);

        System.out.println("Nhap Id tai khoan: ");
        acc.accountID = Integer.parseInt(nhap.nextLine());

        System.out.println("Nhap ten tai khoan: ");
        acc.accountName = nhap.nextLine();

        System.out.println("Nhap so du trong tai khoan: ");
        acc.accountBalance = nhap.nextInt();
        return acc;
    }
    // xuat thong tin
    public void XuatTT(test acc) {
        System.out.println("Id tai khoan la: " + acc.accountID);
        System.out.println("Ten tai khoan la: " + acc.accountName);
        System.out.println("So tien hien co: " + acc.accountBalance);
    }
 // rut tien
    
    public void Ruttien(test acc,long sotiencanrut){
        if(sotiencanrut > acc.accountBalance)
        {
            System.out.println("Rut tien khong thanh cong, so tien vuot qua!");
        }
        else
        {
            acc.accountBalance = acc.accountBalance - sotiencanrut;
            System.out.println("Rut tien thanh cong. So tien con lai la: "+acc.accountBalance);
        }                  
    }
  // tim id
   
   public test TimId(test [] acc,int x){
       for(int i = 0;i<acc.length;i++)
       {
           if(acc[i].accountID == x){
               return acc[i];
           }
       } return null;
   }
   
   // chuyen tien
   public int TranferAtoB(test a, test b){
       System.out.println("Nhap so tien can chuyen: ");
       long sotiencanchuyen = nhap.nextInt();
       if(sotiencanchuyen < accountBalance)
       {
           a.accountBalance = accountBalance - sotiencanchuyen;
       }
           else{
       
           System.out.println("so tien khong du: ");
            return 0;
       }
      b.accountBalance += sotiencanchuyen; 
       return 1;
   }
} 
        
        
        
        

    
    
 
