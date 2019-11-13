 import java.util.Scanner;
 
public class Bai1 
{
    
    public static void main(String[] args){
    	 	int a,b,c;
    	 	Scanner input= new Scanner(System.in);
    	 	System.out.print("Nhap so a = ");
    	 	a= input.nextInt(); 
    	 	System.out.print("Nhap so b = ");  
    	 	b= input.nextInt();
    	 	System.out.print("Nhap so c = ");
    	 	c= input.nextInt();
    	 	
    	 	int max =a ;
    	 	if (b > max) max =b;
    	 	if (c > max) max = c;
    	 	
    	 	System.out.print("Gia tri lon nhat la: "+max);	
    	
    
    	
    }
}
