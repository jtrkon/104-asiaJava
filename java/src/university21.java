import java.util.Scanner;
public class university21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("�п�J�W�Ǵ��`�Ǥ�");
		int U=scn.nextInt();
		System.out.print("�п�J�U�Ǵ��`�Ǥ�");
		int D=scn.nextInt();
		
		if(U + D >= 22){
			System.out.print("�b��");
		}else{
			System.out.print("�h��");
		}
		
	}

}
