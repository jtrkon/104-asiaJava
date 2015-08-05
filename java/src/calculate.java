import java.util.Scanner;
public class calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入一個整數");
		int A=scn.nextInt();
		System.out.print("再輸入一個整數");
		int B=scn.nextInt();
		int p,m,x;
		p = A + B;
		m = A - B;
		x = A * B;
		System.out.print("和為:"+p+" 差為:"+m+" 積為:"+x);
		
	}

}
