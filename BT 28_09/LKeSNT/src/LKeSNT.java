


import java.util.Scanner;

public class LKeSNT {
    
    public static void main(String[] args) {
    	
    		int m,n;
     
     Scanner input = new Scanner(System.in);
     
     System.out.print(" Nhap m = ");
     m = input.nextInt();
     
     System.out.print(" Nhap n = ");
     n =input.nextInt();
     
     System.out.print("Cac so nguyen to la: ");
     
     for(int i = m;i<=n;i++)
     {
     	
     	if(KTSNT(i)== 1) System.out.print(i + " ");
     } 
     
    }
    
    public static int  KTSNT(int a){
    	int dem =0;
    		
    	for(int i=2;i<=a;i++)
    	{
    		if (a%i == 0) dem++;
    	}
    	if(dem == 1) return 1;
    	else return 0;
    	
    }
}
