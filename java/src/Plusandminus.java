import java.util.Scanner;
public class Plusandminus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("�п�JA");
		int A=scn.nextInt();
		System.out.println("�п�JB");
		int B=scn.nextInt();
		System.out.println("�A�n+,-,*,/ ?");
		String C=scn.next();
		if(C.equals("+")){
			System.out.println("�ۥ[="+(A+B));
		}else{
			if(C.equals("-")){
				System.out.println("�ۥ[="+(A-B));
			}else{
				if(C.equals("*")){
					System.out.println("�ۥ[="+(A*B));
				}else{
					System.out.println("�ۥ[="+(A/B));
				}
			}
		}
	}
}
