import java.util.Scanner;
public class Plusandminus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入A");
		int A=scn.nextInt();
		System.out.println("請輸入B");
		int B=scn.nextInt();
		System.out.println("你要+,-,*,/ ?");
		String C=scn.next();
		if(C.equals("+")){
			System.out.println("相加="+(A+B));
		}else{
			if(C.equals("-")){
				System.out.println("相加="+(A-B));
			}else{
				if(C.equals("*")){
					System.out.println("相加="+(A*B));
				}else{
					System.out.println("相加="+(A/B));
				}
			}
		}
	}
}
