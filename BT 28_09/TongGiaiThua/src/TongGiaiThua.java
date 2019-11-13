
 import java.util.Scanner;
 
public class TongGiaiThua {
    
    public static void main(String[] args) {
    	
    	int n, TongGiaiThua = 0;
    		
     Scanner input = new Scanner(System.in);
     
     System.out.print(" Nhap n = ");
     n = input.nextInt();
     
     for(int i=1;i<=n;i++)
     {
     TongGiaiThua += Giaithua(i);
     }
     System.out.print("Tong giai thua la: "+TongGiaiThua);
    }
    
    public static int Giaithua(int n){
    	int ngiaithua = 1;
   
    	 for(int i=1;i<=n;i++)	
     	
     {
     	ngiaithua = ngiaithua *i;
     }
     return ngiaithua;
    }
}
