
package Employee;
import java.util.Scanner;


public class Service {
    private Employee [] Array;

    public Employee[] getArray() {
        return Array;
    }
    
    public Employee Nhap()
    {
       Employee ep = new Employee();
       ep.NhapThongTin();
       return ep;
    }
    // nhap nhan vien
    
    public void Nhapmang()
    {
        System.out.println("Nhap so luong nhan vien: ");
        Scanner nhap = new Scanner(System.in);
        
        int n = nhap.nextInt();
        Array = new Employee[n];
        for(int i = 0;i<n;i++)
        {
            Array[i] = new Employee();
            Array[i].NhapThongTin();
        }       
    }
    //xuat mang   
    public void XuatMang()
    {
        System.out.println("----------Thong tin nhan vien:--------------");
         for(int i = 0; i< Array.length; i++)
        {
            
            Array[i].XuatThongTin();
        }       
        
    }
    
   //tim kiem 
public Employee Timkiem(Employee[]m ,int id){
        for (int i = 0; i < m.length; i++)
        {
            if (m[i].getId() == id)
                return Array[i];
        }
        return null;
}

public void XuatTTTimKiem(Employee m)
{
    m.XuatTT(m);
} 
}


    
   
    
