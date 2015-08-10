import java.util.Scanner;
public class forloop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("½Ð¿é¤J¼h¼Æ");
		int n=scn.nextInt();
		int i;
		int j;
		int k;
		
		for(i=0;i<n;i++){
			System.out.println();
			for(j=0;j<=n-i-1;j++){
				System.out.print(" ");
			}for(k=0;k<=2*i;k++){
				System.out.print("*");
			}
		}
		
	}

}
