import java.util.Scanner;
public class Gradeaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("�п�J��妨�Z");
		int C=scn.nextInt();
		System.out.print("�п�J�^�妨�Z");
		int E=scn.nextInt();
		System.out.print("�п�J�ƾǦ��Z");
		int M=scn.nextInt();
		int P;
		int A;
		P = C + E + M;
		A = P / 3;
		
		System.out.print("���Z�`�M��:"+P+" �������Z��:"+A);
		
	}

}
