package test_project;
import java.util.Scanner;
import java.lang.Math;
public class q5{
	public static void main(String args[]) {
		long n,r=0,k=0;
		int i=0;
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n!=0) {
			r=n%10;
			n=n/10;
			if(i==0) {
				k=r;
				i++;
			}
		}
		System.out.println("first digit:"+Math.abs(r)+"  "+"last digit:"+Math.abs(k));			
	}
}