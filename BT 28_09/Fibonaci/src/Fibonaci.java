

 import java.util.Scanner;
public class Fibonaci {
    
    public static void main(String[] args) {
    	
    		int n,tam;
    	int a[] = new int [100];
    	
    	a[1]= 1;
    	a[2]= 1;
    	
    Scanner input = new Scanner(System.in);
    	 
    	  System.out.print(" Nhap n = ");
          n = input.nextInt();
          
          System.out.print("1 1");
          for(int i=1;i<=n-2;i++)
          {
          	tam = a[i] + a[i+1];
          	System.out.print(" "+tam);
          	a[i+2]=tam;         
           }
    }
}
