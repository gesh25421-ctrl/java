import java.util.Scanner;
public class Roots{
      public static double discriminent(double a,double b,double c){
          return  Math.pow(b,2)-(4*a*c);
}
	public static void main(String args[]){
	System.out.println("enter a,b and c values:");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt();
		double b=sc.nextInt();
		double c=sc.nextInt();
		double d=discriminent(a,b,c); 
		if(d>=0){
		   double x1=(-b+(Math.sqrt(d)))/2*a;          
           double x2=(-b-(Math.sqrt(d)))/2*a;
           System.out.println(x1+" "+x2);
           }
           else{
           System.out.println("roots does not exist");
           }
           }
           }
        
