package test_project;
import java.util.Scanner;
public class q2{
	public static void main(String args[]) {
		int n;
		System.out.print("enter a number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int j=0,k=1,t=0;
		for(int i=0;i<n;i++) {
			if(i<2) {
				t=i;	
			}
			else {
				t=j+k;
				j=k;
				k=t;
			}
			System.out.println(t);
		}
	}
}