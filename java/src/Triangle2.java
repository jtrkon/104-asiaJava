import java.util.Scanner;
public class Triangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("�п�J�̵u��");
		int S=scn.nextInt();
		System.out.print("�п�J�̪���");
		int L=scn.nextInt();
		System.out.print("�п�J�Ѿl�@��");
		int M=scn.nextInt();
		
		if(S * S + M * M > L * L){
			System.out.print("�U���T����");
		}else{
			if(S * S + M * M == L * L){
				System.out.print("�����T����");
			}else{
				System.out.print("�w���T����");
			}
		}
		
	}

}
