
 
 
 import java.util.Scanner;
public class Bai3 {
    
    public static void main(String[] args) {

    	Scanner Nhap = new Scanner(System.in);
    	   float a,b,c;
    	System.out.print("Nhap a= ");
    	a= Nhap.nextInt();
    	System.out.print("Nhap b= ");
    	b= Nhap.nextInt();
    	System.out.print("Nhap c= ");
    	c= Nhap.nextInt();
    	
    	if(a==0)
    	  {
    	  	if(b==0 && c==0)
    	  		System.out.print("Phuong trinh vo so nghiem");
    	  	else if(b==0 && c!=0)
    	  		System.out.print("Phuong trinh vo nghiem");
    	  	else 
    	  		System.out.print("Phuong trinh co nghiem x="+(-c/b));
    	
    	  }
    	  else
    	  {
    	  
    	  	float delta;
    	  	delta = (b*b)-4*a*c;
    	  	if (delta < 0)
    	  		 System.out.print("Phuong trinh vo nghiem");
    		else if (delta ==0)
    	  		 System.out.print("Phuong trinh co nghiem kep x= "+(-b/(2*a)));
    	  	else
    	  		 {
    	  		 	System.out.print("Phuong trinh co hai nghiem phan biet");
    	  		 	System.out.print("x1 = "+(-b +Math.sqrt(delta))/(2*a));
    	  		 	System.out.print("x2 = "+(-b -Math.sqrt(delta))/(2*a));
    	  		 	
    	  		 }
    		}	
    	}
    }

