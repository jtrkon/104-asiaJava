import java.util.Scanner;
public class Ifcomand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("�п�JA");
		int A=scn.nextInt();
		System.out.println("�п�JB");
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
