
 
 
import java.util.Scanner;
 
public class GiaiThua {
    
    public static void main(String[] args) {
    
    	int n, tich=1;
    	
     Scanner input = new Scanner(System.in);
     
     System.out.print(" Nhap n = ");
     n = input.nextInt();
     
     for(int i=1;i<=n;i++)	
     	
     {
     	tich= tich * i;
     }
     System.out.print("Tich la:  "+tich);
    }
}

