package test_project;
import java.util.Scanner;
import java.lang.Math;
public class q4{
	public static void main(String args[]) {
		int a,b;
		int r=0,i=0,k=0,p=0,c=0,q=0;
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		b=s.nextInt();
		for(i=1;i<=b;i++) {
			r=0;
			k=i;
			q=d(k);
			while(k!=0) {
				p=k%10;
				r+=Math.pow(p,q);
				k=k/10;
			}
			if(i==r) {
					System.out.print(i+" ");
					c++;
			}
		}
		if(c==0){
			System.out.println("No such number in given range");
		}
	}
	
	public static int d(int x){
		int c=0;
		while(x!=0) {
			x=x/10;
			c++;
		}
		return c;
		
	}
}