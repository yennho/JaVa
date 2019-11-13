
 import java.util.Scanner;
 
public class Bai2 {
    
    public static void main(String[] args) {
    	float s=1;
    	int n;
    	Scanner Nhap = new Scanner(System.in);
    	System.out.print("Nhap n = ");
        n =Nhap.nextInt();
    	for(int i=2;i<=n;i++)
    	{
    		s= s+1/(float)i;
    	}
    	System.out.print("Tong =: "+s);
    	
    }
}
