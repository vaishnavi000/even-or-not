package test_project;
import java.util.Scanner;
public class q3{
	public static void main(String args[]) {
		int a,b;
		int r=0,i=0,k=0,p=0,c=0;
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		for(i=a;i<=b;i++) {
			r=0;
			k=i;
			while(k!=0) {
				p=k%10;
				r+=p*p*p;
				k=k/10;
			}
			if(i==r) {
					System.out.print(i+" ");
					c++;
			}
		}
		if(c==0){
			System.out.println("No Amstrong number in given range");
		}
	}
}