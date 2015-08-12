import java.util.Scanner;
public class wedpractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入一個整數");
		int a=scn.nextInt();
		long sum=1;
		int i=1;
		
		while(i<=a){
			sum = sum * i;
			i++;
		}System.out.print(a+"! = "+sum);
		
	}

}
