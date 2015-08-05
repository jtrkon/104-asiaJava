import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入三角形最短邊長");
		int S=scn.nextInt();
		System.out.println("請輸入三角形最長邊長");
		int L=scn.nextInt();
		System.out.println("請輸入剩下一邊邊長");
		int M=scn.nextInt();
		
		if(S+M>L && L-M<S){
			System.out.println("是");
		}else{
			System.out.println("是");
		}
		
	}

}
