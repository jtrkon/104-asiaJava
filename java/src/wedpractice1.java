import java.util.Scanner;
public class wedpractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入一整數");
		int a=scn.nextInt();
		long sum=1;
		int i;
		for(i=1;i<=a;i++){
			sum=sum*i;
		}System.out.print(a+"! = "+sum);   //63以上爆掉
		
	}

}
