  

package Employee;

import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private long basic_sal;
    private String email;
    private String phone;

    //get set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasic_sal() {
        return basic_sal;
    }

    public void setBasic_sal(long basic_sal) {
        this.basic_sal = basic_sal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    } 
    
    // nhap thong tin
    public void NhapThongTin(){
    Scanner nhap = new Scanner(System.in);

    System.out.print("Nhap id: ");
    this.id = Integer.parseInt(nhap.nextLine());
    
    System.out.print("Nhap ten: ");
    this.name = nhap.nextLine();
    //nhap.nextLine();
    
    System.out.print("Nhap luong co ban: ");
    this.basic_sal =Integer.parseInt(nhap.nextLine());
    
    System.out.print("Nhap email: ");
    this.email = nhap.nextLine();
            
    
    System.out.print("Nhap so dien thoai: ");
    this.phone = nhap.nextLine();
    }
    //xuat thong tin
    
    public void XuatThongTin(){
        System.out.println("id la: "+this.id); 
        System.out.println("Ho ten: "+this.name);
        System.out.println("Luong co ban: "+this.basic_sal);
        System.out.println("Email: "+this.email);
        System.out.println("So dien thoai:" +this.phone);           
    }
    //tinh tog luong
    
    public long Sum_of_Sale(int index){
        long Luongtong;
        {
            Luongtong = basic_sal * index;
        } 
        return Luongtong;
    } 
    
    
    
    
    //xuat thong tin tham so la employee
      public void XuatTT(Employee ep)
    {
        System.out.println("************************");
        System.out.println(" Id: " + ep.getId());
        System.out.println(" Tên: " + ep.getName());
        System.out.println(" Luong co ban:" + ep.getBasic_sal());
        System.out.println(" Email: " + ep.getEmail());
        System.out.println(" Số điện thoại: " + ep.getPhone());
    }     
    }
      





