import java.util.Scanner;
public class Vegetarion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("�п�J���ѬO�P���X");
		int D=scn.nextInt();
		System.out.println("�п�J���Ѥ���O�X��");
		int M=scn.nextInt();
		
		if(M == 7 || M == 17 || M == 27){
			System.out.println("���ѦY��");
		}else{
			if(D == 2 || D == 4 || D == 6){
				System.out.println("���ѦY��");
			}else{
				System.out.println("���ѦY��");
			}
		}
		
	}

}
