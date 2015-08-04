import java.util.Scanner;
public class Ifcomand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入A");
		int A=scn.nextInt();
		System.out.println("請輸入B");
		int B=scn.nextInt();
		int C=A-B;
		if(C>0){
			System.out.println(A+">"+B);
		}else{
			if(C<0){
				System.out.println(A+"<"+B);
			}else{
				System.out.println(A+"="+B);
			
			}
		}
		
	}

}
