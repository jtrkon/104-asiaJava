import java.util.Scanner;
public class drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("�п�J���Ʃ��W��");
		String N=scn.next();
		System.out.print("�п�J���ƦW��");
		String D=scn.next();
		System.out.print("�п�J����");
		int M=scn.nextInt();
		
		if(N.equals("���Q�P")){
			System.out.print("���O");
		}else{
			if(M >= 45){
				System.out.print("���O");
			}else{
				if(D.equals("���") || D.equals("�@��")){
					System.out.print("�O");
				}else{
					System.out.print("���O");
				}
			}
		}
		
	}

}
