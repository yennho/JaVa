

 
 import java.util.Scanner;
public class Bai4 {
    
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	int n, dem =0;
		    	
    	System.out.print("Nhap so n = ");
    	n = input.nextInt();
    	
    	for(int i=2;i<=n;i++)
    	{
    		if (n%i == 0) 
                    dem++;
    	}
    	if(dem == 1) System.out.print(n + " la so nguyen to");
    	else System.out.print(n + " khong phai la so nguyen to");
    }
}
