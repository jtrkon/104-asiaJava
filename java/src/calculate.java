import java.util.Scanner;
public class calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("�п�J�@�Ӿ��");
		int A=scn.nextInt();
		System.out.print("�A��J�@�Ӿ��");
		int B=scn.nextInt();
		int p,m,x;
		p = A + B;
		m = A - B;
		x = A * B;
		System.out.print("�M��:"+p+" �t��:"+m+" �n��:"+x);
		
	}

}
