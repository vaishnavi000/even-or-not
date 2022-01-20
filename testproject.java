package test_project;
import java.util.Scanner;
public class testproject {

	public static void main(String[] args) {
		int n;
		System.out.print("enter a number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n%2==0){
			System.out.println("Given number "+n+" is even");
		}
		else {
			System.out.println("Given number "+n+" is odd");
		}
	}

}
