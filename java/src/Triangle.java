import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("�п�J�T���γ̵u���");
		int S=scn.nextInt();
		System.out.println("�п�J�T���γ̪����");
		int L=scn.nextInt();
		System.out.println("�п�J�ѤU�@�����");
		int M=scn.nextInt();
		
		if(S+M>L && L-M<S){
			System.out.println("�O");
		}else{
			System.out.println("�O");
		}
		
	}

}
