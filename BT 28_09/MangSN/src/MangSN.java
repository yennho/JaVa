
 
 import java.util.Scanner;
 
public class MangSN {
    
    public static void main(String[] args) {
    	
   	int n;
    
    Scanner input = new Scanner(System.in);
     
    System.out.print(" Nhap n = ");
     n = input.nextInt();
     
     int []a= new int[n];
     for(int i=0;i<n;i++)
     {
     	System.out.print("a["+i+"]=");
     	a[i]=input.nextInt();
     }
     //
     System.out.print("So lon thu hai trong mang: "+solonthuhai(a,n));
    }
     
     public static int solonthuhai(int a[],int n){
     
     	int max1= a[0];
         for(int i=0;i<n;i++)
         {
         	if (a[i]>= max1)
         		max1=a[i];
         }
         
         {
         	if(max1 ==a[1]) 
         	a[1]= -999; 
 
         }
         
         int max2= a[0];
         for(int i=0;i<n;i++)
         {
         	if ((a[i]> max2) && (a[i]!=max1))
         		max2=a[i];
         }
     return max2;
    }
    
}
