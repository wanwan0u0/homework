import java.util.Scanner;

public class A1103302_0224_1{
	public static void main(String[] args){
		long n;
		Scanner input=new Scanner(System.in);
		System.out.print("請輸入整數:");
		n=input.nextLong();
		if(n%2==0){
			System.out.printf("%d是偶數%n",n);
		}
		else{
			System.out.printf("%d是奇數%n",n);
		}
	}
}
