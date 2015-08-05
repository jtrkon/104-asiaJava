import java.util.Scanner;
public class Gradeaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入國文成績");
		int C=scn.nextInt();
		System.out.print("請輸入英文成績");
		int E=scn.nextInt();
		System.out.print("請輸入數學成績");
		int M=scn.nextInt();
		int P;
		int A;
		P = C + E + M;
		A = P / 3;
		
		System.out.print("成績總和為:"+P+" 平均成績為:"+A);
		
	}

}
