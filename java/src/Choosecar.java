import java.util.Scanner;
public class Choosecar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("�п�J�ɨ�");
		int D=scn.nextInt();
		System.out.println("�п�J����b�ߤ��b�Z");
		int R=scn.nextInt();
		System.out.println("�п�J���L�ؤo");
		int S=scn.nextInt();
		
		if(D>=43 && R>=130 && S==12){
			System.out.println("�O");
		}else{
			System.out.println("���O");
		}
		
	}

}
